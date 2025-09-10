/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.controllers;

import com.ntl.repositories.impl.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author locnguyen
 */
@RestController
@RequestMapping("/api") //Chen /api vao nhung api
public class ApiProductController {
    @Autowired
    private ProductRepositoryImpl prodRepo;
    
    @DeleteMapping("/products/{productId}") //Luc nay productId => id
    @ResponseStatus(HttpStatus.NO_CONTENT) //Khi xoa xong tat nhien la no content
    public void delete(@PathVariable(value = "productId") int id) {
        this.prodRepo.deleteProduct(id);
    }
}
