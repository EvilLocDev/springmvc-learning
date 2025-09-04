/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.services.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ntl.pojo.Comment;
import com.ntl.pojo.Product;
import com.ntl.repositories.ProductRepository;
import com.ntl.services.ProductServices;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author locnguyen
 */
@Service
public class ProductServicesImpl implements ProductServices {
    @Autowired
    private ProductRepository prodRepo;
    @Autowired
    private Cloudinary cloudinary;

    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.prodRepo.getProducts(params);
    }

    @Override
    public Product getProductById(int id) {
        return this.prodRepo.getProductById(id);
    }

    @Override
    public Product addOrUpdateProduct(Product p) {
        if (!p.getFile().isEmpty()) {
            try {
                Map res = cloudinary.uploader().upload(p.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                p.setImage(res.get("secure_url").toString());
            } catch (IOException ex) {
                Logger.getLogger(ProductServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return this.prodRepo.addOrUpdateProduct(p);
    }

    @Override
    public void deleleProduct(int id) {
        this.prodRepo.deleleProduct(id);
    }

    @Override
    public List<Comment> getComments(int productId) {
        return this.prodRepo.getComments(productId);
    }
}
