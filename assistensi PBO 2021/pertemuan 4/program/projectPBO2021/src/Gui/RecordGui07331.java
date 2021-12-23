package Gui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import Model.AllObjectModel07331;
import Controller.AllObjectController07331;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.zip.DataFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecordGui07331 {
   
    JFrame frame_record07331;
    JButton insert07331,update07331,delete07331,hasil07331;
    JTextField textProvinsi07331,textTingkatKematian07331,textJumlahKasus07331,textPotensiPenularan07331;
   
    public RecordGui07331(){
        frame_record07331 = new JFrame("GUI");
        frame_record07331.setSize(1000,700);
        frame_record07331.getContentPane().setBackground(Color.cyan);
        
        JLabel judul = new JLabel("Klaster Covid 19");
        judul.setBounds(300, 30, 400, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        frame_record07331.add(judul); 

        JLabel labelProvinsi = new JLabel("Provinsi"); 
        labelProvinsi.setBounds(30, 100, 100, 30); 
        frame_record07331.add(labelProvinsi); 
        
        textProvinsi07331 = new JTextField(); 
        textProvinsi07331.setBounds(140, 100, 320, 30); 
        frame_record07331.add(textProvinsi07331);

        JLabel labelTingkatKematian = new JLabel("Tingkat Kematian");
        labelTingkatKematian.setBounds(30, 200, 100, 30); 
        frame_record07331.add(labelTingkatKematian);

        textTingkatKematian07331 = new JTextField(); 
        textTingkatKematian07331.setBounds(140, 200, 320, 30); 
        frame_record07331.add(textTingkatKematian07331); 
        
        JLabel labelJumlahKasus = new JLabel("Jumlah Kasus"); 
        labelJumlahKasus.setBounds(30, 300, 100, 30); 
        frame_record07331.add(labelJumlahKasus); 

        textJumlahKasus07331 = new JTextField(); 
        textJumlahKasus07331.setBounds(140, 300, 320, 30); 
        frame_record07331.add(textJumlahKasus07331); 

        JLabel labelPotensiPenularan = new JLabel("Potensi Penularan");
        labelPotensiPenularan.setBounds(30, 400, 100, 30); 
        frame_record07331.add(labelPotensiPenularan); 

        textPotensiPenularan07331 = new JTextField(); 
        textPotensiPenularan07331.setBounds(140, 400, 320, 30); 
        frame_record07331.add(textPotensiPenularan07331);

        insert07331 = new JButton("Insert"); 
        insert07331.setBounds(140, 500, 80, 30); 
        insert07331.setBackground(Color.GREEN); 
        frame_record07331.add(insert07331); 

        update07331 = new JButton("Update"); 
        update07331.setBounds(260, 500, 80, 30); 
        update07331.setBackground(Color.GREEN); 
        frame_record07331.add(update07331); 

        delete07331 = new JButton("Delete"); 
        delete07331.setBounds(380, 500, 80, 30); 
        delete07331.setBackground(Color.RED); 
        frame_record07331.add(delete07331);

        JTable tabelRecord07331 = new JTable();
        JScrollPane scroll = new JScrollPane(tabelRecord07331);
        scroll.setBounds(500, 100, 450, 430); 
        frame_record07331.add(scroll); 
        tabelRecord07331.setModel(viewTabelBarang());

        tabelRecord07331.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int i07331 = tabelRecord07331.getSelectedRow(); 
                String provinsi07331 = tabelRecord07331.getModel() .getValueAt(i07331, 0) .toString();
                String tingkatKematian07331 = tabelRecord07331.getModel().getValueAt(i07331, 1) .toString();
                String jumlahKasus07331 = tabelRecord07331.getModel().getValueAt(i07331, 2) .toString();
                String potensiPenularan07331 = tabelRecord07331.getModel().getValueAt(i07331, 3).toString();
                textProvinsi07331.setText(provinsi07331); 
                textTingkatKematian07331.setText(tingkatKematian07331); 
                textJumlahKasus07331.setText(jumlahKasus07331); 
                textPotensiPenularan07331.setText(potensiPenularan07331);
            }
        });

        insert07331.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent ae) {
                try {
                    String provinsi07331 = textProvinsi07331.getText(); 
                    int tingkatKematian07331 = Integer.parseInt(textTingkatKematian07331.getText());
                    int jumlahKasus07331 = Integer.parseInt(textJumlahKasus07331.getText());
                    int potensiPenularan07331 = Integer.parseInt(textPotensiPenularan07331.getText());
                    
                    AllObjectController07331.recordController07331.InsertRecord07331(provinsi07331, tingkatKematian07331, jumlahKasus07331, potensiPenularan07331); 
                    tabelRecord07331.setModel(viewTabelBarang());
                    refreshText(); 
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Format ada yang salah","information",JOptionPane.INFORMATION_MESSAGE);
                    refreshText(); 
                }
            }
        });

        update07331.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent ae){ 
                try {
                    String provinsi07331 = textProvinsi07331.getText(); 
                    int tingkatKematian07331 = Integer.parseInt(textTingkatKematian07331.getText()); 
                    int jumlahKasus07331 = Integer.parseInt(textJumlahKasus07331.getText());
                    int potensiPenularan07331 = Integer.parseInt(textPotensiPenularan07331.getText()); 
                    int i07331 = tabelRecord07331.getSelectedRow();
                    AllObjectController07331.recordController07331.UpdateRecord07331(i07331, provinsi07331, tingkatKematian07331, jumlahKasus07331, potensiPenularan07331);
                    tabelRecord07331.setModel(viewTabelBarang());
                    refreshText();
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Format ada yang salah","information",JOptionPane.INFORMATION_MESSAGE);
                    refreshText();
                }
            }
        });

        delete07331.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent ae) {
                int i07331 = tabelRecord07331.getSelectedRow(); 
                int result = JOptionPane.showConfirmDialog(null, "Yakin Hapus Data?",null, JOptionPane.YES_NO_OPTION); 
                if(result == JOptionPane.YES_OPTION){
                    AllObjectController07331.recordController07331.DeleteRecord07331(i07331);
                    tabelRecord07331.setModel(viewTabelBarang());
                    refreshText();
                }else{
                    refreshText();
                }
            }
        });

        hasil07331 = new JButton("Hasil"); 
        hasil07331.setBounds(870, 600, 80, 30); 
        hasil07331.setBackground(Color.yellow); 
        frame_record07331.add(hasil07331); 

        frame_record07331.setLocationRelativeTo(null); 
        frame_record07331.setLayout(null); 
        frame_record07331.setVisible(true); 
        frame_record07331.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hasil07331.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent ae) {
                AllObjectController07331.clusterController07331.initializeClusterAndCentroid(3); 
                ResultGui07331 res07331 = new ResultGui07331(); 
                frame_record07331.dispose(); 
            }
        });
    }
    public DefaultTableModel viewTabelBarang(){
        DefaultTableModel dataRecord07331 = new DefaultTableModel();
        Object[] kolom = {"Provinsi", "TingkatKematian","Jumlah Kasus","Potensi Kematian"};
        dataRecord07331.setColumnIdentifiers(kolom);
        
        int panjang = AllObjectModel07331.modelRecord07331.getData07331().size();
        for (int i07331 = 0; i07331 < panjang; i07331++) {
            Object[] data07331 = new Object[4];
            data07331[0] = AllObjectModel07331.modelRecord07331.getData07331().get(i07331).getProvinsi07331();
            data07331[1] = AllObjectModel07331.modelRecord07331.getData07331().get(i07331).getTingkatKematian07331();
            data07331[2] = AllObjectModel07331.modelRecord07331.getData07331().get(i07331).getJumlahKasus07331();
            data07331[3] = AllObjectModel07331.modelRecord07331.getData07331().get(i07331).getPotensiPenularan07331();
            dataRecord07331.addRow(data07331);
        }
        return dataRecord07331;
    }
    
    public void refreshText() {
        textProvinsi07331.setText(null);
        textTingkatKematian07331.setText(null);
        textJumlahKasus07331.setText(null);
        textPotensiPenularan07331.setText(null);
    }
}
