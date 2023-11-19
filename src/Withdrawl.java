import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    JButton withdraw,back;
    JTextField amount;
    String pinnumber;

    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 900,900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(190,300,400,20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(175,350,320,35);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setFont(new Font("System",Font.BOLD,15));
        withdraw.setBounds(350,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setFont(new Font("System",Font.BOLD,15));
        back.setBounds(350,520,150,30);
        back.addActionListener(this);
        image.add(back);


        getContentPane().setBackground(Color.WHITE);
        setSize(900,900);
        setLocation(300,10);
        setTitle("ATM");
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdraw){
            String number  = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to Withdraw");
            } else {
                try {
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+number+" Withdrawl Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if(ae.getSource()== back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);

        }
    }


    public static void main(String[] args) {
        new Withdrawl("");
    }


}

