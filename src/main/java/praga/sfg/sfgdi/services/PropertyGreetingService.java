package praga.sfg.sfgdi.services;

import org.springframework.stereotype.Service;

public class PropertyGreetingService implements GreetingService{
    @Override
    public String greetingService() {
        return "Hello World - Property";
    }
}
