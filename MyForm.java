package com.example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MyForm extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextArea pole1;
    private JTextArea pole2;
    private JButton suma;
    private JButton roznica;
    private JButton iloczyn;
    private JButton iloraz;
    private JLabel wynik;

    private double pole_dane1 = 0;
    private double pole_dane2 = 0;
    private String tekst1;
    private String tekst2;
    private double wynicek;

    MyForm() {
        super("Klakulator");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 150, 210);
        Scanner Dane = new Scanner(System.in);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        pole1 = new JTextArea();
        pole1.setBounds(10, 10, 60, 40);
        panel.add(pole1);
        tekst1 = Dane.nextLine();

        pole2 = new JTextArea();
        pole2.setBounds(10, 80, 60, 40);
        panel.add(pole2);
        tekst2 = Dane.nextLine();

        suma = new JButton("+");
        suma.setBounds(10, 60, 60, 40);
        suma.addActionListener(this);
        panel.add(suma);

        roznica = new JButton("-");
        roznica.setBounds(80, 60, 60, 40);
        roznica.addActionListener(this);
        panel.add(roznica);

        iloczyn = new JButton("×");
        iloczyn.setBounds(10, 110, 60, 40);
        iloczyn.addActionListener(this);
        panel.add(iloczyn);

        iloraz = new JButton("÷");
        iloraz.setBounds(80, 110, 60, 40);
        iloraz.addActionListener(this);
        panel.add(iloraz);

        wynik = new JLabel();
        wynik.setBounds(20, 160, 110, 40);
        panel.add(wynik);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == suma){
            try {
                pole_dane1 = Double.parseDouble((String) tekst1);
                pole_dane2 = Double.parseDouble((String) tekst2);
                wynicek = pole_dane1 + pole_dane2;
                wynik.setText(Double.toString(wynicek));
            }
            catch(NumberFormatException f)
            {
                System.out.println("Tu nie ma liczb :[");
            }
        }

        if(e.getSource() == roznica){
            try {
                pole_dane1 = Double.parseDouble((String) tekst1);
                pole_dane2 = Double.parseDouble((String) tekst2);
                wynicek = pole_dane1 - pole_dane2;
                wynik.setText(Double.toString(wynicek));
            }
            catch(NumberFormatException f)
            {
                System.out.println("Tu nie ma liczb :[");
            }
        }

        if(e.getSource() == iloczyn){
            try {
                pole_dane1 = Double.parseDouble((String) tekst1);
                pole_dane2 = Double.parseDouble((String) tekst2);
                wynicek = pole_dane1 * pole_dane2;
                wynik.setText(Double.toString(wynicek));
            }
            catch(NumberFormatException f)
            {
                System.out.println("Tu nie ma liczby :[");
            }
        }

        if(e.getSource() == iloraz){
            try {
                pole_dane1 = Double.parseDouble((String) tekst1);
                pole_dane2 = Double.parseDouble((String) tekst2);
                wynicek = pole_dane1 / pole_dane2;
                wynik.setText(Double.toString(wynicek));
            }
            catch(NumberFormatException f)
            {
                System.out.println("Tu nie ma liczby :[");
            }
        }
    }
}
