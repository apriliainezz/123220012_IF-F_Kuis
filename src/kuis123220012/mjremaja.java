/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis123220012;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class mjremaja extends JFrame implements ActionListener {
    JLabel ketremaja = new JLabel("Halaman Pembelian");
    JLabel kategorir = new JLabel("Kategori = Majalah Remaja");
    JLabel hargar = new JLabel("Harga : Rp15,200/pcs");
    JLabel jumlahr = new JLabel("Jumlah : ");
    JTextField Jumlahr = new JTextField();
    JLabel ttlbelir = new JLabel("Total Pembelian");
    JLabel hargasr = new JLabel("Harga Satuan : Rp15.200");
    
    JLabel jmlr = new JLabel("Jumlah");
    JLabel hasiljmlr = new JLabel("[hasil berupa angka");
    
    JLabel ttlhargar = new JLabel("Total Harga");
    JLabel hasilhargar = new JLabel("[Hasil berupa angka");
    
    JButton belir = new JButton("Beli");
    
    public mjremaja(){
        setVisible(true);
        setSize(750,740);
        setTitle("Pembelian Majalah Anak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(ketremaja);
        ketremaja.setBounds(30, 30, 360, 40);
        
        add(kategorir);
        kategorir.setBounds(30, 60, 360, 40);
        
        add(hargar);
        hargar.setBounds(30, 90, 360, 40);
        
        add(jumlahr);
        jumlahr.setBounds(30, 120, 100, 20);
        
        add(Jumlahr);
        Jumlahr.setBounds(155, 110, 386, 40);
        
        add(belir);
        belir.setBounds(30, 270, 560, 40);
        
        add(ttlbelir);
        ttlbelir.setBounds(296, 380, 100, 20);
        
        add(hargasr);
        hargasr.setBounds(30, 420, 150, 20);
        
        add(jmlr);
        jmlr.setBounds(30, 440, 150, 20);
        add(hasiljmlr);
        hasiljmlr.setBounds(200, 440, 200, 20);
        
        add(ttlhargar);
        ttlhargar.setBounds(30, 460, 150, 20);
        add(hasilhargar);
        hasilhargar.setBounds(200, 460, 200, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

