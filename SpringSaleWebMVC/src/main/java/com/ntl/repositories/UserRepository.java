/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntl.repositories;

import com.ntl.pojo.User;

/**
 *
 * @author locnguyen
 */
public interface UserRepository {
    public User getUserByUsername(String username);
}
