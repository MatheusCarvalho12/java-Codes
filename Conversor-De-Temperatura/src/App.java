public class App {
    public static void main(String[] args) throws Exception {
        int exit;
        do {
            System.out.println("1 - De graus Celsius (C) para graus Fahrenheit (F) \n2 - De graus Fahrenheit (F) para graus Celsius (C)");
            System.out.println("3 - De graus Celsius (C) para graus Kelvin (K) \n4 - De graus Kelvin (K) para graus Celsius (C)");
            System.out.println("5 - De graus Celsius (C) para graus Réaumur (Re) \n6 - De graus Réaumur (Re) para graus Celsius (C)");
            System.out.println("7 - De graus Kelvin (K) para graus Rankine (R) \n8 - De graus Rankine (R) para graus Kelvin (K)");
            int escolha = Integer.parseInt(System.console().readLine("Digite a opção: \n"));
            
            double c,f,k,re,r;
            switch (escolha) {
                case 1:
                    c = Double.parseDouble(System.console().readLine("Digite o valor em C: \n"));
                    f = ((9 * c/5) + 32);
                    System.out.format("Resultado %.2f \n", f);
                    break;
                case 2:
                    f = Double.parseDouble(System.console().readLine("Digite o valor em F: \n"));
                    c = (f - 32) * +5/9;
                    System.out.format("Resultado %.2f \n", c);
                    break;
                case 3:
                    c = Double.parseDouble(System.console().readLine("Digite o valor em C: \n"));
                    k = c + 273.15;
                    System.out.format("Resultado %.2f \n", k);
                    break;
                case 4:
                    k = Double.parseDouble(System.console().readLine("Digite o valor em K: \n"));
                    c = k - 273.15;
                    System.out.format("Resultado %.2f \n", c);
                    break;
                case 5:
                    c = Double.parseDouble(System.console().readLine("Digite o valor em C: \n"));
                    re = c * 4/5;
                    System.out.format("Resultado %.2f \n", re);
                    break;
                case 6:
                    re = Double.parseDouble(System.console().readLine("Digite o valor em Re: \n"));
                    c = re * 5/4;
                    System.out.format("Resultado %.2f \n", c);
                    break;
                case 7:
                    k = Double.parseDouble(System.console().readLine("Digite o valor em K: \n"));
                    r = k * 1.8;
                    System.out.format("Resultado %.2f \n", r);
                    break;
                case 8:
                    r = Double.parseDouble(System.console().readLine("Digite o valor em R: \n"));
                    k = r/1.8;
                    System.out.format("Resultado %.2f \n", k);
                    break;
            } 
            exit = Integer.parseInt(System.console().readLine("Deseja sair do programa? 0 - não, 1 - sim \n"));
       } while (exit == 0);
    }
}
