package gao.internfinder.backend.repository;



import gao.internfinder.backend.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	Optional<Account> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	@Query(value = "select * from  account ac where  ac.address like  ?1", nativeQuery = true)
	List<Account> findByAddress(String address);
}
