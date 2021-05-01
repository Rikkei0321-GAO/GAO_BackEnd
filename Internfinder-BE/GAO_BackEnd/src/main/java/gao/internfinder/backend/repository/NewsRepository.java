
package gao.internfinder.backend.repository;
import gao.internfinder.backend.Entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

    @Query(value = "select * from news " +
            "where news.id_account = ?", nativeQuery = true)
    List<News> findByAccount(int idAccount);


    @Query(value = "select * from News where id = ?", nativeQuery = true)
    News getByIdNews(Integer id);

    @Query(value = "select  * from  news ns where ns.title like ?1", nativeQuery = true)
    List<News>findByTitle(String title);
}
