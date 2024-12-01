
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
   String username; 
   JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,viewbookedhotel,destination,bookpackage,viewkpackage, viewhotel,bookhotel,deletePersonalDetails,payments,login;
    
    Dashboard(String username){
        this.username = username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,2000,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5,0,70,70);
       p1.add(image);
       
       JLabel heading = new JLabel("Dashboard");
       heading.setBounds(80,10,300,40);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font("Tahoma",Font.BOLD,30));
       p1.add(heading);
       
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,1000);
        add(p2);
       
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground( Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground( Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground( Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground( Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground( Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Packages");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground( Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewkpackage = new JButton("View Packages");
        viewkpackage.setBounds(0,300,300,50);
        viewkpackage.setBackground(new Color(0,0,102));
        viewkpackage.setForeground( Color.WHITE);
        viewkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewkpackage.setMargin(new Insets(0,0,0,120));
        viewkpackage.addActionListener(this);
        p2.add(viewkpackage);
        
        
        viewhotel= new JButton("View Hotels");
        viewhotel.setBounds(0,350,300,50);
        viewhotel.setBackground(new Color(0,0,102));
        viewhotel.setForeground( Color.WHITE);
        viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotel.setMargin(new Insets(0,0,0,130));
        viewhotel.addActionListener(this);
        p2.add(viewhotel);
        
        bookhotel = new JButton("Book Hotels");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground( Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotels");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground( Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        
        destination = new JButton("View Destinations");
        destination.setBounds(0,500,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground( Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,70));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payment");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground( Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,70));
        payments.addActionListener(this);
        p2.add(payments);
         
        
        login = new JButton("Login");
        login.setBounds(0,900,300,50);
        login.setBackground(new Color(0,0,102));
        login.setForeground( Color.WHITE);
        login.setFont(new Font("Tahoma",Font.PLAIN,20));
        login.setMargin(new Insets(0,0,0,150));
        login.addActionListener(this);
        p2.add(login);
        
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(2000,1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(300,0,2000,1100);
        add(icon);
        
        JLabel text = new JLabel("Travel And Tourism Management System");
        text.setBounds(400,55,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        
        icon.add(text);
        
       
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()== updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()== checkpackages){
            new CheckPackage();
        }else if(ae.getSource()== bookpackage){
          new BookPackage(username);
        }else if(ae.getSource()==viewkpackage){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotel){
            new CheackHotel();
        }
        else if(ae.getSource()==bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()==viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }else if(ae.getSource()==destination){
            new Destination();
        }
        else if(ae.getSource()==payments){
            new Payment();
        }
        else if(ae.getSource()==login){
            new Login();
        }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
    
}
