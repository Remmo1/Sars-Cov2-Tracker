package com.example.sarsCov2App.controllers;

import com.example.sarsCov2App.models.LocationStats;
import com.example.sarsCov2App.services.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ServiceData serviceData;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = serviceData.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(LocationStats::getLatestTotalCases).sum();
        int totalNewCases = allStats.stream().mapToInt(LocationStats::getDiffFromPrevDay).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "home";
    }
}