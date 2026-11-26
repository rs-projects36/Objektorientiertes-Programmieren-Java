import java.util.Scanner; 

public class Taschenrechner {

  
    public static void main(String[] args) {
        int[] menu = {1, 2, 3, 4};
        Scanner scanner = new Scanner(System.in);
        Taschenrechner rechner = new Taschenrechner();

        System.out.println("Erste Zahl: ");
        double a = scanner.nextDouble();
        System.out.println("Zweite Zahl: ");
        double b = scanner.nextDouble();

        System.out.println(menu[0] + " - Addition");
        System.out.println(menu[1] + " - Subtraktion");
        System.out.println(menu[2] + " - Multiplikation");
        System.out.println(menu[3] + " - Division");

        int c = scanner.nextInt();
        System.out.println("Auswahl: " + c);

        if (c == menu[0]) {
            System.out.println("Ergebnis: " + rechner.addieren(a, b));
        }
        if (c == menu[1]) {
            System.out.println("Ergebnis: " + rechner.subtrahieren(a, b));
        }
        if (c == menu[2]) {
            System.out.println("Ergebnis: " + rechner.multiplizieren(a, b));
        }
        if (c == menu[3]) {
            System.out.println("Ergebnis: " + rechner.dividieren(a, b));
        }
    } // Ende von main()

    double addieren(double a, double b) {
        return a + b;
    }

    double subtrahieren(double a, double b) {
        return a - b;
    }

    double multiplizieren(double a, double b) {
        return a * b;
    }

    double dividieren(double a, double b) {
        return a / b;
    }

} 
