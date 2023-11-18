import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
    Long random;
    JTextField nameTextfield, fnameTextfield, addTextfield, emailTextfield, cityTextfield, stateTextfield, pincodeTextfield;
    JButton next;
    JRadioButton male, female, no, other, married, unmarried;
    JDateChooser dateChooser;
     SignupOne(){
         setLayout(null);

         Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L) + 1000L);
         JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
         formno.setFont(new Font("Raleway",Font.BOLD, 38));
         formno.setBounds(140,20,600,40);
         add(formno);

         JLabel personalDetails = new JLabel("Page 1: Personal Details");
         personalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
         personalDetails.setBounds(290,80,400,30);
         add(personalDetails);

         JLabel name = new JLabel("Name:");
         name.setFont(new Font("Raleway",Font.BOLD, 20));
         name.setBounds(100,140,100,30);
         add(name);

         nameTextfield = new JTextField();
         nameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         nameTextfield.setBounds(300,140,400,30);
         add(nameTextfield);

         JLabel fname = new JLabel("Father's Name:");
         fname.setFont(new Font("Raleway",Font.BOLD, 20));
         fname.setBounds(100,190,200,30);
         add(fname);

         fnameTextfield = new JTextField();
         fnameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         fnameTextfield.setBounds(300,190,400,30);
         add(fnameTextfield);

         JLabel dob = new JLabel("Date Of Birth:");
         dob.setFont(new Font("Raleway",Font.BOLD, 20));
         dob.setBounds(100,240,200,30);
         add(dob);

         dateChooser = new JDateChooser();
         dateChooser.setBounds(300,240,400,30);
         dateChooser.setForeground(Color.BLACK);
         add(dateChooser);

         JLabel gen = new JLabel("Gender:");
         gen.setFont(new Font("Raleway",Font.BOLD, 20));
         gen.setBounds(100,290,200,30);
         add(gen);

         male = new JRadioButton("Male");
         male.setBounds(300,290,60,30);
         male.setBackground(Color.WHITE);
         add(male);
         female = new JRadioButton("Female");
         female.setBackground(Color.WHITE);
         female.setBounds(450,290,100,30);
         add(female);
         no = new JRadioButton("Other");
         no.setBackground(Color.WHITE);
         no.setBounds(630,290,60,30);
         add(no);

         ButtonGroup gendergroup = new ButtonGroup();
         gendergroup.add(male);
         gendergroup.add(female);
         gendergroup.add(no);

         JLabel email = new JLabel("Email Address:");
         email.setFont(new Font("Raleway",Font.BOLD, 20));
         email.setBounds(100,340,200,30);
         add(email);

         emailTextfield = new JTextField();
         emailTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         emailTextfield.setBounds(300,340,400,30);
         add(emailTextfield);

         JLabel marital = new JLabel("Marital Status:");
         marital.setFont(new Font("Raleway",Font.BOLD, 20));
         marital.setBounds(100,390,200,30);
         add(marital);

         married = new JRadioButton("Married");
         married.setBackground(Color.WHITE);
         married.setBounds(300,390,100,30);
         add(married);
         unmarried = new JRadioButton("Unmarried");
         unmarried.setBackground(Color.WHITE);
         unmarried.setBounds(450,390,100,30);
         add(unmarried);
         other = new JRadioButton("Other");
         other.setBackground(Color.WHITE);
         other.setBounds(630,390,100,30);
         add(other);

         ButtonGroup maritalgroup = new ButtonGroup();
         maritalgroup.add(married);
         maritalgroup.add(unmarried);
         maritalgroup.add(other);


         JLabel add = new JLabel("Address:");
         add.setFont(new Font("Raleway",Font.BOLD, 20));
         add.setBounds(100,440,200,30);
         add(add);

         addTextfield = new JTextField();
         addTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         addTextfield.setBounds(300,440,400,30);
         add(addTextfield);

         JLabel city = new JLabel("City:");
         city.setFont(new Font("Raleway",Font.BOLD, 20));
         city.setBounds(100,490,200,30);
         add(city);

         cityTextfield = new JTextField();
         cityTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         cityTextfield.setBounds(300,490,400,30);
         add(cityTextfield);

         JLabel state = new JLabel("State:");
         state.setFont(new Font("Raleway",Font.BOLD, 20));
         state.setBounds(100,540,200,30);
         add(state);

         stateTextfield = new JTextField();
         stateTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         stateTextfield.setBounds(300,540,400,30);
         add(stateTextfield);

         JLabel pincode = new JLabel("Pin Code:");
         pincode.setFont(new Font("Raleway",Font.BOLD, 20));
         pincode.setBounds(100,590,200,30);
         add(pincode);

         pincodeTextfield = new JTextField();
         pincodeTextfield.setFont(new Font("Raleway",Font.BOLD,14));
         pincodeTextfield.setBounds(300,590,400,30);
         add(pincodeTextfield);

         next = new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,660,80,30);
         next.addActionListener(this);
         add(next);

         getContentPane().setBackground(Color.WHITE);
         setSize(850,800);
         setLocation(350,10);
         setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == next){
             setVisible(false);
             new SignupTwo("").setVisible(true);
         }
        String formno = "" + random;
        String name = nameTextfield.getText();
        String fname = fnameTextfield.getText();
        String dob = (((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        } else if (no.isSelected()) {
            gender = "Other";}
        String email = emailTextfield.getText();
        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String add = addTextfield.getText();
        String city = cityTextfield.getText();
        String state = stateTextfield.getText();
        String pincode = pincodeTextfield.getText();

        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values ";
            }
        } catch (Exception e) {
            System.out.println(e);
        }



    }

    public static void main(String[] args) {
       new SignupOne();
    }
}


