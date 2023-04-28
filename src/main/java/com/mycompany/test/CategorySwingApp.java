/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ro
 */
public class CategorySwingApp extends JFrame {
    
    //@Autowired
    //private ServiceCat service;

    private JTable table;

    public CategorySwingApp() {
        setTitle("Categories");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        String[] columns = {"ID", "Name"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        loadCategories();
    }

    private void loadCategories() {
        try {
             RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CategoryRs[]> responseEntity = restTemplate.getForEntity("http://localhost:9080/categories", CategoryRs[].class);
            List<CategoryRs> categories = Arrays.asList(responseEntity.getBody());


            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (CategoryRs category : categories) {
                Object[] row = {category.getCategoryid(), category.getName()};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

