package com.sopromadze.blogapi.infrastructure.repository;

import com.sopromadze.blogapi.infrastructure.model.role.Role;
import com.sopromadze.blogapi.infrastructure.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
