/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author felsparkle
 */
public class EmployeeData {
     private ArrayList<Employee> Data;
    
    public EmployeeData() {
        this.Data = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getData() {
        return Data;
    }

    public void setData(ArrayList<Employee> Data) {
        this.Data = Data;
    }
    
    
}
