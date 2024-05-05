package com.sopromadze.blogapi.service;

import com.sopromadze.blogapi.infrastructure.model.Album;
import com.sopromadze.blogapi.domain.payload.AlbumResponse;
import com.sopromadze.blogapi.domain.payload.ApiResponse;
import com.sopromadze.blogapi.domain.payload.PagedResponse;
import com.sopromadze.blogapi.domain.payload.request.AlbumRequest;
import com.sopromadze.blogapi.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface AlbumService {

	PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

	ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser);

	ResponseEntity<Album> getAlbum(Long id);

	ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

	ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

	PagedResponse<Album> getUserAlbums(String username, int page, int size);

}
