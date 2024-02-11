package com.crudmongo.crudmongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="employee")

public class Employee {
    @Id
private String id;

    @Field(name = "employee_name")
private String empName;
private String location;

private BigDecimal salary;
}

