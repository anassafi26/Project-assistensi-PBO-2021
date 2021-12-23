package Gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import Controller.AllObjectController07331;

public class ResultGui07331 {
    JFrame result07331;  
    JButton back07331;

    public ResultGui07331(){
        result07331 = new JFrame("GUI");
        result07331.setSize(1000,700);
        result07331.getContentPane() .setBackground(Color.CYAN);

        JLabel judul07331 = new JLabel ("Hasil Klaster");
        judul07331.setBounds(300, 30, 400, 50);
        judul07331.setFont(new Font("Times New Roman",Font.BOLD,40));
        result07331.add(judul07331);

        JTextArea area07331 = new JTextArea(); 
        JScrollPane scroll07331 = new JScrollPane(area07331); 
        scroll07331.setBounds (30, 150, 900, 400); 
        result07331.add(scroll07331);
               area07331.setText(AllObjectController07331.recordController07331.ViewDataRecord07331() + AllObjectController07331.clusterController07331.viewDataCluster());
        
        back07331 = new JButton ("Back") ; 
        back07331.setBounds(30, 500, 80, 30); 
        back07331.setBackground(Color.red); 
        result07331.add(back07331); 
        
      result07331.setLocationRelativeTo(null); 
        result07331.setLayout(null); 
        result07331.setVisible(true);
        result07331.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back07331.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent ae) {
                RecordGui07331 recordgui07331 = new RecordGui07331(); 
                result07331.dispose(); 
            }
        });
    }
}
