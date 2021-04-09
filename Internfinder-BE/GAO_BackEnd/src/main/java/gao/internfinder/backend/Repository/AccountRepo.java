package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountRepo  extends JpaRepository<Account, Integer> {
    /**
     * Dat master
     */
}
