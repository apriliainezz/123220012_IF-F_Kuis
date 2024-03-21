/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis123220012;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class loginpage extends JFrame implements ActionListener {
    JLabel header = new JLabel("Selamat Datang!");
    JLabel ket1 = new JLabel("Silahkan Masuk Untuk Melanjutkan!");
    JLabel username = new JLabel("Username");
    JLabel pw = new JLabel("Password");
    
    JTextField inputUsername = new JTextField();
    JTextField inputPW = new JTextField();
    
    JButton login = new JButton("Login");
    
    public loginpage() throws HeadlessException{
        setVisible(true);
        setSize(750,740);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
                header.setFont(new Font("arial", Font.BOLD, 21));
                header.setBounds(30, 30, 200, 40);
                
        add(ket1);
        ket1.setFont(new Font("arial", Font.BOLD, 15));
        ket1.setBounds(30, 60, 300, 40);
        
        add(username);
        username.setBounds(30, 92, 200, 40);
        
        add(pw);
        pw.setBounds(30, 152, 200, 40);
        
        add(inputUsername);
        inputUsername.setBounds(30, 122, 485, 35);
        
        add(inputPW);
        inputPW.setBounds(30, 182, 485, 35);
        
        add(login);
        login.setBounds(30,250,485,40);
        login.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String Username = inputUsername.getText();
            String password = inputPW.getText();
            
            if(Username.isEmpty()){
                throw new Exception("Sowwry, Username Jangan Kosong! USERNAME = 123220012");
            }else if(password.isEmpty()){
                throw new Exception("Sowwry, Password Jangan Kosong! PASSWORD = 12345");
            }
            
            new HalamanUtama(Username);
            this.dispose();
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
