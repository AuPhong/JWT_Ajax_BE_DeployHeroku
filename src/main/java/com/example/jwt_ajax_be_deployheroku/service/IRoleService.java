package com.example.jwt_ajax_be_deployheroku.service;

import com.example.jwt_ajax_be_deployheroku.model.Role;
import com.example.jwt_ajax_be_deployheroku.model.RoleName;
import com.example.jwt_ajax_be_deployheroku.model.Role;
import com.example.jwt_ajax_be_deployheroku.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
