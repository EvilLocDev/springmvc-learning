/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.services.impl;

import com.ntl.repositories.StatsRepository;
import com.ntl.services.StatsServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author locnguyen
 */
@Service
public class StatsServicesImpl implements StatsServices {
    @Autowired
    private StatsRepository statsRepo;

    @Override
    public List<Object[]> getRevenueByProduct() {
        return this.statsRepo.getRevenueByProduct();
    }

    @Override
    public List<Object[]> getRevenueByTime(String time, int year) {
        return this.statsRepo.getRevenueByTime(time, year);
    }
    
}
