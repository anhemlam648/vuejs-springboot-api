package com.example.apispringvuejs.Service;

import com.example.apispringvuejs.Dto.Dtocategory;

public interface CategoryService {
   boolean createCategory (Dtocategory dtocategory);
   boolean updateCategory (Dtocategory dtocategory);
   boolean deleteCategory (Long id);
   Dtocategory getCategoryDtoById(Long id);
}
