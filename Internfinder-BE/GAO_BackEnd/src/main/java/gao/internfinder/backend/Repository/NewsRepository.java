package gao.internfinder.backend.Repository;

import gao.internfinder.backend.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository  extends JpaRepository<News, Integer> {
}
