package praga.sfg.sfgdi.services;

import org.springframework.stereotype.Service;

//@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String greetingService() {
        return "Hello World - Constructor";
    }
}
