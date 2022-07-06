package ftn.uns.GradjaninPortalBackend.Repository;

import ftn.uns.GradjaninPortalBackend.model.Role;
import ftn.uns.GradjaninPortalBackend.model.user.User;
import ftn.uns.GradjaninPortalBackend.db.EntityManager;
import ftn.uns.GradjaninPortalBackend.jaxb.JaxB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.xmldb.api.modules.XMLResource;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class UserRepository {

    private String collectionId = "/db/users";
	
    @Autowired
	private EntityManager entityManager;
	
    @Autowired
    private JaxB parser;
    
    @Autowired
    private PasswordEncoder encoder;
    
    
    public static Integer user_counter=2;
    
    @PostConstruct
    public void initialize() throws JAXBException, Exception{
        User u1 = new User();
        
        u1.setId(1l);
        u1.setUsername("usr1");
        u1.setPassword(encoder.encode("123"));
        List<Role> roles1 = new ArrayList<>();
        Role r1 = new Role();
        r1.setName("ROLE_USER");
        roles1.add(r1);
        u1.setRoles(roles1);
        u1.setEnabled(true);
        u1.setJmbg("444444");
        u1.setLastPasswordResetDate(Timestamp.valueOf("2017-10-01 21:58:58.508"));
        
        saveMyUser(parser.marshall(User.class,u1),1+"");
        
//        System.out.println(u1.getUsername() + "---" + u1.getPassword());
        
        User u2 = new User();
        u1.setId(2l);
        u2.setUsername("med1");
        u2.setPassword(encoder.encode("123"));
        List<Role> roles2 = new ArrayList<>();
        Role r2 = new Role();
        r2.setName("ROLE_MED");
        roles2.add(r2);
        u2.setRoles(roles2);
        u2.setEnabled(true);
        u2.setJmbg("121212");
        u2.setLastPasswordResetDate(Timestamp.valueOf("2017-10-01 21:58:58.508"));
        
        
        
        saveMyUser(parser.marshall(User.class,u2),2+"");
        
        
//        users.add(u1);
//        users.add(u2);
    }

	public void saveMyUser(String text,String id) throws Exception {
		
		entityManager.storeFromText(collectionId, id, text);
		
	}
	
	public User loadOneUser(String id) throws Exception {
		
		XMLResource res = entityManager.load(collectionId, id);
	
		String s = (String) res.getContent();
	
		User usr = parser.unmarshall(User.class, s);
	
//		users.add(usr);
		
		return usr;

	}
	
	@PostConstruct
	public List<User> findAll() {

		ArrayList<User> users = new ArrayList<User>();
		
		for(int i = 1 ; i <= user_counter ; i++) {
			
			User user = new User();
			try {
				user = loadOneUser(i+"");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			users.add(user);
		}
		
		users.forEach(e->System.out.println(e.getUsername()+ "-" + e.getRolesToString()));
		
        return users;
    }

    public User findByUsername(String username) {

        User us = findAll().stream().filter(e->e.getUsername().equals(username)).findFirst().orElse(null);
		
        return us;
        
    }

    public Optional<User> findById(Long id) {

        Optional<User> us = findAll().stream().filter(e->e.getId().equals(id)).findFirst();
		
        return us;
    }
    
    public Optional<User> findByJmbg(String jmbg) {

        Optional<User> us = findAll().stream().filter(e->e.getJmbg().equals(jmbg)).findFirst();
		
        return us;
    }

//    public List<User> findAll() {
//
//
//        return users;
//    }

    public User save(User us) {

    	String text="";
		try {
			text = parser.marshall(User.class, us);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			entityManager.storeFromText(collectionId, user_counter+"", text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return us;
    }
}
