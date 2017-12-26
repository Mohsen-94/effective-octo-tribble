/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asiri
 */
public class Form extends JFrame {

    String[] columnNames = {"Sunday",
        "Monday",
        "Tuesday",
        "Wednsday",
        "Thursday"};
    Object[][] data = new Object[8][5];
    int count = 0;

    public Form(ArrayList<Schedule> List) throws HeadlessException {
        data= List.get(count).getArr();
        setLayout(new BorderLayout());
        JPanel p1, p2;
        p1 = new JPanel();
        p2 = new JPanel(new FlowLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        
        
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        p1.add(scrollPane);
        
        table.setRowHeight(40);
        this.pack();
        

        JButton b1;
        b1 = new JButton("Next".concat(" (".concat(Integer.toString(count + 1)).concat("/").concat(Integer.toString(List.size()).concat(")"))));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (count==0) {
                    count++;
                    
                }

                if (count < List.size()) {
                    DefaultTableModel model = new DefaultTableModel(List.get(count).getArr(), columnNames);
                    table.setModel(model);
                    b1.setText("Next".concat(" (".concat(Integer.toString(count + 1)).concat("/").concat(Integer.toString(List.size()).concat(")"))));
                    count++;

                }

            }
        });

        p2.add(b1);

    }

}
