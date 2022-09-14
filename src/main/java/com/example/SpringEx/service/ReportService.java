package com.example.SpringEx.service;

import com.example.SpringEx.service.dto.ReportDTO;
import com.example.SpringEx.service.mapper.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private ReportMapper reportMapper;

    @Autowired
    ReportService(ReportMapper reportMapper){
        this.reportMapper = reportMapper;
    }

    public List<ReportDTO> getReport() {
        return reportMapper.getReport();
    }
}
