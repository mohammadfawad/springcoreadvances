/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcoreadvances.Autowiring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author spring
 */
//<bean  class = "com.springframework.springcore.ConstructorInjection.Address" name = "address" p:houseNumber = "789" p:street = "32-B" p:city = "Haripur Hazara" /> 
    
public class TestConstructorInjection {
    public static void main(String[] args) {
        
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("/com/springframework/springcoreadvances/Autowiring/AutowiringConfig.xml");
                        
            Employee employee2 = (Employee) context.getBean("employee2");
            System.out.println("\n\nC - Schema c:property and @Autowire :: \n" + employee2);
            
        } catch (Exception e) {
            System.out.println("\n\n@@@\nFile Not Found OR ERROR!!\n" + e.toString());
        }

    }
    
}

