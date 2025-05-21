import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez la valeur de a : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez l'opérateur (+, -, *, /) : ");
            char operateur = scanner.next().charAt(0);

            System.out.print("Entrez la valeur de b : ");
            double b = scanner.nextDouble();

            double resultat;

            switch (operateur) {
                case '+':
                    resultat = Calculatrice.Additionner(a, b);
                    break;
                case '-':
                    resultat = Calculatrice.Soustraire(a, b);
                    break;
                case '*':
                    resultat = Calculatrice.Multiplier(a, b);
                    break;
                case '/':
                    resultat = Calculatrice.Diviser(a, b);
                    break;
                default:
                    System.out.println("Opérateur invalide.");
                    return;
            }

            System.out.println("Résultat : " + resultat);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
