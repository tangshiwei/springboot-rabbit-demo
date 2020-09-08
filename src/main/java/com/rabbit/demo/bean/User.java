package com.rabbit.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Data
public class User implements Serializable {
    private String username;
    private String password;
    private int age;
}
