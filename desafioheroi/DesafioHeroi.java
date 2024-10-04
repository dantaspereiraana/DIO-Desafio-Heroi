package desafioheroi;

import java.util.Scanner;

public class DesafioHeroi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String xp;

        while (true) {
            System.out.print("Nome do herói (ou digite 'sair' para encerrar): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do programa...");
                break;
            }

            System.out.print("Nível do heroí: ");
            int pontuacao = Integer.parseInt(teclado.nextLine());


            if (pontuacao > 0 && pontuacao <= 1000) {
                xp = "Ferro";

            } else if (pontuacao > 1000 && pontuacao <= 2000) {
                xp = "Bronze";

            } else if (pontuacao > 2000 && pontuacao <= 5000) {
                xp = "Prata";

            } else if (pontuacao > 5000 && pontuacao <= 7000) {
                xp = "Ouro";

            } else if (pontuacao > 7000 && pontuacao <= 8000) {
                xp = "Platina";

            } else if (pontuacao > 8000 && pontuacao <= 9000) {
                xp = "Ascendente";

            } else if (pontuacao > 9000 && pontuacao <= 10000) {
                xp = "Imortal";

            } else {
                xp = "Radiante";
            }
            System.out.println("O Herói de nome " + nome + " está no nível de " + xp);
        }
    }
}
