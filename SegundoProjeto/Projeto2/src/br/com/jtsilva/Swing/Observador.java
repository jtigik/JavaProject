/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jtsilva.Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jeferson Tigik
 */
public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 250);
        janela.setLayout(new FlowLayout());
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!");
        });

        janela.setVisible(true);
    }
}
