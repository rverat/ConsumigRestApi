/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.test;

import java.util.List;

/**
 *
 * @author ro
 */
public interface ServiceCat {
    
    
    List<CategoryRs> findAll();    
    void updateAndSave(CategoryRs categoryRs);
    void delete(int categoryId);
    
    
}
