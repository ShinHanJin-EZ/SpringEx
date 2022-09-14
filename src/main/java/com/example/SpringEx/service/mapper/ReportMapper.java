package com.example.SpringEx.service.mapper;

import com.example.SpringEx.service.dto.ReportDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReportMapper {
    List<ReportDTO> getReport();
}
