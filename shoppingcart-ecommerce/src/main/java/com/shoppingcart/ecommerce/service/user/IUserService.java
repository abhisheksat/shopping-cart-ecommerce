package com.shoppingcart.ecommerce.service.user;

import com.shoppingcart.ecommerce.dto.UserDto;
import com.shoppingcart.ecommerce.model.User;
import com.shoppingcart.ecommerce.request.CreateUserRequest;
import com.shoppingcart.ecommerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();
}