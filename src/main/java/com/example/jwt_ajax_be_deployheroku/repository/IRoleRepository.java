package com.example.jwt_ajax_be_deployheroku.repository;

import com.example.jwt_ajax_be_deployheroku.model.Role;
import com.example.jwt_ajax_be_deployheroku.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
