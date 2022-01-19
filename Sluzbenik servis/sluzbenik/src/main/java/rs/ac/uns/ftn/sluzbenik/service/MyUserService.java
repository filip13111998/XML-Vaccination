package rs.ac.uns.ftn.sluzbenik.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.myuser.MyUser;
import rs.ac.uns.ftn.sluzbenik.jaxb.JaxB;
import rs.ac.uns.ftn.sluzbenik.repository.MyUserRepository;

@Service
public class MyUserService {

    @Autowired
    private MyUserRepository myUserRepository;

    @Autowired
    private JaxB jaxB;

    public void saveUser(MyUser mu) throws Exception {
        String userXML = jaxB.marshall(MyUser.class,mu);

        myUserRepository.saveMyUser(userXML,mu.getJmbg());
    }

    public MyUser loadUser(String jmbg) throws Exception {

        String user = myUserRepository.loadMyUser(jmbg);
        return jaxB.unmarshall(MyUser.class, user);
    }


    public int loadInterId(String jmbg) throws Exception {
        MyUser user = loadUser(jmbg);
        return user.getBrInt();

    }

    public int loadAndAddInterId(String jmbg) throws Exception {
        String user = myUserRepository.loadMyUser(jmbg);
        MyUser userLoaded = jaxB.unmarshall(MyUser.class, user);
        userLoaded.setBrInt(userLoaded.getBrInt()+1);
        String newUser = jaxB.marshall(MyUser.class, userLoaded);
        myUserRepository.saveMyUser(newUser, jmbg);
        return userLoaded.getBrInt();

    }


    public int loadPotvrdaId(String jmbg) throws Exception {
        MyUser user = loadUser(jmbg);
        return user.getBrPot();

    }
    public int loadAndAddPotvrdaId(String jmbg) throws Exception {
        MyUser user = loadUser(jmbg);
        user.setBrPot(user.getBrPot()+1);
        String newUser = jaxB.marshall(MyUser.class, user);
        myUserRepository.saveMyUser(newUser, jmbg);
        return user.getBrPot();

    }
}