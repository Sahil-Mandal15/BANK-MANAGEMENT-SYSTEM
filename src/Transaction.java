import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {

    JButton deposit,withdrwal,fastcash,ministatement,pinchange,exit,balanceenquiry;

    Transaction(){

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrwal = new JButton("Cash Withdrawl");
        withdrwal.setBounds(355,415,150,30);
        withdrwal.addActionListener(this);
        image.add(withdrwal);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton("Print Mini Statement");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("Change Pin");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);

        getContentPane().setBackground(Color.WHITE);
        setSize(900,900);
        setLocation(300,10);
        setTitle("ATM");
        setUndecorated(true);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == exit){
           System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Transaction();
    }




}
