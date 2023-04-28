/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ro
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRs implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("categoryid")
    private int categoryid;
    
    @JsonProperty("name")
    private String name;
    
}