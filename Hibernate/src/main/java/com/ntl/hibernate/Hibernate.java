/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ntl.hibernate;

import com.ntl.pojo.Product;
import com.ntl.repositories.impl.CategoryRepositoryImpl;
import com.ntl.repositories.impl.ProductRepositoryImpl;
import com.ntl.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author locnguyen
 */
public class Hibernate {

    public static void main(String[] args) {
        //Truy van tat ca category
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));

        //Truy van cac product co trong cac category
//        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        s.getProducts(null).forEach(p -> System.out.println(p.getName()));
        
//        Map<String, String> params = new HashMap<>();
        //Truy van cac product co kw la iphone orderby price
//        params.put("kw", "iphone");
//        params.put("orderBy", "price");

        //Lay tat ca phan tu page 2 oderby price
//        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        params.put("orderBy", "price");
//        params.put("page", "2");
//        s.getProducts(params).forEach(p -> System.out.printf("%s - %.1f\n", p.getName(), p.getPrice()));
        
        //Them 1 product moi
//        CategoryRepositoryImpl s2 = new CategoryRepositoryImpl();
//        ProductRepositoryImpl s = new ProductRepositoryImpl();
//        Product p = new Product();
//        p.setName("Samsung Galaxy Smart Watch Classic");
//        p.setPrice(1000l);
//        p.setCategoryId(s2.getCateById(1));
//        
//        s.addOrUpdate(p);

        // Thong ke doanh so san pham
//        StatsRepositoryImpl s3 = new StatsRepositoryImpl();
//        s3.getRevenueByProduct().forEach(o -> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));

        // Thong ke theo thoi gian
        StatsRepositoryImpl s4 = new StatsRepositoryImpl();
        s4.getRevenueByTime("MONTH", 2020).forEach(o -> System.out.printf("%d: %d\n", o[0], o[1]));
    }
}
