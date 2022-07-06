package ftn.uns.GradjaninPortalBackend.service;

import ftn.uns.GradjaninPortalBackend.dto.UserRequest;
import ftn.uns.GradjaninPortalBackend.model.user.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
    User save(UserRequest userRequest);
}