package rs.ac.uns.ftn.sluzbenik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ac.uns.ftn.sluzbenik.myuser.MyUser;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.service.MyUserService;

@RestController
@RequestMapping(value = "user")
public class MyUserController {

    @Autowired
    private MyUserService myUserService;

    @Autowired
    private JaxB jaxB;

    @PostMapping(consumes =  MediaType.APPLICATION_XML_VALUE)
    public String saveMyUser(@RequestBody MyUser user) throws Exception {
        myUserService.saveUser(user);
        return "user saved successfully -- "+user;
    }

    @GetMapping(value = "/{jmbg}", produces = MediaType.APPLICATION_XML_VALUE)
    public MyUser loadMyUser(@PathVariable("jmbg") String jmbg) throws Exception {

        return myUserService.loadUser(jmbg);
    }

    @GetMapping(value = "/login}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<MyUser> login(@RequestParam(name = "jmbg") int jmbg, @RequestParam(name = "sifra") String sifra) throws Exception {
        MyUser myUser = myUserService.login(jmbg,sifra);
        if (myUser!=null){
            return new ResponseEntity<MyUser>( myUser, HttpStatus.OK);
        }else {
            return new ResponseEntity<MyUser>(new MyUser(), HttpStatus.NOT_FOUND);
        }
    }
}
