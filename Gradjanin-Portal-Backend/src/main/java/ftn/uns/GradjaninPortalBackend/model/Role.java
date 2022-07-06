package ftn.uns.GradjaninPortalBackend.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    Long id;
    
    String name;


    @Override
    public String getAuthority() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
