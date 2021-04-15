package gao.internfinder.backend.services;

import gao.internfinder.backend.Entity.Category;

import java.util.List;

public interface CategorySer {
    List<Category> findAll();
    List<Category>findById(int id);
    void saveCategory(Category Category);
    void deleteCategory(int id);
}
