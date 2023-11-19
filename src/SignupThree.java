import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton save, fd, current, rd;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {
        this.formno =formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290, 50, 400, 30);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        save = new JRadioButton("Saving Account");
        save.setBackground(Color.WHITE);
        save.setFont(new Font("Raleway", Font.BOLD, 16));
        save.setBounds(100, 180, 250, 20);
        add(save);

        fd = new JRadioButton("Fixed Deposit Account");
        fd.setBackground(Color.WHITE);
        fd.setFont(new Font("Raleway", Font.BOLD, 16));
        fd.setBounds(350, 180, 250, 20);
        add(fd);

        current = new JRadioButton("Current Account");
        current.setBackground(Color.WHITE);
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBounds(100, 220, 150, 20);
        add(current);

        rd = new JRadioButton("Recurring Deposit Account");
        rd.setBackground(Color.WHITE);
        rd.setFont(new Font("Raleway", Font.BOLD, 16));
        rd.setBounds(350, 220, 250, 20);
        add(rd);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(save);
        accountgroup.add(rd);
        accountgroup.add(fd);
        accountgroup.add(current);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-1234");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel carddetail = new JLabel("Your 16-digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 200, 30);
        add(pnumber);

        JLabel pcarddetail = new JLabel("Your 4-digit Pin Number");
        pcarddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pcarddetail.setBounds(100, 400, 300, 20);
        add(pcarddetail);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 300, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(300, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(300, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(300, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I Hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.WHITE);
        setSize(750, 800);
        setLocation(400, 45);
        setTitle("NEW ACCOUNT APPLICATION FORM PAGE -3");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (save.isSelected()) {
                accountType = "Savings Account";
            } else if (rd.isSelected()) {
                accountType = "Recurring Deposit Account";
            } else if (current.isSelected()) {
                accountType = "Current Account";
            } else if (fd.isSelected()) {
                accountType = "Fixed Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";
            if (c1.isSelected()) {
                facility = facility + "ATM Card";
            } else if (c2.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (c3.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if (c4.isSelected()) {
                facility = facility + "EMAIL & SMS Alerts";
            } else if (c5.isSelected()) {
                facility = facility + "Cheque Book";
            } else if (c6.isSelected()) {
                facility = facility + "E-Statement";
            }

            try {
                 if(accountType.equals("")){
                     JOptionPane.showMessageDialog(null,"Account Type is Required");
                 } else {
                     Conn conn = new Conn();
                     String query1 = "insert into signupThree values('" + formno + "', '" + accountType + "', '" + cardnumber + "', '" + pinnumber + "', '" + facility + "')";
                     String query2 = "insert into login values('" + formno + "', '" + cardnumber + "','" + pinnumber + "')";

                     conn.s.executeUpdate(query1);
                     conn.s.executeUpdate(query2);

                             JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                 }
                 setVisible(false);
                 new Deposit(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);

        }
    }


    public static void main(String[] args) {
        new SignupThree("");
    }

}
