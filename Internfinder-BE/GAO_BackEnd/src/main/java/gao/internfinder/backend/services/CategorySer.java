package gao.internfinder.backend.services;

import gao.internfinder.backend.Entity.Category;

import java.util.List;

public interface CategorySer {
    List<Category> findAllCategory();
}
