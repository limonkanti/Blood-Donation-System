package blood_donation_system;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.*;

//public class view_al_caling extends JInternalFrame implements ActionListener
public class view_al_caling extends JFrame implements ActionListener
{
    
    
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

     JTable table;

    private TableModel tm;
    
    

    JLabel nameLabel = new JLabel("Enter Id:");

    JTextField nameText = new JTextField();
    
    JButton ok=new JButton("  Ok  ");




    private Vector vector[] = new Vector[6];

    String[] str = {"Name", "Dept", "Id", "Year", "Gpa"};

    private JScrollPane pane;

    Statement st;

    Connection con;

    ResultSet res;

     view_al_caling(Connection con) {




        //super("View_all_calling", true, true, true, true);

        this.con = con;

        System.out.println(str[0]);

        for (int i = 0; i < 5; i++) {


            vector[i] = new Vector();

        }
        data();

        tm = new AbstractTableModel() {

            public int getRowCount() {

                return vector[0].size();
            }

            public int getColumnCount() {

                return 5;
            }

            public String getColumnName(int colum) {
                return str[colum];
            }

            public Object getValueAt(int rowIndex, int columnIndex) {


                switch (columnIndex) {

                    case 0:
                        return vector[0].elementAt(rowIndex);
                    case 1:
                        return vector[1].elementAt(rowIndex);
                    case 2:
                        return vector[2].elementAt(rowIndex);
                    case 3:
                        return vector[3].elementAt(rowIndex);
                    case 4:
                        return vector[4].elementAt(rowIndex);
                    case 5:
                        return vector[5].elementAt(rowIndex);
                    case 6:
                        return vector[6].elementAt(rowIndex);
                    case 7:
                        return vector[7].elementAt(rowIndex);
                    case 8:
                        return vector[8].elementAt(rowIndex);
                    case 9:
                        return vector[9].elementAt(rowIndex);
                    case 10:
                        return vector[10].elementAt(rowIndex);
                    case 11:
                        return vector[11].elementAt(rowIndex);



                }
                return "";



            }
        };

        
       //  nam.setBounds(10, 20, 80, 40);
         //pane.add(nam);
         // table.add(nameLabel);
        //  table.add(nameText);
        //  table.row();
          
        // namefld.setBounds(100, 20, 80, 40);
        // table.add(namefld);
         //add(table,BorderLayout.SOUTH);

        //add(pane,BorderLayout.SOUTH);
        
        
        
        
        table = new JTable(tm);

        pane = new JScrollPane(table);

        add(pane, BorderLayout.CENTER);

      //  taxt();
       // setSize(1370, 730);
        setSize(600,550);

        setVisible(true);




    }
     
     
     
   

    public static void main(String[] args)
    {
      //   new view_al_caling(con);
    }

    void data() {

        

        try {

            String sql = "select * from new_entry";

            
            st = con.createStatement();


          
            res = st.executeQuery(sql);

            while (res.next()) {

                for (int i = 0; i < 5; i++) {

                    vector[i].addElement(res.getString(i + 1));

                }

            }



        } catch (Exception ex) 
            
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }



    }

    public void actionPerformed(ActionEvent e)
    {


    }
}
