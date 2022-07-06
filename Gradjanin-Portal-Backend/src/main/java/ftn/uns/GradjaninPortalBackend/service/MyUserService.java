package ftn.uns.GradjaninPortalBackend.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ftn.uns.GradjaninPortalBackend.Repository.UserRepository;
import ftn.uns.GradjaninPortalBackend.dto.RegisterUserDTO;
import ftn.uns.GradjaninPortalBackend.model.Role;
import ftn.uns.GradjaninPortalBackend.model.user.User;


@Service
public class MyUserService {
	
	
	@Autowired
	private UserRepository ur;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public Boolean save(RegisterUserDTO rudto) {
		
		User u = new User();
		
		u.setId(new Long(++UserRepository.user_counter));
		u.setFirstName(rudto.getFirstName());
		u.setLastName(rudto.getLastName());
		u.setUsername(rudto.getUsername());
		u.setPassword(encoder.encode(rudto.getPassword()));
		u.setMobilni(rudto.getMobilni());
		u.setJmbg(rudto.getJmbg());
		u.setFiksni(rudto.getFiksni());
		u.setEmail(rudto.getEmail());
		u.setEnabled(true);
		
		Role r = new Role();
		r.setName("ROLE_USER");
		
		ArrayList<Role> roles = new ArrayList<Role>();
		roles.add(r);
		
		u.setRoles(roles);
		
		u.setLastPasswordResetDate(Timestamp.valueOf("2017-10-01 21:58:58.508"));
        
		
		ur.save(u);
		
		return true;
		
	}
	
	
//	public int loadInterId(String jmbg) throws Exception {
//		Optional<User> mus = ur.findByJmbg(jmbg);
//		return mus.get().getBrInt();
//		
//	}
//
//	public int loadAndAddInterId(String jmbg) throws Exception {
//		String ms = mur.loadMyUser(jmbg);		
//		MyUser unm = jaxB.unmarshall(MyUser.class, ms);
//		unm.setBrInt(unm.getBrInt()+1);
//		String newUser = jaxB.marshall(MyUser.class, unm);
//		mur.saveMyUser(newUser, jmbg);
//		return unm.getBrInt();
//		
//	}
//
//	
//	public int loadPotvrdaId(String jmbg) throws Exception {
//		MyUser mus = loadUser(jmbg);
//		return mus.getBrPot();
//		
//	}
//	public int loadAndAddPotvrdaId(String jmbg) throws Exception {
//		MyUser mus = loadUser(jmbg);
//		mus.setBrPot(mus.getBrPot()+1);
//		String newUser = jaxB.marshall(MyUser.class, mus);
//		mur.saveMyUser(newUser, jmbg);
//		return mus.getBrPot();
//		
//	}

}
