public class App {
    public static void main(String[] args) throws Exception {
        
        conta usu = new conta();
        boolean exit = false;
        while (exit != true) {
            System.out.println("------------------------------------------------------------");
            System.out.println(" 1 - sacar \n 2 - depositar \n 3 - cheque especial \n 4 - consultar saldo \n 5 - finalizar sistema ");
            int optionMenu = Integer.parseInt(System.console().readLine("Selecione uma opção: "));
            switch (optionMenu) {
                case 1:
                    System.out.println("------------------------------------------------------------");
                    Double saque = Double.parseDouble(System.console().readLine("quanto deseja sacar? "));
                    if (usu.getSaldo() - saque <= 0.0) {
                        Double saqueCheque = usu.getSaldo() - saque;
                        String escolha = System.console().readLine("não possui saldo suficiente, gostaria de usar seu cheque especial no valor de " +          (-(saqueCheque)) + "0 - NÃO, 1 - SIM \n");
                        if (escolha.equals("1")) {
                            usu.setchequeEspecial(usu.getchequeEspesial() - (saque - usu.getSaldo()));
                            usu.setsaldo(0.0);   
                            System.out.println("Saldo do cheque especial disponivel: " + usu.getchequeEspesial());
                        }else{
                            System.out.println("Operação invalida");
                        }
                    }else
                    usu.setsaldo(usu.getSaldo() - saque);
                    System.out.println("Saldo = " + usu.getSaldo());
                    break;
                case 2:
                    System.out.println("------------------------------------------------------------");
                    Double deposito = Double.parseDouble(System.console().readLine("quanto deseja depositar? "));
                    usu.setsaldo(usu.getSaldo() + deposito);
                    System.out.println("Saldo = " + usu.getSaldo());
                    break;
                case 3:
                    if (usu.getSaldo() <= 0) {
                        usu.setstatusCheque(true);
                        
                    }else{
                        usu.setstatusCheque(false);
                        System.out.println("Saldo do cheque especial disponivel: " + usu.getchequeEspesial());
                    }
                    break;
                case 4:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Saldo = " + usu.getSaldo());
                    break;
                case 5:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Programa finalizado");
                    exit = true;
                break;
            }
        }
    }
}
