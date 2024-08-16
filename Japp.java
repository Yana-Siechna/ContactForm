package firstjframeapp;

import javax.swing.JFrame;

public class Japp {
    public static void main(String[] args) {
        ContactForm form = new ContactForm();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setSize(300, 300);
        
    }
}