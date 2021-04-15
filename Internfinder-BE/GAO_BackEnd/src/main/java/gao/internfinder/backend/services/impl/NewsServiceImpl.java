package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Repository.NewsRepository;
import gao.internfinder.backend.services.NewsService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NewsServiceImpl  implements NewsService {
    NewsRepository newsRepository;
    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public List<News>findNewsAllById(int idNews) {
        return newsRepository.findAllById(Collections.singleton(idNews));
    }

    @Override
    public void saveNews(News news) {
        newsRepository.save(news);
    }

    @Override
    public Optional<News> addNews(int idNews){
        return newsRepository.findById(idNews);
    }

    @Override
    public void deleteNews(int idNews) {
        newsRepository.deleteById(idNews);
    }
}
