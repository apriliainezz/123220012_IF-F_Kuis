/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis123220012;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener{
    
    private JPanel panel;
    private Object mjdewasap;
   

    public HalamanUtama(String Username) {
        PopupMenu panel = null;
        
       
        
        setVisible(true);
        setSize(750, 740);
        setTitle("Halaman Utama (pilih)");
       
        
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel headerutama = new JLabel();
    JLabel ket2 = new JLabel("Silahkan Pilih Menu Di Bawah Ini Untuk Membeli Majalah");
    
    JButton mjanak = new JButton("Majalah Anak");
    JButton mjremaja = new JButton("Majalah Remaja");
    JButton mjdewasa = new JButton("Majalah Dewasa");
        
        add(headerutama);
        headerutama.setText("Selamat Datang, " + Username );
        headerutama.setFont(new Font("arial", Font.BOLD, 21));
        headerutama.setBounds(30, 30, 360, 40);
        
        add(ket2);
        ket2.setFont(new Font("arial", Font.BOLD, 15));
        ket2.setBounds(30, 60, 700, 40);
        
        add(mjanak);
        mjanak.setBounds(30,150,485,40);
        
        add(mjremaja);
        mjremaja.setBounds(30,200,485,40);
        
        add(mjdewasa);
        mjdewasa.setBounds(30,250,485,40);
        
        mjanak.addActionListener(this);
        mjremaja.addActionListener(this);
        mjdewasa.addActionListener(this);
        add(panel);
        MenuItem mjanakp = null;
        
        
        panel.add(mjanakp);
        MenuItem mjremajap = null;
        panel.add(mjremajap);
        MenuItem mjdewasap = null;
        panel.add(mjdewasap);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Object mjanakp = null;
            Object mjremajap = null;
            Object mjdewasap = null;
        if(e.getSource() == mjanakp){
            new mjanak();
        }else if(e.getSource() == mjremajap){
            new mjremaja();
        }else if(e.getSource() == mjdewasap){
            new mjdewasa();
        }
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }

  

    
  
}
