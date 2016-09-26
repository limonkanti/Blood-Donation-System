package blood_donation_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    JMenu file = new JMenu("Entry_Result");
    JMenuItem np = new JMenuItem("Entry_1st_Year_Result");
    JMenu view = new JMenu("View_Result");
    JMenuItem view_all = new JMenuItem("View_1st_Year_Result");
    JMenuItem exit = new JMenuItem("Exit");
    //JDesktopPane pane = new  JDesktopPane();
    Connection con;
    Statement st = null;
    ResultSet res;
    JDesktopPane pane = new JDesktopPane();

    public MainFrame(Connection con) {
        super("MainFrame");
        this.con = con;
         menu();
        add(pane);
        setSize(dim);
        setVisible(true);
       

    }

    void menu() {



        JMenuBar mb = new JMenuBar();



        file.add(np);
        view.add(view_all);
        np.addActionListener(this);
        view_all.addActionListener(this);
       // np.setBackground(Color.BLUE);
       // np.setForeground(Color.cyan);
       // np.setFont(new Font("", Font.BOLD, 15));

        //view_all.setBackground(Color.BLUE);
        //view_all.setForeground(Color.cyan);
        //view_all.setFont(new Font("", Font.BOLD, 15));
        file.add(exit);
        mb.add(file);
        mb.add(view);
        setJMenuBar(mb);



    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == np) {
            entry ob = new entry(con);

            pane.add(ob);
            // dispose();


        }
        if (ae.getSource() == view_all) {
            //view_al_caling ob1=new view_al_caling();
           view_al_caling ob = new view_al_caling(con);
           pane.add(ob);
           // pane.add(ob1);

           // dispose();
        }
        
                {
            
        }



    }
}
