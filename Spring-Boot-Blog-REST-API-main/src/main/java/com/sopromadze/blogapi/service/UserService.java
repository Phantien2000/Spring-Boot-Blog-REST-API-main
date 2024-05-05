package com.sopromadze.blogapi.service;

import com.sopromadze.blogapi.infrastructure.model.user.User;
import com.sopromadze.blogapi.domain.payload.ApiResponse;
import com.sopromadze.blogapi.domain.payload.InfoRequest;
import com.sopromadze.blogapi.domain.payload.UserIdentityAvailability;
import com.sopromadze.blogapi.domain.payload.UserProfile;
import com.sopromadze.blogapi.domain.payload.UserSummary;
import com.sopromadze.blogapi.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}