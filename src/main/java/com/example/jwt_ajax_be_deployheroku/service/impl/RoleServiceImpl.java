package com.example.jwt_ajax_be_deployheroku.service.impl;

import com.example.jwt_ajax_be_deployheroku.model.Role;
import com.example.jwt_ajax_be_deployheroku.model.RoleName;
import com.example.jwt_ajax_be_deployheroku.repository.IRoleRepository;
import com.example.jwt_ajax_be_deployheroku.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
