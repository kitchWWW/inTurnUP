package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.Scanner;

@RestController
public class GreetingController {

    private static final String template = "Hello World!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="JSON_CALLBACK", defaultValue="callback") String callback) {
        Greeting gr = new Greeting(counter.incrementAndGet(), template);
        return callback+"("+gr+")";
    }

    @RequestMapping("/data")
    public String greeting(
    	@RequestParam(value="callback", defaultValue="JSON_CALLBACK") String callback,
    	@RequestParam(value="database", defaultValue="1") String database
    	) {
    	String data = "";
    	String res = System.getProperty("user.dir")+"/res/";
    	System.out.println("Directory: "+res);
    	Scanner s = null;
    	try{
    		s = new Scanner(new BufferedReader(new FileReader(res+"in.txt")));
    		while(s.hasNext()){
    			String in = s.next();
    			data += " "+in;
				System.out.println(in);

    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		if (s!=null){
			s.close();
		}
        return callback+"("+data+")";
    }



}
