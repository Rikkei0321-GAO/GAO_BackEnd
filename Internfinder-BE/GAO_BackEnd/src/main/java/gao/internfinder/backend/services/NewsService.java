package gao.internfinder.backend.services;

import gao.internfinder.backend.Entity.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<News> findAll();
    List<News>findNewsAllById(int idNews);
    void saveNews(News news);
    Optional<News> addNews(int idNews) ;
    void deleteNews(int idNews);
}
