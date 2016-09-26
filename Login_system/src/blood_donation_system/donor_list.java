package blood_donation_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.text.*;
import java.sql.*;
import javax.swing.*;

public class donor_list extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JMenuBar br = new JMenuBar();
    JMenu menu1 = new JMenu("Donar list");
    JButton b1 = new JButton("Save");
    JButton b2 = new JButton("Back");
    JLabel l1 = new JLabel("Name:");
    JLabel l2 = new JLabel("ID:");
    JLabel l3 = new JLabel("Blood group:");
    JLabel l4 = new JLabel("Sex:");
    JLabel l5 = new JLabel("Contact num. :");
    JLabel l6 = new JLabel("Age:");
    JComboBox box;
    JTextField f1 = new JTextField(20);
    JTextField f2 = new JTextField(20);
    JTextField f3 = new JTextField(20);
    JTextField f4 = new JTextField(20);
    JTextField f5 = new JTextField(20);
    Connection con;
    Statement st = null;
    ResultSet rs;

    donor_list(Connection con) {
        this.con = con;
        setTitle("Donor list");
        //super("DONOR LIST");
        panel.setLayout(null);
        add(panel);
        setSize(500, 400);
        setLocation(300, 200);
        setVisible(true);

        method();
    }

    void method() {
        panel.setBackground(Color.lightGray);
        menu1.setForeground(Color.WHITE);
        br.add(menu1);
        br.setBackground(Color.BLUE);
        setJMenuBar(br);


        String ob[] = {"A+", "0+", "0-","B","B+","B-","AB","A-"};
        box = new JComboBox(ob);
        box.setBounds(100, 100, 100, 20);
        panel.add(box);

        l1.setBounds(5, 10, 50, 20);
        l1.setForeground(Color.BLACK);
        panel.add(l1);
        f1.setBounds(100, 10, 100, 20);
        panel.add(f1);

        l2.setBounds(5, 40, 50, 20);
        l2.setForeground(Color.RED);
        panel.add(l2);
        f2.setBounds(100, 40, 100, 20);
        panel.add(f2);

        l3.setBounds(5, 70, 80, 20);
        l3.setForeground(Color.BLACK);
        panel.add(l3);
        f3.setBounds(100, 70, 100, 20);
        panel.add(f3);

        l4.setBounds(5, 100, 50, 20);
        l4.setForeground(Color.RED);
        panel.add(l4);
        //f1.setBounds(70,10,50,20);
        //panel.add(f1);

        l5.setBounds(5, 130, 80, 20);
        l5.setForeground(Color.BLACK);
        panel.add(l5);
        f4.setBounds(100, 130, 100, 20);
        panel.add(f4);

        l6.setBounds(5, 160, 50, 20);
        l6.setForeground(Color.RED);
        panel.add(l6);
        f5.setBounds(100, 160, 100, 20);
        panel.add(f5);

        b1.setBounds(5, 200, 100, 20);
        b1.addActionListener(this);
        panel.add(b1);


        b2.setBounds(130, 200, 100, 20);
        b2.addActionListener(this);
        panel.add(b2);


    }

    public static void main(String args[]) {
        // donor_list ob1=new donor_list(con);
    }

    public void actionPerformed(ActionEvent eat) {
        if (eat.getSource() == b1) {


            if (f1.getText().equals("") || f2.getText().equals("") || f3.getText().equals("") || f4.getText().equals("") || f5.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Correct Name,Id and Contract no.");
            } else {

                try {

                    String sqlx = "insert into donor_list(name,id,blood_group,sex,contact_num,age)"
                            + "values('" + f1.getText() + "','" + f2.getText() + "','" + f3.getText() + "','" + box.getSelectedItem() + "','" + f4.getText() + "','" + f5.getText() + "')";


                    st = con.createStatement();
                    st.execute(sqlx);

                    JOptionPane.showMessageDialog(null, "Record inserted successfully");
                    f2.setText("");
                    // tid.setText("");
                    f4.setText("");

                } catch (SQLException esql) {

                    JOptionPane.showMessageDialog(null, "Sorry the record you have entered already exists");

                }
            }
        }
    }
}
