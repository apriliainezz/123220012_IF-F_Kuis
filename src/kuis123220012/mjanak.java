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
public class mjanak extends JFrame implements ActionListener {
    JLabel ketanak = new JLabel("Halaman Pembelian");
    JLabel kategoria = new JLabel("Kategori = Majalah Anak");
    JLabel hargaa = new JLabel("Harga : Rp12.700/pcs");
    JLabel jumlaha = new JLabel("Jumlah : ");
    JTextField Jumlaha = new JTextField();
    JLabel ttlbelia = new JLabel("Total Pembelian");
    JLabel hargasa = new JLabel("Harga Satuan : Rp12.700");
    
    JLabel jmla = new JLabel("Jumlah");
    JLabel hasiljmla = new JLabel("[hasil berupa angka");
    
    JLabel ttlhargaa = new JLabel("Total Harga");
    JLabel hasilhargaa = new JLabel("[Hasil berupa angka");
    
    JButton belia = new JButton("Beli");
    
    public mjanak(){
        setVisible(true);
        setSize(750,740);
        setTitle("Pembelian Majalah Anak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(ketanak);
        ketanak.setBounds(30, 30, 360, 40);
        
        add(kategoria);
        kategoria.setBounds(30, 60, 360, 40);
        
        add(hargaa);
        hargaa.setBounds(30, 90, 360, 40);
        
        add(jumlaha);
        jumlaha.setBounds(30, 120, 100, 20);
        
        add(Jumlaha);
        Jumlaha.setBounds(155, 110, 386, 40);
        
        add(belia);
        belia.setBounds(30, 270, 560, 40);
        
        add(ttlbelia);
        ttlbelia.setBounds(296, 380, 100, 20);
        
        add(hargasa);
        hargasa.setBounds(30, 420, 150, 20);
        
        add(jmla);
        jmla.setBounds(30, 440, 150, 20);
        add(hasiljmla);
        hasiljmla.setBounds(200, 440, 200, 20);
        
        add(ttlhargaa);
        ttlhargaa.setBounds(30, 460, 150, 20);
        add(hasilhargaa);
        hasilhargaa.setBounds(200, 460, 200, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
