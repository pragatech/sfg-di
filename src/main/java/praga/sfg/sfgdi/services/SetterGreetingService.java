package praga.sfg.sfgdi.services;

import org.springframework.stereotype.Service;

public class SetterGreetingService implements GreetingService{
    @Override
    public String greetingService() {
        return "Hello World - Setter";
    }
}
