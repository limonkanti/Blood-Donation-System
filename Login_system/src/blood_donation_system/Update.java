
package blood_donation_system;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Update extends JFrame implements ActionListener
{
     JLabel id_label=new JLabel("Enter id       : ");

     JTextField id_tf=new JTextField(15);

     JButton ok=new JButton("Ok",new ImageIcon("image/save_all.png"));

    //JLabel lbook_code;
    JLabel cont_label=new JLabel("Enter contact: ");
    //JTextField tbook_code;
    JTextField cont_tf=new JTextField(15);
    //JLabel line_label=new JLabel("Enter id and new contract number which you want to update");

    JButton back=new JButton("Back",new ImageIcon("image/Regis.png"));

    JPanel panal=new JPanel();

    Connection con;

    Statement st ;

    ResultSet rs;
    ImageIcon ic=new ImageIcon();
    ImageIcon icmain;
    //JLabel label1,label22,label33;

    Update(Connection con)
    {
        super("Upadate Donor_list ");

        this.con=con;

        panal.setLayout(null);

        add(panal);

        setSize(500,450);

        setVisible(true);
        setResizable(false);
        setLocation(280,120);
        lax_tfild();
       // Image();


    }
    void lax_tfild()
    {
       // line_label.setBounds(50, 30, 350, 40);
       // line_label.setForeground(Color.GREEN);
       // panal.add(line_label);

        id_label.setBounds(100, 100, 110, 40);
        panal.add(id_label);
        id_tf.setBounds(220, 100, 180, 40);
        panal.add(id_tf);

        //con_label=new JLabel("Contract     : ");
        cont_label.setBounds(100, 150, 110, 40);
       // con=new JTextField(15);
        cont_tf.setBounds(220, 150, 180, 40);
        panal.add(cont_label);
        panal.add(cont_tf);


        ok.setBounds(100, 330, 150, 40);
        ok.addActionListener(this);
        panal.add(ok);

        back.setBounds(260, 330, 150, 40);
        back.addActionListener(this);
        panal.add(back);
    }
   void Image()
  {
    /* icmain=new ImageIcon("image/Contract222.jpg");
     label1=new JLabel(icmain);
     label1.setBounds(5, 5, 300,70);
     panal.add(label1);*/


  }

    public void actionPerformed(ActionEvent exx)
    {
       if(exx.getSource()==ok)

       {
           if(id_tf.getText().equals("")||cont_tf.getText().equals(""))
           {
               JOptionPane.showMessageDialog(null, "Please enter correct id");
           }

           else
           {
            try
            {


               Statement st = con.createStatement();
               PreparedStatement ps= con.prepareStatement("Update donor_list set contact_num='"+cont_tf.getText()+"' where id='" + id_tf.getText()+"'");
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Update Successfully");
              // id_tf.setText("");
              // cont_tf.setText("");
            }
            catch(Exception ex)
            {

                JOptionPane.showMessageDialog(null,"The quere is wrong\n");

            }
           }
       }
       if(exx.getSource()==back)
       {
          // new Main(con);
           dispose();
       }


    }

    }
