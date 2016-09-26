package blood_donation_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login_system extends JFrame implements ActionListener
{

    JLabel username = new JLabel("UserName:");
    JLabel userid = new JLabel("PassWord:");
    JTextField userfld = new JTextField(15);
    JPasswordField passfild = new JPasswordField(15);
    JButton reb = new JButton("Registration");
    JButton cancelb = new JButton("  Cancel  ");
    JButton saveb = new JButton("   Login   ");
    JPanel panel = new JPanel();
    JButton btn = new JButton();
    JTextField fld = new JTextField();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    Font lfnt = new Font("Sensserif", Font.BOLD, 15);
    Font tfnt = new Font("Sensserif", Font.PLAIN, 15);
    Connection con;
    Statement st = null;//help access to the database
    ResultSet rs;//database er table theke value tule anar jorno use hoi //
    //The SQL statements that read data from a database query return the data in a result set.

    
    
    Login_system() {
        super("Login_System");
        panel.setLayout(null);
        add(panel);
             /* try{
            Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.oracleDriver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_result", "root", "");

            System.out.println("connection successful");

                 }
            catch (Exception ex)
            {
            JOptionPane.showMessageDialog(null, ex.toString());

            }*/
        setSize(500, 400);
        setVisible(true);
        setLocation(d.width / 2 - getWidth() / 2, d.height / 2 - getHeight() / 2);
        setResizable(false);
        label_and_tax();
        button();
        Image_sys();
        connect_sql();

    }
    void connect_sql()
    {
          try{
            Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.oracleDriver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_result", "root", "");

            System.out.println("connection successful");

                 }
            catch (Exception ex)
            {

            JOptionPane.showMessageDialog(null, ex.toString());//return a sort discribtion kothai wrong ta bolbe

            }
    }

    void label_and_tax() {


        username.setBounds(230, 38, 130, 20);
        userid.setBounds(230, 98, 130, 20);
        username.setFont(lfnt);
        userid.setFont(lfnt);
        username.setForeground(Color.BLUE);
        passfild.setForeground(Color.BLUE);

        panel.add(username);
        panel.add(userid);

        userfld.setBounds(340, 30, 130, 35);
        passfild.setBounds(340, 90, 130, 35);
        userfld.setForeground(Color.BLUE);
        userid.setForeground(Color.BLUE);

        userfld.setFont(tfnt);
        passfild.setFont(tfnt);
        panel.add(userfld);
        panel.add(passfild);

    }

    void button() {
        panel.add(saveb);
        panel.add(reb);
        reb.addActionListener(this);
        saveb.addActionListener(this);
        panel.add(cancelb);
        cancelb.addActionListener(this);
        reb.setForeground(Color.BLUE);
        saveb.setForeground(Color.BLUE);
        cancelb.setForeground(Color.BLUE);
        saveb.setBounds(100, 320, 120, 30);
        reb.setBounds(230, 320, 110, 30);

        cancelb.setBounds(350, 320, 110, 30);


    }

    void Image_sys() {


        ImageIcon ic = new ImageIcon("Photo0081.jpg");
        JLabel lb = new JLabel(ic);
        panel.add(lb);
        lb.setBounds(5, 5, 200, 300);

    }

    public static void main(String[] args)
    {
        new Login_system();
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == cancelb) {

            System.exit(0);

        }
        if (ae.getSource() == reb) {
            new registration_sys(con);

        }
        if (ae.getSource() == saveb) 
        {
            if (username.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Provide User Name");

            } else if (passfild.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Provide User Password");

            } else {

                boolean c = false;
                try {
                    //String sql = "select*from login where name='" +userfld.getText() + "'&&"
                         //  + "pass='"+passfild.getText()+"'";

                  //   String sql ="select*from login where name='"+userfld.getText()+"'&&
                  //  pass='"+idfld.getText()+"'";

                    String sql=("select * from login where name=" +userfld.getText());
                    
                    st = con.createStatement();

                    rs = st.executeQuery(sql);

                    rs.next();

                    String name = rs.getString("name");
                    //String password = rs.getString(2);
                    String password = rs.getString("password");

                    if (userfld.getText().equals(name) && passfild.getText().equals(password))
                    {
                        c = true;
                        new MainFrame(con);
                        dispose();


                    }
                    else 
                         {

                            JOptionPane.showMessageDialog(null, "Provide correct Name and password");

                         }
                    


                    

                } catch (Exception e){}
               
            }


    
}
    }
}


