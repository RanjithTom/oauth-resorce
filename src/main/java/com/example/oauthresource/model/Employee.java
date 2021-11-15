package com.example.oauthresource.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Employee {

    private String empId;
    private String empName;
}
