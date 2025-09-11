/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.controllers;

import com.ntl.pojo.Product;
import com.ntl.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author locnguyen
 */
@Controller
public class ProductController {
    @Autowired
    private ProductServices prodService;
    
    @GetMapping("/products") //Gui du lieu len
    public String list(Model model) {
        model.addAttribute("product", new Product());
        return "products";
    }
    
    @GetMapping("/products/{productId}") //Dua productId dang duoc update vao id
    public String update(Model model, @PathVariable(value = "productId") int id) {
        model.addAttribute("product", this.prodService.getProductById(id)); //Du lieu chon tu productId co san
        return "products";
    }
    
    @PostMapping("/products") //Nhan du lieu ve, trong bai tap lon nen validate truoc khi nhan du lieu
    public String create(@ModelAttribute(value="product") Product p) {
        this.prodService.addOrUpdate(p);
        
        return "redirect:/";
    }
}
