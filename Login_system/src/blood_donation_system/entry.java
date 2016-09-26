package blood_donation_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class entry extends JInternalFrame implements ActionListener {

    JLabel username = new JLabel("Name:");
    JLabel dept = new JLabel("Dept:");
    JLabel passlabl = new JLabel("ID:");
    JLabel year = new JLabel("Year:");
    JLabel gpa = new JLabel("Gpa:");
    JTextField userfld = new JTextField(15);
    JTextField deptfld = new JTextField(15);
    JTextField idfld = new JTextField(15);
    JTextField yearfld = new JTextField(15);
    JTextField gpafld = new JTextField(15);
    JButton okbu = new JButton("  Ok  ");
    JButton regb = new JButton("Reset");
    JPanel panel = new JPanel();
    JButton btn = new JButton();
    JTextField fld = new JTextField();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    Font lfnt = new Font("Sensserif", Font.BOLD, 15);
    Font tfnt = new Font("Sensserif", Font.PLAIN, 15);
    Connection con;
    Statement st = null;

    entry(Connection con) {
        super("Entry", true, true, true, true);

        this.con=con;
        panel.setLayout(null);
        add(panel);

        setSize(450, 350);
        setVisible(true);
        setLocation(d.width / 2 - getWidth() / 2, d.height / 2 - getHeight() / 2);
        setResizable(false);
        button();
        label_taxt();


    }

    void label_taxt() {


        username.setBounds(20, 25, 150, 30);

        dept.setBounds(20, 75, 150, 30);

        passlabl.setBounds(20, 125, 150, 30);

        year.setBounds(20, 175, 150, 30);

        gpa.setBounds(20, 225, 150, 30);

        username.setFont(lfnt);

        passlabl.setFont(lfnt);
        username.setForeground(Color.BLUE);

        passlabl.setForeground(Color.BLUE);
        panel.add(username);

        panel.add(passlabl);

        panel.add(dept);

        panel.add(year);

        panel.add(gpa);



        userfld.setBounds(180, 20, 150, 35);

        idfld.setBounds(180, 120, 150, 35);

        deptfld.setBounds(180, 70, 150, 35);

        yearfld.setBounds(180, 170, 150, 35);

        gpafld.setBounds(180, 220, 150, 35);

        userfld.setForeground(Color.BLUE);

        idfld.setForeground(Color.BLUE);
        userfld.setFont(tfnt);

        idfld.setFont(tfnt);
        panel.add(userfld);

        panel.add(idfld);

        panel.add(deptfld);

        panel.add(yearfld);

        panel.add(gpafld);


    }

    void button() {

        panel.add(okbu);
        panel.add(regb);

        regb.addActionListener(this);

        okbu.setForeground(Color.BLUE);
        okbu.addActionListener(this);

        regb.setForeground(Color.BLUE);
        okbu.setBounds(20, 280, 110, 25);
        regb.setBounds(150, 280, 110, 25);




    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == regb) {
            userfld.setText("");

            idfld.setText("");

            deptfld.setText("");

            yearfld.setText("");

            gpafld.setText("");



        }
        if (ae.getSource() == okbu) {

            try {

                String str = "insert into new_entry(name,dept,id,year,gpa)" +
                        "values('" + userfld.getText() + "','" + deptfld.getText() + "','" + idfld.getText() + "','" + yearfld.getText() + "','" + gpafld.getText() + "')";
                st = con.createStatement();
                st.execute(str);
                JOptionPane.showMessageDialog(null, "Entry Successful");
               // if(idfld.getText().equals(passlabl))
               //if (idfld.getText()=="passlabl")


             /*  if (idfld.g)
                {
                    JOptionPane.showMessageDialog(null, "please Reenter your id");

                }*/
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.toString());

            }


        }


    }
}
