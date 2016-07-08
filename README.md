# inTurnUP

Hints so far about project:
* mobile
* esri

General
-------

Have both a version of the site requireing XSS, and one requiring us to make a bunch of god awful json conversions inside of Java. I'm sure there is a method somewhere that will do it for us nicely, but I just haven't found it yet.

Back-End Overview
-----------------
Backend Spring/ Java server.
* Invoke: `cd back/`, then enter: `mvn spring-boot:run`
* Can return java objects
* These are translated to JSON
* To see JSON, go to: 'http://localhost:8080/greeting', and replace greeting with the name of your query

Front-End Overview
-------------------
Front end AngularJS / HTML
* Invoke: `cd front/` Enter: `npm start`
* Can display pretty pictures
* Also do ng-model stuff
* To see website running, go to: 'http://localhost:8000/index.html'



