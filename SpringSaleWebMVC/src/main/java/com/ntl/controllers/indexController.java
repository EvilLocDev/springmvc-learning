/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.controllers;

import com.ntl.repositories.impl.CategoryRepositoryImpl;
import com.ntl.repositories.impl.ProductRepositoryImpl;
import com.ntl.services.CategoryServices;
import com.ntl.services.ProductServices;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author locnguyen
 */
@Controller
@ControllerAdvice
public class indexController {
    @Autowired // Vi category da tao bean nen chi can wirring
    private CategoryServices cateService;
    @Autowired
    private ProductServices prodService;
    
    @ModelAttribute
    public void commonResponse(Model model) {
        model.addAttribute("categories", this.cateService.getCates());
    }
    
    @RequestMapping("/") //@RequestParam dung de dua tham so vao
    public String index(Model model, @RequestParam Map<String, String> params) {
        
        model.addAttribute("products", this.prodService.getProducts(params));
        
        return "index";
    }
}
