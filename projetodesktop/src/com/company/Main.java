package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	    final String USER = "geek";
	    final String PASS = "university";
// criando a tela
	    JFrame frame = new JFrame("Geek University : : Acesso ao Sistema");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//criando painel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
//componentes do painel
        JLabel lblUsuario = new JLabel("Usuario: ");
        JTextField txtUsuario = new JTextField(20);
        txtUsuario.setToolTipText(" Informe seu usuário de acesso....");

        JLabel lblSEnha = new JLabel("Senha: ");
        JPasswordField txtSenha = new JPasswordField(20);
        txtSenha.setToolTipText("Informe sua senha de acesso...");
//adicionando os componentes ao painel
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)){
                    JOptionPane.showMessageDialog(frame, "Acesso autorizado");
                }else{JOptionPane.showMessageDialog(frame, "Acesso negado");
                }

            }
        });
//adicionar evento
        panel.add(lblUsuario);
        panel.add(txtUsuario);

        panel.add(lblSEnha);
        panel.add(txtSenha);

        panel.add(btnLogin);

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
