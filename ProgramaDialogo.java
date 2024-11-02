import javax.swing.JOptionPane;

public class ProgramaDialogo {

    public static void main(String[] args) {
        // Tela 1: Solicita o nome do usuário
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");

        // Verifica se o nome foi fornecido
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não informado. Encerrando o programa.");
            return;
        }

        // Tela 2: Mostra o nome digitado
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");

        // Tela 3: Pergunta se o usuário gosta de programar
        int gostaProgramar = JOptionPane.showConfirmDialog(null, nome + ", você gosta de programar?", 
                                                           "Pergunta", JOptionPane.YES_NO_OPTION);

        if (gostaProgramar == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Que ótimo, " + nome + "! Programar é incrível!");
        } else if (gostaProgramar == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Que pena, " + nome + ". Mas quem sabe você muda de ideia?");
        }

        // Tela 4: Pergunta sobre objetos em Java
        Object[] opcoes = {"Sim - Objeto é legal", "Não - Objeto é sofrimento", "Talvez - Quero aprender"};
        int respostaObjeto = JOptionPane.showOptionDialog(null, "Você gosta disto? Lembrete: tudo em Java é objeto.",
                                                          "Pergunta sobre Java",
                                                          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                          null, opcoes, opcoes[0]);

        // Exibe uma mensagem conforme a resposta do usuário
        switch (respostaObjeto) {
            case 0:
                JOptionPane.showMessageDialog(null, "Que bom que você gosta de objetos!");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Não se preocupe, o sofrimento faz parte do aprendizado.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Ótima atitude! Aprender é sempre válido.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }
}
