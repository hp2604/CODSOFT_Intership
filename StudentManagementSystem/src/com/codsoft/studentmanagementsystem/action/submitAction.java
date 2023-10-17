
package com.codsoft.studentmanagementsystem.action;

import static com.codsoft.studentmanagementsystem.action.AddStudent.*;
import com.codsoft.studentmanagementsystem.connection.ConnectionProvider;
import com.codsoft.studentmanagementsystem.dao.StudentDAO;
import com.codsoft.studentmanagementsystem.entity.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class submitAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            
        String name=nameInput.getText();
        int roll=Integer.parseInt(rollInput.getText());
        String grade=gradeInput.getText();
        String section=sectionInput.getText();
        String father=fatherInput.getText();
        String mother=motherInput.getText();
        
        Student s=new Student(name,grade,father,mother,section,roll);
        StudentDAO sdao=new StudentDAO(new ConnectionProvider().getConnection());
        }
         catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Fill the Enteries" );
        }
        
    }
    
}
