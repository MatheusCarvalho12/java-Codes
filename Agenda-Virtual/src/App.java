public class App {
    static int slots = 10;
    static contatos[] contato = new contatos[slots];
    public static void printar() {
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < contato.length; i++) {
            if (contato[i].getNome() == null) {
                System.out.println(String.format("Contato %d: Vazio", i));
            } else
                System.out.println(String.format("Contato %d: %s:    | Sexo: %s | Email: %s | Telefone: %d |", i,
                        contato[i].getNome().toUpperCase(),contato[i].getSexo(), contato[i].getEmail(), contato[i].getTelefone()));
        }
    }
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < slots; i++) {
            contato[i] = new contatos();
        }
        int run = 5;
        do {
            switch (run) {
                case 5:
                    System.out.println("--------------------------------------------------------------------");
                    run = Integer.parseInt((System.console().readLine("| 0 = Sair | 1 = Consultar e Editar | 2 = Consultar e Sair | 3 = Deletar Contato |:")));
                    break;
                case 0:
                    break;
                case 1:
                    printar();
                    System.out.println("--------------------------------------------------------------------");
                    int slotUsu = Integer.parseInt(System.console().readLine("Selecione um Contato: "));
                    if (slotUsu >= 10 || slotUsu < 0) {
                        System.out.println("Contato Inválido");
                    } else {
                        System.out.println("--------------------------------------------------------------------");
                        for (int i = slotUsu; i < (slotUsu + 1); i++) {
                            contato[i].setNome(System.console().readLine("Nome do contato: "));
                            contato[i].setSexo(System.console().readLine("Sexo do contato: "));
                            contato[i].setEmail(System.console().readLine("Email do contato: "));
                            contato[i].setTelefone(Integer.parseInt(System.console().readLine("Telefone do contato: ")));
                        }
                    }
                    run = 5;
                    break;
                case 2:
                    printar();
                    run = 0;
                    break;
                case 3:
                    printar();
                    System.out.println("--------------------------------------------------------------------");
                    int slotUsuDelete = Integer.parseInt(System.console().readLine("Selecione um Contato para Excluir: "));
                    contato[slotUsuDelete].setNome(null);
                    run = 5;
                break;
            }
        } while (run != 0);
        System.out.println((run == 0) ? "Obrigado por usar o programa :)" : "sla");
    }
}
