/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcoreadvances.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author spring
 */
    
public class TestStandAloneCollection {
    public static void main(String[] args) {
        
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcoreadvances/StandAloneCollections/standaloneConfig.xml");
                        
            ProductList productList = (ProductList) context.getBean("productList");
            System.out.println("\n\n Standalone Collections Used Outside Bean Scope by Other Beans :: \n" + productList);
            
        } catch (Exception e) {
            System.out.println("\n\n@@@\nFile Not Found OR ERROR!!\n" + e.toString());
        }

    }
    
}

