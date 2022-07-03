package rs.ac.uns.ftn.sluzbenik.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.sluzbenik.myuser.MyUser;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.repository.MyUserRepository;

@Service
public class MyUserService {

    @Autowired
    private MyUserRepository myUserRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private JaxB jaxB;

    public void saveUser(MyUser mu) throws Exception {
        mu.setSifra(bCryptPasswordEncoder.encode(mu.getSifra()));
        String userXML = jaxB.marshall(MyUser.class,mu);

        myUserRepository.saveMyUser(userXML,mu.getJmbg());
    }

    public MyUser loadUser(String jmbg) throws Exception {

        String user = myUserRepository.loadMyUser(jmbg);
        return jaxB.unmarshall(MyUser.class, user);
    }



    public int loadAndAddPotvrdaId(String jmbg) throws Exception {
        MyUser user = loadUser(jmbg);
        user.setBrPot(user.getBrPot()+1);
        String newUser = jaxB.marshall(MyUser.class, user);
        myUserRepository.saveMyUser(newUser, jmbg);
        return user.getBrPot();

    }

    public MyUser login(int jmbg, String sifra) throws Exception {
        MyUser user =  loadUser(Integer.toString(jmbg));
        if(user.getSifra().equals(sifra)){
            return user;
        }else{
            return null;
        }

    }
}