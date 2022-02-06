/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author Vishwa
 */
public class Tables { 
 public static void main(String[] args){
     try{
         String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(200),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
         DbOperations.setDataOrDelete(userTable,"User Table Created Successfully");
         String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','what primary school did you attend?','ABC','true')";
         DbOperations.setDataOrDelete(adminDetails,"Admin details Added Successfully");
         String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
         DbOperations.setDataOrDelete(categoryTable,"Category Table created Successfully");
         String productTable ="Create table product(id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200),price varchar(200))";
         DbOperations.setDataOrDelete(productTable,"Product Table created Successfully");
         String billTable = "create table bill(id int  primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
         DbOperations.setDataOrDelete(billTable,"Bill Table created Successfully");

     }   
     catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          
       }
     }
}
