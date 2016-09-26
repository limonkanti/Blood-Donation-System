
package blood_donation_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class registration_sys  extends JFrame implements ActionListener
        {

    JLabel username=new JLabel("UserName:");
   // JLabel userid=new JLabel("UserEmail:");
    JLabel passlabl=new JLabel("Password:");
    JTextField userfld=new JTextField(15);
    //JTextField idfld=new JTextField(15);
    JPasswordField passfld=new JPasswordField(15);
    JButton okbu=new JButton("  Ok  ");
    JButton regb=new JButton("Reset");
    //JButton cb=new JButton("Cancel");
    JPanel panel=new JPanel();
    JButton btn=new JButton();
    JTextField fld=new JTextField();
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    Font lfnt=new Font("Sensserif",Font.BOLD,15);
    Font tfnt=new Font("Sensserif",Font.PLAIN,15);
    Connection con;
    Statement st=null;
    registration_sys(Connection con)
    {
       super("Registration");

       this.con=con;
       panel.setLayout(null);
       add(panel);

       setSize(450,350);
       setVisible(true);
       setLocation(d.width/2- getWidth() / 2,d.height/2-getHeight() / 2);
       setResizable(false);
       button();
       label_taxt();


    }
    void label_taxt()
    {


        username.setBounds(20, 25, 150, 30);
       
        passlabl.setBounds(20, 75, 150, 30);
        username.setFont(lfnt);
       
        passlabl.setFont(lfnt);
        username.setForeground(Color.BLUE);
       
        passlabl.setForeground(Color.BLUE);
        panel.add(username);
     
        panel.add(passlabl);



        userfld.setBounds(180, 20, 150, 35);
       
        passfld.setBounds(180,70 , 150, 35);
        userfld.setForeground(Color.BLUE);
        
        passfld.setForeground(Color.BLUE);
        userfld.setFont(tfnt);
        
        passfld.setFont(tfnt);
        panel.add(userfld);
        
        panel.add(passfld);

    }
    void button()
    {

        panel.add(okbu);
        panel.add(regb);
        //panel.add(cb);
        regb.addActionListener(this);
        //cb.addActionListener(this);
        okbu.setForeground(Color.BLUE);
        okbu.addActionListener(this);
        //cb.setForeground(Color.BLUE);
        regb.setForeground(Color.BLUE);
        okbu.setBounds(20, 280, 110, 25);
        regb.setBounds(150, 280, 110, 25);
        //cb.setBounds(280, 280, 110, 25);



    }
    public static void main(String args[])
    {

        //new registration_sys();
    }



    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==regb)
        {
            userfld.setText("");

            passfld.setText("");
        }
        if(ae.getSource()==okbu)
        {


            //String pass = new String(passfld.getPassword());

            try
            {

                String str ="insert into login(name,password)" +
                    "values('"+userfld.getText()+"','"+passfld.getText()+"')";
                st = con.createStatement();
                st.execute(str);
                JOptionPane.showMessageDialog(null, "Entry Successful");
            }
            catch (Exception ex)
             {
                JOptionPane.showMessageDialog(null,ex.toString());

             }

         }
        
     }
}