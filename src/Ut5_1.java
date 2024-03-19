import java.util.Scanner;

public class Ut5_1 {
    public static void main(String[] args) {

        System.out.println("Introduce 10 números del 1 al 100:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                System.out.println("Quedan 10: ");
                numero = entrada.nextInt();
                int numero2 = entrada.nextInt();
                if(numero2==numero2){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero2 > 100 && numero2 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 2:
                System.out.println("Quedan 9: ");
                numero = entrada.nextInt();
                int numero3 = entrada.nextInt();
                if(numero3==numero3){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero3 > 100 && numero3 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 3:
                System.out.println("Quedan 8: ");
                numero = entrada.nextInt();
                int numero4 = entrada.nextInt();
                if(numero4==numero4){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero4 > 100 && numero4 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 4:
                System.out.println("Quedan 7: ");
                numero = entrada.nextInt();
                int numero5 = entrada.nextInt();
                if(numero5==numero5){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero5 > 100 && numero5 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 5:
                System.out.println("Quedan 6: ");
                numero = entrada.nextInt();
                int numero6 = entrada.nextInt();
                if(numero6==numero6){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero6 > 100 && numero6 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 6:
                System.out.println("Quedan 5: ");
                numero = entrada.nextInt();
                int numero7 = entrada.nextInt();
                if(numero7==numero7){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero7 > 100 && numero7 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 7:
                System.out.println("Quedan 4: ");
                numero = entrada.nextInt();
                int numero8 = entrada.nextInt();
                if(numero8==numero8){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero8 > 100 && numero8 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 8:
                System.out.println("Quedan 3: ");
                numero = entrada.nextInt();
                int numero9 = entrada.nextInt();
                if(numero9==numero2){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero9 > 100 && numero9 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;


            case 9:
                System.out.println("Quedan 2: ");
                numero = entrada.nextInt();
                int numero10 = entrada.nextInt();
                if(numero10==numero10){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero10 > 100 && numero10 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;

            case 10:
                System.out.println("Quedan 1: ");
                numero = entrada.nextInt();
                int numero11 = entrada.nextInt();
                if(numero11==numero11){
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numero11 > 100 && numero11 < 1) {
                    System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                }
                break;
        }
    }
}
