package com.iStar;

import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.JTextField;
  
public class Jtable { 
    JFrame f; 
    JTable j; 
    JTextField field1, field2;
    //private int n, m;
    Jtable() 
    {  
        f = new JFrame(); 
        field1 = new JTextField(20);
        field1.setSize(1,2);
        field2 = new JTextField(20);
        f.setTitle("New Table"); 
        String[][] data = { 
            {"10","20"}
        }; 
        String[] columnNames = {"Data", "Method"}; 
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300); 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        f.add(field1);
        String input = field1.getText();
        f.setSize(500, 200); 
        f.setVisible(true); 
    } 
    
    public static void main(String[] args) 
    { 
        new Jtable(); 
    } 
} 