package percentagecal;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI  {

     private static JFrame frame; 
     private static JPanel panel;
     private static JLabel heading,totalSubject,tittle[];
     private static JTextField subjectCount,subjectList[];
     private static JButton bt1;
     private static JButton reset,submit;
     private static  int numberSubject,size;
     private static ActionListener resetOption,submitOption,addOption;
     
    public static void main(String[] args) {
   
   
           //Action Listeners
           //Reset Action
          resetOption =new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
                  subjectCount.setText(null);
                    if(numberSubject>0)
           {
                for(int i=0;i<numberSubject;i++)
             {
                 panel.remove(subjectList[i]);
                 panel.remove(tittle[i]);
                 panel.revalidate();
                 panel.repaint();
                
             }
                subjectCount.setText(null);
             panel.remove(submit);
           }
  
         }  
   
         };
           
        //Submit Action
        submitOption=new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             float totalMarks=0;
             boolean check=false;
             try
                   {
                         for(int i=0;i<numberSubject;i++)
             {
                   float temp=Float.parseFloat(subjectList[i].getText());
                   if(temp<0 || temp>100)
                 {
                     JOptionPane.showMessageDialog(panel, "Inavlid Marks");
                     check=true;
                     break;
                 }
                 else
                 {
                      totalMarks=temp+totalMarks;
                      
                 }
                   
                
             }
             if(check==false)
             {
                float percentage=totalMarks/numberSubject;
              if(percentage>=80 &&percentage<100)
              {
                  JOptionPane.showMessageDialog(panel, "Your Percentage is " + percentage +"\n Passed with class A");
              }
               if(percentage>=60 &&percentage<80)
              {
                  JOptionPane.showMessageDialog(panel, "Your Percentage is " + percentage +"\n Passed with class B");
              }
                if(percentage>25 &&percentage<60)
              {
                  JOptionPane.showMessageDialog(panel, "Your Percentage is " + percentage +"\n Passed with class C");
              }
               
             }
                   }
             
             catch(Exception ex)
                   {
                       JOptionPane.showMessageDialog(panel,"Please enter the Marks");
                   }
            
         }
         
     };
        
        // Add Option
        addOption=new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                 try
                 {
                    numberSubject=Integer.parseInt(subjectCount.getText());
                     size=100;
                     subjectList=new JTextField[numberSubject];
                     tittle= new JLabel[numberSubject];
            for(int i=0;i<numberSubject;i++)
            {
                int seq=i+1;
                tittle[i]=new JLabel("Subejct " + seq );
                tittle[i].setBounds(100, size, 80, 25);
                panel.add(tittle[i]);
                subjectList[i]=new JTextField();
                subjectList[i].setBounds(190, size, 165, 25);
                panel.add(subjectList[i]);
                panel.revalidate();
                panel.repaint();
                size=size+50;   
            }
            submit=new JButton("Submit");
            submit.setBackground(Color.green);
            submit.setForeground(Color.white);
            submit.setBounds(200,size,80,25);
            panel.add(submit);
            submit.addActionListener(submitOption);
                 
              }
                 catch(Exception ex)
                 {
                      JOptionPane.showMessageDialog(panel,"Please enter the Subjects");
                      
                 }
              }
          };
       
        
        //GUI Work
      frame=new JFrame("Percentage Calculator");
      panel=new JPanel();
      frame.add(panel);
      panel.setLayout(null);
      panel.setBackground(Color.white);
      heading=new JLabel("Percentage Calculator");
      heading.setForeground(Color.red);
      Font fo=new Font("Serif",Font.BOLD,20);
      heading.setFont(fo);
      heading.setBounds(190, 20, 200, 25);
      panel.add(heading);
      totalSubject=new JLabel("Total Subject");
      totalSubject.setBounds(100, 60,80,25);
      panel.add(totalSubject);
      subjectCount=new JTextField();
      subjectCount.setBounds(190,60,165,25);
      panel.add(subjectCount);
      bt1=new JButton("ok");
      bt1.setBounds(370, 60, 80,25);
      panel.add(bt1);
      bt1.addActionListener(addOption);
      reset=new JButton("Reset");
      reset.setBounds(460, 60, 80,25);
      reset.addActionListener(resetOption);
      panel.add(reset);
      frame.setSize(800, 800);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
  
  
    
  
}
