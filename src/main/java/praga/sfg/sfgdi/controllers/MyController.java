package praga.sfg.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import praga.sfg.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.greetingService();
    }
}
