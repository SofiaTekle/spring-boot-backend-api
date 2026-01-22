package se.iths.sofia.springbootproj.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String helloFromService() {
        return "Hello from Homeservice";
    }
}
