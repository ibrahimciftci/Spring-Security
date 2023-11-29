package com.ibrahimciftci.eCommerce.dto;

import com.ibrahimciftci.eCommerce.entity.Role;

import java.util.Set;

public record CreateUserRequest(
        String firstName,
        String lastName,
        String username,
        String password,
        Set<Role>authorities

) {
}
