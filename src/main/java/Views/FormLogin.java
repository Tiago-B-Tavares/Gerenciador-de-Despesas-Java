package Views;


    import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

    public class FormLogin extends JFrame implements ActionListener {

        private JLabel labelEmail, labelSenha;
        private JTextField textEmail, textSenha;
        private JButton buttonEntrar, buttonCadastrar;

        public FormLogin() {
            super("Login");

            // Configurações do JFrame
            setSize(400, 200);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Cria os componentes
            labelEmail = new JLabel("Email:");
            labelSenha = new JLabel("Senha:");
            textEmail = new JTextField();
            textSenha = new JPasswordField();
            buttonEntrar = new JButton("Entrar");
            buttonCadastrar = new JButton("Cadastrar");

            // Adiciona os componentes ao JFrame
            JPanel painelPrincipal = new JPanel(new BorderLayout());
            JPanel painelDados = new JPanel(new FlowLayout());
            painelDados.add(labelEmail);
            painelDados.add(textEmail);
            painelDados.add(labelSenha);
            painelDados.add(textSenha);
            painelPrincipal.add(painelDados, BorderLayout.CENTER);
            JPanel painelBotoes = new JPanel(new FlowLayout());
            painelBotoes.add(buttonEntrar);
            painelBotoes.add(buttonCadastrar);
            painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);
            getContentPane().add(painelPrincipal);

            // Adiciona os listeners aos botões
            buttonEntrar.addActionListener(this);
            buttonCadastrar.addActionListener(this);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonEntrar) {
                // Valida os campos
                if (textEmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo 'Email' é obrigatório.");
                    return;
                }

                if (textSenha.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo 'Senha' é obrigatório.");
                    return;
                }

                // Faz a autenticação
                // ...

                // Se a autenticação for bem-sucedida, abre a tela principal
               /* if (true) {
                    new TelaPrincipal();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
                }
            } else if (e.getSource() == buttonCadastrar) {
                // Abre a tela de cadastro
                new TelaCadastro();
            }*/
        }
    }

}
