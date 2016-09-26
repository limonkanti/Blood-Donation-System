package blood_donation_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    ImageIcon ic;
    //  String allpost[]={"All Blood Groups","A+ (A Positibe) ","A- (A Negative)","B+ (B Positve)","B- (B Positve)","AB+ (AB Positive)","AB- (AB Negative)","O+ (O Positive)","O- (O Negative)"};
    //JComboBox jcb=new JComboBox(allpost);
    Font font = new Font("Arial", Font.ITALIC, 70);
    Font font1 = new Font("Bold", Font.BOLD, 30);
    Font font2 = new Font("Bold", Font.PLAIN, 20);
    Font font3 = new Font("Bold", Font.PLAIN, 20);
    Font font4=new Font("Bold",Font.BOLD,15);


    JLabel jlb13,jlb14,jlb15,jlb16,jlb17,jlb18,jlb19,jlb20,jlb21;

    JLabel jlb22,jlb23,jlb24,jlb25,jlb26,jlb27;

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    JButton jb, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10;

    JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlb6, jlb7, jlb8, jlb9, jlb10, jlb11, jlb12;

    JPanel jp1, jp2, jp3;

    JTextField jt = new JTextField(20);
    JTextField jt2 = new JTextField(40);
  // JextField jtf3=new JTextField(20);

    // JPasswordField jtw=new JPasswordField(30);
    ImageIcon img = new ImageIcon("blood.png");
    ImageIcon img2 = new ImageIcon("index2.jpg");
    ImageIcon image;
    ImageIcon img3=new ImageIcon("mainpic.jpg");
   ImageIcon img4=new ImageIcon("new.jpg");

    JLabel lb = new JLabel(img);
    JLabel lb2 = new JLabel(img2);
    JLabel lb3=new JLabel(img3);
    JLabel lb4=new JLabel(img4);
    JMenu jm1, jm2, jm3, jm4, jm5, jm6, jm7;
    JMenuItem jmt1, jmt2, jmt3, jmt4, jmt5, jmt6, jmt7, jmt8,jmt9,jmt10,jmt11,jmt12,jmt13,jmt14;

    JMenuBar jmb = new JMenuBar();
    Scrollbar bar1, bar2;

    JButton recent_donor=new JButton("Recent_donor");

    public static Connection con;
    Statement st;
    ResultSet rs;


    //   DefaultListModel inputModel=new DefaultListModel();
    // JList inlist=new JList(inputModel);
    Main(Connection con)
    {
        this.con=con;
        setTitle("blood donate");
        jp.setBackground(Color.BLACK);
        jp.setLayout(null);
        add(jp);
        setSize(dim);

        setVisible(true);
        //borderlayout();
         scroll();
        add_mainpic();
        add_menu();
        add_method();
        //   borderlayout();
        Imag();
        image2();
      //  scroll();
        line();
        body();
   // recent_donor();
    }

    void recent_donor()
    {
    recent_donor.setBounds(10,270,100,50);
    recent_donor.setForeground(Color.ORANGE);
    jp.add(recent_donor);


    }
    void body()
    {
       lb4.setBounds(150,200,1000,200);
      jp.add(lb4);

    jlb13=new JLabel("WHO NEED BLOOD the need of blood is great.On any given day an average");
    jlb13.setFont(font4);
    jlb13.setForeground(Color.RED);
    jlb13.setBounds(720,320,1000,30);
    jp.add(jlb13);

    jlb14=new JLabel("of 34,000 units of blood are needed to save precious human life from accident ");
    jlb14.setFont(font4);
    jlb14.setForeground(Color.RED);
    jlb14.setBounds(720,340,1000,30);
    jp.add(jlb14);

    jlb15=new JLabel("and burns,heart surgury.organ transplants and patients recieving treatment for");
    jlb15.setFont(font4);
    jlb15.setForeground(Color.RED);
    jlb15.setBounds(720,360,1000,30);
    jp.add(jlb15);


    jlb16=new JLabel("luiekemia ,cancer & other diseases");
    jlb16.setFont(font4);
    jlb16.setForeground(Color.RED);
    jlb16.setBounds(720,380,1000,30);
    jp.add(jlb16);


    jlb17=new JLabel("Blood...it runs it our veins and plays a vital role in the body mechanism.But ");
    jlb17.setFont(font4);
    jlb17.setForeground(Color.WHITE);
    jlb17.setBounds(720,400,1000,30);
    jp.add(jlb17);


    jlb18=new JLabel("have you ever spared a thought for those who are fighting with some diseases ");
    jlb18.setFont(font4);
    jlb18.setForeground(Color.WHITE);
    jlb18.setBounds(720,420,1000,30);
    jp.add(jlb18);


    jlb19=new JLabel(" and need blood urgently.Act now and donate your blood without any worry.it won't" );
    jlb19.setFont(font4);
    jlb19.setBounds(720,440,1000,30);
    jlb19.setForeground(Color.WHITE);
    jp.add(jlb19);

    jlb20=new JLabel("cost you a thing but could bring back the smile onsomeone face");
    jlb20.setFont(font4);
    jlb20.setBounds(720,460,1000,30);
    jlb20.setForeground(Color.WHITE);
    jp.add(jlb20);




    }

    void scroll() {
        bar1 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,2000);
        jp.add(bar1);
        add("East", bar1);
        bar2 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,2000);
        jp.add(bar2);
        add("South", bar2);


    }

    void add_mainpic()
    {
    lb3.setBounds(0,200,200,400);
    jp.add(lb3);

    }

    /*void BorderBox() {

        jp1 = new JPanel();




    } */

    void add_menu() {
        jmb.setBackground(Color.WHITE);
        jm1 = new JMenu("File");
        jm1.setForeground(Color.red);
        //jm1.addActionListener(this);

        jm2 = new JMenu("View");
        jm2.setForeground(Color.BLUE);
        
        jmt6=new JMenuItem("view for donor list");
         jmt6.addActionListener(this);
        jm2.add(jmt6);
       

         jmt7=new JMenuItem("view for donated list");
       jmt7.addActionListener(this);
         jm2.add(jmt7);
        

        jm3 = new JMenu("Edit");
        jm3.setForeground(Color.red);
        jmt4=new JMenuItem("Delete for donated list");
        jmt4.addActionListener(this);

        jmt8=new JMenuItem("Search");
        jmt8.addActionListener(this);
        jm3.add(jmt4);
        jm3.add(jmt8);



        jmt9=new JMenuItem("update");
        jmt9.addActionListener(this);
        jm3.add(jmt9);



        jm4 = new JMenu("About");
        jm4.setForeground(Color.BLUE);

        jm5 = new JMenu("Help");
        jm5.setForeground(Color.red);

        
        jmt1 = new JMenuItem("Donor list");
        jmt1.addActionListener(this);
        jm1.add(jmt1);

        jmt2 = new JMenuItem("Donated List");
        jmt2.addActionListener(this);
        jm1.add(jmt2);

        jmt10=new JMenuItem("Recent donor list");
        jmt10.addActionListener(this);
        jm1.add(jmt10);

        jmt3 = new JMenuItem("What we Do", new ImageIcon("Help.gif"));
        jmt3.addActionListener(this);

        
        jmt5=new JMenuItem("Instruction");
        jmt5.addActionListener(this);
        jm5.add(jmt5);
        jm4.add(jmt3);
        
        //jm4.add(jmt5);

        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);


        setJMenuBar(jmb);



    }

    void Imag() {
        lb.setBounds(70, 0, 100, 120);
        jp.add(lb);
        lb2.setBounds(1400, 0, 200, 120);
        jp.add(lb2);
    }

    void image2() {
        image = new ImageIcon("index2.jpg");
        jlb10 = new JLabel(image);
        jlb10.setBounds(810, 0, 550, 110);
        jp.add(jlb10);


    }

    void line() {

        jlb12 = new JLabel("______________________________________________________________________________");
        jlb12.setForeground(Color.WHITE);
        jlb12.setFont(font1);
        jlb12.setBounds(0, 90, 2000, 50);
        jp.add(jlb12);

        jlb22=new JLabel("---------------------------------");
        jlb22.setForeground(Color.WHITE);
        jlb22.setFont(font1);
        jlb22.setBounds(10,300,1000,20);
        jp.add(jlb22);


    }

    void add_method() {

        jlb2 = new JLabel("DONATE BLOOD");
        jlb2.setForeground(Color.red);
        jlb2.setFont(font);
        jlb2.setBounds(250, 30, 1000, 50);
        jp.add(jlb2);
        jlb1 = new JLabel("Save People And Be Saved........");
        jlb1.setForeground(Color.WHITE);
        jlb1.setFont(font1);
        jlb1.setBounds(250, 60, 1000, 70);
        jp.add(jlb1);
        jb = new JButton();
        jb.setBounds(0, 180, 900, 60);
        jb.setBackground(Color.RED);
        jb3 = new JButton();
        jb3.setBounds(10, 170, 200, 50);
        jb3.setBackground(Color.red);
        jb3.addActionListener(this);
        jlb3 = new JLabel("HOME");
        jlb3.setBackground(Color.WHITE);
        jb3.add(jlb3);
        jp.add(jb3);

        jb4 = new JButton();
        jb4.setBackground(Color.LIGHT_GRAY);
        jb4.setBounds(229, 170, 200, 50);
        jlb4 = new JLabel("Live Saver");
        jlb4.setBackground(Color.WHITE);
        jb4.addActionListener(this);

        jb4.add(jlb4);
        jp.add(jb4);


        jb5 = new JButton();
        jb5.setBackground(Color.red);
        jb5.setBounds(445, 170, 200, 50);
        jlb5 = new JLabel("Tips");
        jb5.addActionListener(this);
        jlb5.setBackground(Color.WHITE);
        jb5.add(jlb5);
        jp.add(jb5);


        jb6 = new JButton();
        jb6.setBackground(Color.LIGHT_GRAY);
        jb6.setBounds(660, 170, 200, 50);
        jlb6 = new JLabel("FEATURES");
        jlb6.setBackground(Color.BLACK);
        jb6.addActionListener(this);
        jb6.add(jlb6);
        jp.add(jb6);


        jb7 = new JButton();
        jb7.setBackground(Color.red);
        jb7.setBounds(880, 170, 200, 50);
        jlb7 = new JLabel("RULES");
        jlb7.setBackground(Color.WHITE);
        jb7.addActionListener(this);
        jb7.add(jlb7);
        jp.add(jb7);

        jb8 = new JButton();
        jb8.setBackground(Color.LIGHT_GRAY);
        jb8.setBounds(1099, 170, 200, 50);
        jlb8 = new JLabel("FACTS & FIGURES");
        jb8.addActionListener(this);
        //  jlb8.setBackground(Color.red);
        jb8.add(jlb8);
        jp.add(jb8);

        //jcb.setBounds(10,200,250,40);
        //jp.add(jcb);
        //jb9 = new JButton("Login");
       // jlb9 = new JLabel("email:");
        //jlb9.setFont(font2);
        //jlb9.setForeground(Color.WHITE);
        //jlb9.setBounds(10, 250, 150, 40);
        //jp.add(jlb9);
       // jt.setBounds(110, 250, 150, 40);
        //jp.add(jt);
        //jlb10 = new JLabel("password:");
        //jlb10.setFont(font3);
        //jlb10.setForeground(Color.WHITE);
        //jlb10.setBounds(10, 300, 100, 40);
        //jp.add(jlb10);
        //jtw.setBounds(110,300,150,40);
        //jp.add(jtw);
       // jp.add(jb9);
       // jb9.setBounds(50, 350, 100, 40);



    }

    public static void main(String[] args) {
        Main ob = new Main(con);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb3) {

       introduction mh = new introduction();

        }
        if(e.getSource()==jmt4)
        {
         new Delete(con);

        }
        if(e.getSource()==jmt9)
        {
        new Update(con);

        }
        if(e.getSource()==jmt8)
        {
        new Search(con);
        }
        if(e.getSource()==jmt10)
        {
        new Recent_donor(con);
        }
        if(e.getSource()==jb4)
        {
        life_saver lie=new life_saver();

        }
        if(e.getSource()==jb5)
        {
        tips tip=new tips();
        }
        if(e.getSource()==jb6)
        {
     Features fear=new Features();

        }
        if(e.getSource()==jb7)
        {
        rules rule=new rules();
        }
        if(e.getSource()==jb8)
        {
        fact_figure figure=new fact_figure();

        }
        if(e.getSource()==jmt2)
        {
        new donated_list(con);
        }

        if (e.getSource() == jmt1)
        {
             new donor_list(con);
        }
        if(e.getSource()==jmt3)
        {
        what_we_do wt=new what_we_do();
        }
        if(e.getSource()==jmt6)
        {

         new view_for_donor_list(con);

        }
        if(e.getSource()==jmt7)
        {
        new view_for_donated_list(con);

        }
    if(e.getSource()==jmt5)
    {
    new Help();
    }
    
    }

}
