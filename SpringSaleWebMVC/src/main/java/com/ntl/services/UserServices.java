/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntl.services;

import com.ntl.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author locnguyen
 */
public interface UserServices extends UserDetailsService {
    User getUserByUsername(String username);
}
