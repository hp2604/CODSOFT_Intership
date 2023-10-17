
package com.codsoft.studentmanagementsystem.gui;

import com.codsoft.studentmanagementsystem.action.AddStudent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;


public class welcome {
    Font f=new Font("Arial",Font.BOLD,20);
    private static JMenuBar menu=new JMenuBar();
    private static JMenu addRecord,editRecord,deleteRecord,search,allRecord;
    
    public static void main(String args[])       
    {
        JFrame frame=new JFrame();
        JPanel panel =new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        addRecord=new JMenu("Add Student");
        editRecord=new JMenu("Edit Details");
        deleteRecord=new JMenu("Delete Detail");
        search=new JMenu("Search");
        allRecord=new JMenu("Records");
        menu.add(addRecord);
        menu.add(editRecord);
        menu.add(deleteRecord);
        menu.add(allRecord);
        menu.add(search);
        addRecord.addMouseListener(new AddStudent());
        frame.setJMenuBar(menu);
        frame.setVisible(true);
        frame.setSize(1280, 1400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
