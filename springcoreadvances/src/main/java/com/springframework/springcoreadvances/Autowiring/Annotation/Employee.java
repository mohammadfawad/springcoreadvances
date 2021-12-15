/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcoreadvances.Autowiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author spring
 */
public class Employee {
    
    private int employeeId;
    private String employeeName;
 // Field level @Autowired
    @Autowired(required = false) 
    @Qualifier("address2")
    private Address address;
    //Constructor level @Autowiring
    //@Autowired 
    public Employee(Address address) {
        
        this.setEmployeeId(employeeId);
        this.setEmployeeName(employeeName);
        this.setAddress(address);
    }
//    
//    public Employee(int employeeId, String employeeName, Address address) {
//        
//        this.setEmployeeId(employeeId);
//        this.setEmployeeName(employeeName);
//        this.setAddress(address);
//    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    //@Autowired  //Property level @Autowiring
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " \nEmployeeId : " + this.getEmployeeId() + " EmployeeName : " + this.getEmployeeName() + " EmployeeAddress : " + this.getAddress();
        
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
