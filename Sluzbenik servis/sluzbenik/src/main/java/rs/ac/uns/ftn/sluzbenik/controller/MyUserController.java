package rs.ac.uns.ftn.sluzbenik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.ac.uns.ftn.myuser.MyUser;
import rs.ac.uns.ftn.sluzbenik.service.MyUserService;

@RestController
@RequestMapping(value = "user")
public class MyUserController {

    @Autowired
    private MyUserService myUserService;

    @GetMapping("/a")
    public String basic() throws Exception {

        return "NMSIOTAAAA";
    }

    @PostMapping(consumes =  MediaType.APPLICATION_XML_VALUE)
    public String saveMyUser(@RequestBody MyUser user) throws Exception {
        myUserService.saveUser(user);
        return "user saved successfully -- "+user;
    }

    @GetMapping(value = "/{jmbg}")
    public MyUser loadMyUser(@PathVariable("jmbg") String jmbg) throws Exception {

        return myUserService.loadUser(jmbg);
    }
}
