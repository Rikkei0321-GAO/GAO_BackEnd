package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.News;
import gao.internfinder.backend.Repository.NewsRepository;
import gao.internfinder.backend.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NewsServiceImp implements NewsService {
    @Autowired
    NewsRepository newsRepository;

    @Override
    public List<News> getAllNewsById(Integer idAccount) {
        return newsRepository.findAllById(Collections.singleton(idAccount));
    }

    @Override
    public void editNews(News news) {
        newsRepository.save(news);
    }

    @Override
    public News findById(int id) {
        return newsRepository.getByIdNews(id);
    }

    @Override
    public List<News> findPostOneAccount(int idAccount) {
        return newsRepository.findByAccount(idAccount);
    }
}
