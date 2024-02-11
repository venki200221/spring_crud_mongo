package com.crudmongo.crudmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Builder
@Data
public class EmployeeTO {
    private String id;
    private String empName;
    private String location;

    private BigDecimal salary;
}
