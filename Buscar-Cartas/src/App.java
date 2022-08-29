public class App {
    public static void main(String[] args) throws Exception {
        String[] carta = { "as", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "valete", "dama", "rei" };
        String[] naipe = { "ouro", "paus", "copas", "espadas" };
        System.out.println("Digite sua carta: ");
        String frase = System.console().readLine();
        String[] frasePalavras = frase.split(" ");

        for (int i = 0; i < frasePalavras.length; i++) {
            for (int j = 0; j < frasePalavras.length; j++) {
                for (int j2 = 0; j2 < naipe.length; j2++) {
                    for (int k = 0; k < carta.length; k++) {
                        if (frasePalavras[i].toLowerCase().equals(carta[k]) && frasePalavras[j].toLowerCase().equals(naipe[j2])) {
                            System.out.println("Sua carta é " + carta[k] + " de " + naipe[j2] + "\n" +  "E está na linha: " + (j2+1) + " Coluna: " + (k+1));
                            k = carta.length;
                            j2 = naipe.length;
                            j = frasePalavras.length;
                            i = frasePalavras.length;
                        }
                    }
                }
            }
        }
    }
}