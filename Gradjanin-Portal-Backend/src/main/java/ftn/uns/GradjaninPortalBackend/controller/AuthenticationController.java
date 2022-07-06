package ftn.uns.GradjaninPortalBackend.controller;

import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import ftn.uns.GradjaninPortalBackend.dto.JwtAuthenticationRequest;
import ftn.uns.GradjaninPortalBackend.dto.RegisterUserDTO;
import ftn.uns.GradjaninPortalBackend.dto.UserRequest;
import ftn.uns.GradjaninPortalBackend.dto.UserTokenState;
import ftn.uns.GradjaninPortalBackend.dto.ValidationAccountTokenDTO;
import ftn.uns.GradjaninPortalBackend.model.user.User;
import ftn.uns.GradjaninPortalBackend.service.MyUserService;
import ftn.uns.GradjaninPortalBackend.service.UserService;
import ftn.uns.GradjaninPortalBackend.util.TokenUtils;

@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthenticationController {

	@Autowired
	private TokenUtils tokenUtils;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserService userService;

	@Autowired
	private MyUserService mus;

	// Prvi endpoint koji pogadja korisnik kada se loguje.
	// Tada zna samo svoje korisnicko ime i lozinku i to prosledjuje na backend.
	@PostMapping("/login")
	public ResponseEntity<UserTokenState> createAuthenticationToken(
			@RequestBody JwtAuthenticationRequest authenticationRequest, HttpServletResponse response) {

		System.out.println("USOO SINE");

//		System.out.println(authenticationRequest.getPassword()+authenticationRequest.getUsername());
		// Ukoliko kredencijali nisu ispravni, logovanje nece biti uspesno, desice se
		// AuthenticationException
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
				authenticationRequest.getUsername(), authenticationRequest.getPassword()));

		// Ukoliko je autentifikacija uspesna, ubaci korisnika u trenutni security
		// kontekst
		SecurityContextHolder.getContext().setAuthentication(authentication);

		// Kreiraj token za tog korisnika
		User user = (User) authentication.getPrincipal();
//		System.out.println("Principal"+((User) authentication.getPrincipal()).getUsername() + " " +((User) authentication.getPrincipal()).getPassword());
		String jwt = tokenUtils.generateToken(user.getUsername(), user.getRolesToString());
		int expiresIn = tokenUtils.getExpiredIn();

		// Vrati token kao odgovor na uspesnu autentifikaciju
		return ResponseEntity.ok(new UserTokenState(jwt, expiresIn));
	}

	// Endpoint za registraciju novog korisnika
	@PostMapping("/signup")
	public ResponseEntity<User> addUser(@RequestBody UserRequest userRequest, UriComponentsBuilder ucBuilder) {

		User existUser = this.userService.findByUsername(userRequest.getUsername());

		if (existUser != null) {
			System.err.println("HAHA");
		}

		User user = this.userService.save(userRequest);

		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	// Endpoint za registraciju novog korisnika
	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Boolean> register(@RequestBody RegisterUserDTO ru) {

		return new ResponseEntity<Boolean>(mus.save(ru), HttpStatus.OK);

	}

//	@GetMapping("/isValid/{us}")
//	public CompletableFuture<ResponseEntity<ValidationAccountTokenDTO>> isValid(@PathVariable String us) {
//
//		return  mus.isActivate(us).thenApplyAsync(ResponseEntity::ok);
//
//	}

//	@GetMapping("/validate/{us}")
//	public CompletableFuture<ResponseEntity<Boolean>> validate(@PathVariable String us) {
//
//		return  mus.validateAcc(us).thenApplyAsync(ResponseEntity::ok);
//
//	}

}