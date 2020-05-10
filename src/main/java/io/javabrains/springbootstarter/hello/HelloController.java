package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/*hey spring this is the class that deals with providing http responses to http requests*/
public class HelloController {

    @RequestMapping("/hello")  /*RequestMapping by default it Get method of Http request*/
    public String sayHi(){
        return "Hi";
    }

}
