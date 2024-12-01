package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class Bkash extends JFrame implements ActionListener{
    Bkash(){
        
        setBounds(500,200,800,600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);   

        try {
            pane.setPage("https://www.bracbank.com/en/");
        }catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load</html>");
        } 

        JScrollPane sp = new JScrollPane(pane);     
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(sp);
        //setPreferredSize(new Dimension(800,600));
        
        JButton back=new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
       
        setSize(800,600);
        setLocation(600,220);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    public static void main(String[] args){
        new Bkash().setVisible(true);
    }
}