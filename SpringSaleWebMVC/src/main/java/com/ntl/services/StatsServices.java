/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntl.services;

import java.util.List;

/**
 *
 * @author locnguyen
 */
public interface StatsServices {
    List<Object[]> getRevenueByProduct();
    List<Object[]> getRevenueByTime(String time, int year);
}
