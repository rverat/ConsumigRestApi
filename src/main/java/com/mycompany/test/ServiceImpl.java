/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.lang.annotation.Annotation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author ro
 */
@Service
public class ServiceImpl implements ServiceCat{
    
    @Autowired
    CategoryRepository rep;
    
    @Autowired
    MapperCat mapper;
    

    @Override
    public List<CategoryRs> findAll() {
        
        List<Category> categorys = rep.findAll();    
        return mapper.categoryToCategoryRsList(categorys);

    }
    
    @Override
    public void updateAndSave(CategoryRs categoryRs) {
       rep.save(mapper.categoryRsToCategory(categoryRs));
    }

    @Override
    public void delete(int categoryId) {
        rep.deleteById(categoryId);
    }


}
