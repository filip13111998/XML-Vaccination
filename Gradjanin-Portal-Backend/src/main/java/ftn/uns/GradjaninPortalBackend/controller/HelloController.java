package ftn.uns.GradjaninPortalBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {


    @GetMapping(value = "/hel")
    public String returnStr(){
        return "AJDE";
    }

}
