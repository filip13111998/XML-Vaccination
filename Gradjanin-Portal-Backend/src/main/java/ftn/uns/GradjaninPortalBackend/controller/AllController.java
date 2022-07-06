package ftn.uns.GradjaninPortalBackend.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/all",consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE )
public class AllController {
	@GetMapping(value = "/hi")
    public String returnStr(){
        return "asdHIHIHI";
    }
	
	@PostMapping(value = "/xml")
    public String getXML(@RequestBody String str){
		System.out.println("STRING JE " + str);
        return "HIHIHI";
    }
}
