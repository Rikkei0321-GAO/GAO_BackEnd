package gao.internfinder.backend.services;

import gao.internfinder.backend.Entity.ERole;
import gao.internfinder.backend.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleService extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
}
