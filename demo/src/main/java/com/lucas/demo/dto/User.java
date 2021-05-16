package com.lucas.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lucasfen
 * @Date 2021/05/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String password;
}
