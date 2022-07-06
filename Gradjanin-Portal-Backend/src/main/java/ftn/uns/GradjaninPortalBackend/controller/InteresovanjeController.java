package ftn.uns.GradjaninPortalBackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.uns.GradjaninPortalBackend.service.InteresovanjeService;

@RestController
@RequestMapping(value = "/all/inter",consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
public class InteresovanjeController {
	
	@Autowired
	private InteresovanjeService is;
	
	@PostMapping(value = "/hi")
    public String getXML(@RequestBody String str){
		System.out.println("STRING JE " + str);
        return "HIHIHI";
    }
	
	@PostMapping(value = "/save")
    public ResponseEntity<Boolean> save(@RequestBody String str){
		Boolean b=false;
		System.out.println(str);
		try {
			b=is.saveInter(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new ResponseEntity<Boolean>(b, HttpStatus.CREATED);
    }

}
