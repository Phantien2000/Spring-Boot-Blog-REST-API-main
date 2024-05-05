package com.sopromadze.blogapi.service;

import com.sopromadze.blogapi.infrastructure.exception.UnauthorizedException;
import com.sopromadze.blogapi.infrastructure.model.Category;
import com.sopromadze.blogapi.domain.payload.ApiResponse;
import com.sopromadze.blogapi.domain.payload.PagedResponse;
import com.sopromadze.blogapi.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

	PagedResponse<Category> getAllCategories(int page, int size);

	ResponseEntity<Category> getCategory(Long id);

	ResponseEntity<Category> addCategory(Category category, UserPrincipal currentUser);

	ResponseEntity<Category> updateCategory(Long id, Category newCategory, UserPrincipal currentUser)
			throws UnauthorizedException;

	ResponseEntity<ApiResponse> deleteCategory(Long id, UserPrincipal currentUser) throws UnauthorizedException;

}
