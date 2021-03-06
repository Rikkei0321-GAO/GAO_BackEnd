package gao.internfinder.backend.Service;

import gao.internfinder.backend.Entity.News;

import java.util.List;

public interface NewsService {
    List<News> getAllNews(Integer idAccount);
    void update(News news);
    News findById(int id);
    List<News> findPostOneAccount(int idAccount);
    List<News> findAllDay();
}
