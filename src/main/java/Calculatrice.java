public class Calculatrice {

    public static double Additionner(double a, double b) {
        return a + b;
    }


    public static double Soustraire(double a, double b) {
        return a - b;
    }

    public static double Diviser(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("La division par 0 n'est pas possible");
        return a / b;
    }

    public static double Multiplier(double a,double b) {
        return a * b;
    }
}
