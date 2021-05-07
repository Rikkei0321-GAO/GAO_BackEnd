package gao.internfinder.backend.Service.Imp;

import gao.internfinder.backend.Entity.Category;
import gao.internfinder.backend.Service.CategorySer;
import gao.internfinder.backend.Service.ICategorySer;
import gao.internfinder.backend.dto.ICategory;
import gao.internfinder.backend.repository.CategoryRepository;
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
