/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.test;

import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author ro
 */
@Mapper(componentModel = "spring")
public interface MapperCat {
    
    CategoryRs categoryToCategoryRs(Category category);
    
    public List<CategoryRs> categoryToCategoryRsList(List<Category> category);
    
    Category categoryRsToCategory(CategoryRs categoryRs);
    
}
