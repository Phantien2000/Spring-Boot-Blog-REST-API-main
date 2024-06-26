package com.sopromadze.blogapi.infrastructure.repository;

import com.sopromadze.blogapi.infrastructure.model.Album;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
	Page<Album> findByCreatedBy(Long userId, Pageable pageable);
}
