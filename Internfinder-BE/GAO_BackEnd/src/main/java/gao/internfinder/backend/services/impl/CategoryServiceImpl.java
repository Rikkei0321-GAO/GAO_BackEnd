package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.Repository.CategoryRepository;
import gao.internfinder.backend.Repository.NewsRepository;
import gao.internfinder.backend.services.CategorySer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategorySer {
    CategoryRepository repository;
    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Category> findById(int id) {
        return repository.findAllById(Collections.singleton(id));
    }

    @Override
    public void saveCategory(Category category) {
        repository.save(category);
    }

    @Override
    public void deleteCategory(int id) {
        repository.deleteById(id);
    }
}
