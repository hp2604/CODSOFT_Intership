
package com.codsoft.studentmanagementsystem.dao;

import java.sql.*;


public class StudentDAO {
      private Connection c;
      String saveQuery="insert into students(name)";
    public StudentDAO(Connection c) {
        this.c=c;
    }
    
    
}
