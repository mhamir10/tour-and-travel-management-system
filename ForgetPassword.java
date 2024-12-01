
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    
    JTextField tfusername, tfname, tfpassword;
    JButton search,rescue,back;
    
    ForgetPassword(){
      setBounds(350, 200, 850, 350);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot1.png"));
      Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(580,30, 250, 200);
      add(image);
      
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      p1.setBounds(30, 20, 500, 280);
      add(p1);
      
      JLabel lblusername = new JLabel("Username");
      lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
      lblusername.setBounds(40, 20, 100, 25);
      p1.add(lblusername);
      
      tfusername = new JTextField();
      tfusername.setBounds(200, 20, 150, 25);
      tfusername.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfusername);
      
      search = new JButton("Search");
      search.setBackground(Color.LIGHT_GRAY);
      search.setForeground(Color.DARK_GRAY);
      search.setBounds(380, 20, 100, 25);
      search.addActionListener(this);
      p1.add(search);
      
      JLabel lblname = new JLabel("name");
      lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
      lblname.setBounds(40, 60, 100, 25);
      p1.add(lblname);
      
      tfname = new JTextField();
      tfname.setBounds(200, 60, 150, 25);
      tfname.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfname);
      
      rescue = new JButton("Rescue");
      rescue.setBackground(Color.LIGHT_GRAY);
      rescue.setForeground(Color.DARK_GRAY);
      rescue.setBounds(150, 100, 150, 25);
      rescue.addActionListener(this);
      p1.add(rescue);
      
      JLabel lblpassword = new JLabel("Password");
      lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
      lblpassword.setBounds(40, 150, 150, 25);
      p1.add(lblpassword);
      
      tfpassword = new JTextField();
      tfpassword.setBounds(200, 150, 150, 25);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfpassword);
      
      back = new JButton("Back");
      back.setBackground(Color.LIGHT_GRAY);
      back.setForeground(Color.DARK_GRAY);
      back.setBounds(150, 180, 100, 25);
      back.addActionListener(this);
      p1.add(back);
      
      setUndecorated(true);
      
      setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == search){
           try{
             String query = "select * from account where username = '"+tfusername.getText()+ "'";
             Conn c = new Conn();
             
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                tfname.setText(rs.getString("name"));
            }
           }catch(Exception e){
               e.printStackTrace();
               }
       } 
       else if(ae.getSource()==rescue){
            try{
             String query = "select * from account where username = '"+tfusername.getText()+ "'";
             Conn c = new Conn();
             
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                tfpassword.setText(rs.getString("password"));
            }
           }catch(Exception e){
               e.printStackTrace();
               }
       }
       else{
           setVisible(false);
           new Login();
       }
    }
    
    public static void main(String[] args){
        new ForgetPassword();
        
    }

    private LayoutManager FlowLayout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
