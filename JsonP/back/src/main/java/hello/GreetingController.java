package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello World!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    
    public String greeting(@RequestParam(value="callback", defaultValue="callback") String callback) {
        Greeting gr = new Greeting(counter.incrementAndGet(), template);
        return callback+"("+gr+")";
    }
}
