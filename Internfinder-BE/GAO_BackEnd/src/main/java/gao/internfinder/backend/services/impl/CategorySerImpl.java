package gao.internfinder.backend.services.impl;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.Repository.CategoryRepository;
import gao.internfinder.backend.dto.ICategory;
import gao.internfinder.backend.services.CategorySer;
import gao.internfinder.backend.services.ICategorySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySerImpl implements CategorySer, ICategorySer {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<ICategory> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public List<Category>findAllCategory(){
        return categoryRepository.findAll();
    }
}
