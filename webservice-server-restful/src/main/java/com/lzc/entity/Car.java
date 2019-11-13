package com.lzc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Create by Liu Zicheng at 2019/11/13 10:59
 */
@XmlRootElement(name = "Car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer id;
    private String carName;
    private Double price;
}
