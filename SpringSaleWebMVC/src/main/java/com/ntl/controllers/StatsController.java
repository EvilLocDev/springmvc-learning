/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.controllers;

import com.ntl.services.StatsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author locnguyen
 */
@Controller
public class StatsController {
    @Autowired
    private StatsServices statsService;
    
//    @PreAuthorize //Chuong thuc truoc khi vao day, su dung cai nay neu nhu spring security chua cau hinh
    @GetMapping("/stats")
    public String stats(Model model) {
        model.addAttribute("revenues", this.statsService.getRevenueByProduct());
        return "stats";
    }
}
