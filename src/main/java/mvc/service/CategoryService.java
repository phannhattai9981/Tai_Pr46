package mvc.service;

import mvc.entity.CategoryEntity;
import mvc.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Object findAll() {
        return categoryRepository.findAll();
    }


    public CategoryEntity save(CategoryEntity category) {
        return categoryRepository.save(category);
    }

    public Object findById(int id) {
        return categoryRepository.findById(id);
    }

    public Object deleteById(int id) {
        return categoryRepository.findById(id);
    }
}
