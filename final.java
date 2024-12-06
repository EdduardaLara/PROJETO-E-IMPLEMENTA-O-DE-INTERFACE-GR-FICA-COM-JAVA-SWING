import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroChavesTela extends JFrame {

    public CadastroChavesTela() {
        setTitle("Cadastro de Chaves");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel para os campos
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblNumeroSala = new JLabel("Número da Sala:");
        JTextField txtNumeroSala = new JTextField();
        
        JLabel lblIdentificacao = new JLabel("Identificação da Chave:");
        JTextField txtIdentificacao = new JTextField();

        panel.add(lblNumeroSala);
        panel.add(txtNumeroSala);
        panel.add(lblIdentificacao);
        panel.add(txtIdentificacao);

        add(panel, BorderLayout.CENTER);

        // Painel para os botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton btnSalvar = new JButton("Salvar");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnVoltar = new JButton("Voltar");

        buttonPanel.add(btnSalvar);
        buttonPanel.add(btnLimpar);
        buttonPanel.add(btnVoltar);

        add(buttonPanel, BorderLayout.SOUTH);

        // Ações dos botões
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroSala = txtNumeroSala.getText();
                String identificacao = txtIdentificacao.getText();

                if (numeroSala.isEmpty() || identificacao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Chave cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    // Aqui você pode adicionar o código para salvar no banco de dados ou lista
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumeroSala.setText("");
                txtIdentificacao.setText("");
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a tela atual
                // Aqui você pode retornar para a tela principal
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroChavesTela();
    }
}
