package com.mycompany.a3;

import javax.swing.JOptionPane;

public class A3Endereco {

    
    String rua;
    String numero;
    String bairro;
    String complemento;
    String cep;
    String cidade;
    String estado;

    public void endereco(){


    rua = JOptionPane.showInputDialog(null, "Digite seu logradouro (Rua, Av., Al. etc): ");
    numero = JOptionPane.showInputDialog(null, "Digite seu numero: ");
    bairro = JOptionPane.showInputDialog(null, "Digite seu bairro: ");
    complemento = JOptionPane.showInputDialog(null, "Digite seu complemento: ");
    cep = JOptionPane.showInputDialog(null, "Digite seu CEP: ");
    cidade = JOptionPane.showInputDialog(null, "Digite sua cidade: ");
    estado = JOptionPane.showInputDialog(null, "Digite seu estado: (UF)");
    

    JOptionPane.showMessageDialog(null, "Endereço: " + rua + ", " + numero + " - " + complemento + "\n" + "Bairro: " + bairro + "\n" + "CEP: " + cep + "\n" + "Cidade: " + cidade+ ", " +estado);


    
}}
