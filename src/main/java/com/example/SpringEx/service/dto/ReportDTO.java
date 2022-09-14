package com.example.SpringEx.service.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReportDTO {
    private int idx;
    private String name;
    private int kor;
    private int eng;
    private int math;
}
