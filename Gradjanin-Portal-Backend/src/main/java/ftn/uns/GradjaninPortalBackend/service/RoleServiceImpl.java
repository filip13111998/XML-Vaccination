package ftn.uns.GradjaninPortalBackend.service;

import ftn.uns.GradjaninPortalBackend.Repository.RoleRepository;
import ftn.uns.GradjaninPortalBackend.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findById(Long id) {
        Role auth = this.roleRepository.findById(id);
        return auth;
    }

    @Override
    public List<Role> findByName(String name) {
        Role rol = this.roleRepository.findByName(name);
        List<Role> roles = new ArrayList<>();
        roles.add(rol);
        return roles;
    }


}
