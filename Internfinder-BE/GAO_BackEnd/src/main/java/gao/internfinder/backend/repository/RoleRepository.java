package gao.internfinder.backend.repository;


//import gao.internfinder.backend.Entity.EntityTrang.ERole;
//import gao.internfinder.backend.Entity.EntityTrang.Role;
import gao.internfinder.backend.Entity.ERole;
import gao.internfinder.backend.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
