package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsListRepository extends JpaRepository<News,Integer> {
/**
 * minhhoang
 */

}
