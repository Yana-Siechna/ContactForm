package firstjframeapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ContactForm extends JFrame{
    
    private JTextField name_field;
    private JTextField email_field;

    public ContactForm(){
        super("Contact form");
        super.setBounds(500, 200, 350, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Enter ur name: ");
        name_field = new JTextField("", 1);

        JLabel email = new JLabel("Enter ur email: ");
        email_field = new JTextField("", 1);
        
        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(female);
        group.add(male);

        container.add(female);
        container.add(male);

        JCheckBox checkBox = new JCheckBox("Agree?", true);
        container.add(checkBox);

        JButton btn = new JButton("Send?");
        btn.addActionListener(new ButtonEventListener());
        container.add(btn);

    }
    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
          String name = name_field.getText();
          String email = email_field.getText();

          String isMale = "Male";
          if(!male.isSelected()){
            isMale = "Female";
          }

          boolean isCheck = checkBox.isSelected();
          
          JOptionPane.showMessageDialog(null, "Ur email:  " + email + "/n You: " + isMale + "Do u agree? " + isCheck,
                  "Hi, " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }
}