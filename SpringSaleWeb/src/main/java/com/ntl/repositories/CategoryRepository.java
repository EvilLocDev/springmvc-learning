/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntl.repositories;

import com.ntl.pojo.Category;
import java.util.List;

/**
 *
 * @author locnguyen
 */
public interface CategoryRepository {
    List<Category> getCates() ;
    Category getCateById(int id);
}
