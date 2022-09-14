package com.example.SpringEx.controller;

import com.example.SpringEx.service.ReportService;
import com.example.SpringEx.service.dto.ReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    private ReportService reportService;

    @Autowired
    ReportController(ReportService reportService){
        this.reportService = reportService;
    }


    @GetMapping("/reports")
    public List<ReportDTO> getReport() {
        return reportService.getReport();
    }

    @GetMapping("/hello")
    public String hello() {
        return "helloWorld";
    }

}
