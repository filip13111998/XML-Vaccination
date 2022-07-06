package ftn.uns.GradjaninPortalBackend.service;

import ftn.uns.GradjaninPortalBackend.model.Role;

import java.util.List;

public interface RoleService {
    Role findById(Long id);
    List<Role> findByName(String name);
}
