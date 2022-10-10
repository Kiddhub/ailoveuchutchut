package com.shop.service;

import com.shop.dto.AdminDto;
import com.shop.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
