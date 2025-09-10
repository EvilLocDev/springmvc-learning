/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.repositories.impl;

import com.ntl.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author locnguyen
 */
//Neu khong gan annotation nay, no se tao doi tuong truoc khi tao local session factory, cho nen gan vao no se tro thanh bean
@Repository
public class CategoryRepositoryImpl {
    @Autowired
    private LocalSessionFactoryBean factory; //Lay tu bean local session factory
    
    public List<Category> getCates() {
        try (Session s = this.factory.getObject().openSession()) {
            Query q = s.createQuery("FROM Category", Category.class);
            return q.getResultList();
        }
    }
    
    public Category getCateById(int id) {
        try (Session s = this.factory.getObject().openSession()) {
            return s.find(Category.class, id);
        }
    }
}
