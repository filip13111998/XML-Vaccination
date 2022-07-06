package ftn.uns.GradjaninPortalBackend.Repository;

import ftn.uns.GradjaninPortalBackend.model.Role;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleRepository {


    private List<Role> roles = new ArrayList<>();

    @PostConstruct
    public void initialize(){
        Role ROLE_USER = new Role();
        ROLE_USER.setName("ROLE_USER");
        Role ROLE_MED = new Role();
        ROLE_MED.setName("ROLE_MED");
        roles.add(ROLE_USER);
        roles.add(ROLE_MED);
    }

    public Role findByName(String name) {

        Role r = roles.stream().filter(e->e.getName().equals(name)).findFirst().orElse(null);
        return r;
    }

    public Role findById(Long id) {

        Role r = roles.stream().filter(e->e.getId().equals(id)).findFirst().orElse(null);
        return r;
    }
}
