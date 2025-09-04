/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntl.repositories;

import com.ntl.pojo.Comment;
import com.ntl.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author locnguyen
 */
public interface ProductRepository {
    List<Product> getProducts(Map<String, String> params);
    Product getProductById(int id);
    Product addOrUpdateProduct(Product p);
    void deleleProduct(int id);
    List<Comment> getComments(int productId);
}
