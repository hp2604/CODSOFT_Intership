
package com.codsoft.studentmanagementsystem.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddStudent extends MouseAdapter {

  
    public static JLabel heading,name, rollNumber,grade,section,fatherName,motherName;
    public static JTextField nameInput,rollInput,gradeInput,sectionInput,fatherInput,motherInput;
    public static JButton submit;
    public static final Color r=new Color(0,153,0);
    Font f=new Font("Arial",Font.BOLD,20); 
    Font f1=new Font("Serif",Font.PLAIN,20);
    private JFrame frame;
    private JPanel panel;
    
    public void mousePressed(MouseEvent e)
    {
        
        
         frame=new JFrame("New Registeration");
         panel=new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        
        //Heading 
        heading=new JLabel("New Registeration");
        heading.setForeground(r);
        heading.setFont(f);
        heading.setBounds(550,10,500, 100);
        panel.add(heading);
        
        //Name of Student 
        name=new JLabel("Name");
        name.setFont(f1);
        name.setBounds(300,150,80,25);
        panel.add(name);
        nameInput=new JTextField();
        nameInput.setFont(f1);
        nameInput.setBounds(408,150,180,25);
        panel.add(nameInput);
        
        //Roll Number of Student
        rollNumber=new JLabel("Roll Number");
        rollNumber.setFont(f1);
        rollNumber.setBounds(630,150,110,25);
        panel.add(rollNumber);
        rollInput=new JTextField();
        rollInput.setFont(f1);
        rollInput.setBounds(750,150,180,25);
        panel.add(rollInput);
        
        //Grade of Student
        grade=new JLabel("Grade");
        grade.setFont(f1);
        grade.setBounds(300,200,110,25);
        panel.add(grade);
        gradeInput=new JTextField();
        gradeInput.setFont(f1);
        gradeInput.setBounds(408,200,180,25);
        panel.add(gradeInput);
        
        //Section of Student
        section=new JLabel("Section");
        section.setFont(f1);
        section.setBounds(630,200,110,25);
        panel.add(section);
        sectionInput=new JTextField();
        sectionInput.setFont(f1);
        sectionInput.setBounds(750,200,180,25);
        panel.add(sectionInput);
        
        // Father Name and mother Name
        fatherName=new JLabel("Father Name");
        fatherName.setFont(f1);
        fatherName.setBounds(300,250,110,25);
        panel.add(fatherName);
        fatherInput=new JTextField();
        fatherInput.setFont(f1);
        fatherInput.setBounds(410,250,180,25);
        panel.add(fatherInput);
        motherName=new JLabel("Mother Name");
        motherName.setFont(f1);
        motherName.setBounds(630,250,110,25);
        panel.add(motherName);
        motherInput=new JTextField();
        motherInput.setFont(f1);
        motherInput.setBounds(750,250,180,25);
        panel.add(motherInput);
        
        //submit Button
        submit =new JButton("Submit");
        submit.setBounds(550, 300, 100, 30);
        submit.setForeground(Color.white);
        submit.setBackground(r);
        panel.add(submit);
        submit.addActionListener(new submitAction());
        frame.setVisible(true);
        frame.setSize(1280,1400);
        
       
        
        
    }

  
    
    
}
