/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.jdbc;

import com.ntl.services.QuestionService;
import java.sql.SQLException;

/**
 *
 * @author locnguyen
 */
public class Tester {
    public static void main(String[] args) throws SQLException {
        QuestionService s = new QuestionService();
        System.out.println(s.countProduct());
        System.out.println(s.countProductByCate(4));
        
        s.countProductsByAllCates().forEach(o -> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));
    }
}
