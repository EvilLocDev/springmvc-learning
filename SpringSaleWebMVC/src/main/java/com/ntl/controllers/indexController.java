/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.controllers;

import com.ntl.repositories.impl.CategoryRepositoryImpl;
import com.ntl.repositories.impl.ProductRepositoryImpl;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author locnguyen
 */
@Controller
public class indexController {
    @Autowired // Vi category da tao bean nen chi can wirring
    private CategoryRepositoryImpl cate;
    @Autowired
    private ProductRepositoryImpl prodRepo;
    
    @RequestMapping("/") //@RequestParam dung de dua tham so vao
    public String index(Model model, @RequestParam Map<String, String> params) {
        
        model.addAttribute("products", prodRepo.getProducts(params));
        model.addAttribute("categories", cate.getCates());
        return "index";
    }
}
