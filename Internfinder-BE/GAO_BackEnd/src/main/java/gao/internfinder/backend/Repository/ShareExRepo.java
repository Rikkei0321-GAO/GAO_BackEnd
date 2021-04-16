package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.Share_experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareExRepo extends JpaRepository<Share_experience, Integer> {

}
