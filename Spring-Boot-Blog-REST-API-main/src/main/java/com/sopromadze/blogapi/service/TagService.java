package com.sopromadze.blogapi.service;

import com.sopromadze.blogapi.infrastructure.model.Tag;
import com.sopromadze.blogapi.domain.payload.ApiResponse;
import com.sopromadze.blogapi.domain.payload.PagedResponse;
import com.sopromadze.blogapi.security.UserPrincipal;

public interface TagService {

	PagedResponse<Tag> getAllTags(int page, int size);

	Tag getTag(Long id);

	Tag addTag(Tag tag, UserPrincipal currentUser);

	Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

	ApiResponse deleteTag(Long id, UserPrincipal currentUser);

}
