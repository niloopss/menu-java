import java.util.Scanner;


public class menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha = 0;
        double conta = 0.0;
        boolean sair = false;

        System.out.println("Seja bem vindo(a) ao restaurante  Nordestando!");

        while(!sair) {
            System.out.println("Digite o número referente ao que você deseja no menu:");
            System.out.println("1.Acarajé - R$15,00\n2.Baião de Dois - R$20,00\n3.Carne de Sol com Macaxeira - R$ 25,00\n4.Buchada de Bode - R$ 30,00\n5.Não quero escolher mais nada. SAIR");
            escolha = leia.nextInt();

            switch (escolha) {
                case 1:
                    conta += 15.0;
                    System.out.println("Acarajé adicionado à sua conta.");
                    break;
                case 2:
                    conta += 20.0;
                    System.out.println("Baião de Dois adicionado à sua conta.");
                    break;
                case 3:
                    conta += 25.0;
                    System.out.println("Carne de Sol com Macaxeira adicionado à sua conta.");
                    break;
                case 4:
                    conta += 30.0;
                    System.out.println("Buchada de Bode adicionado à sua conta.");
                    break;
                case 5:
                    System.out.println("Você escolheu sair. Total a pagar: R$"+conta);
                    sair = true;
                    break;
                default:
                    System.out.println("Essa opção é inválida. Escolha novamente.");
            }
        }

    }
}
