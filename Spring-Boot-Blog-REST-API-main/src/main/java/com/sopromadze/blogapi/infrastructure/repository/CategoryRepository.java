package com.sopromadze.blogapi.infrastructure.repository;

import com.sopromadze.blogapi.infrastructure.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
