import java.util.Scanner;

public class DuomenuNuskaitymasKonsole {
    public static void main(String[] args) {
        int x;
        double kaina;
        Scanner skaitytuvas = new Scanner(System.in);

        // Paprasto int nuskaitymas
        System.out.println("Įveskite x: ");
        x = skaitytuvas.nextInt();
        System.out.println("x = " + x);


        // Double nuskaitymas
        System.out.println("Įveskite kainą: ");
        kaina = skaitytuvas.nextDouble();
        System.out.println("kaina = " + kaina);


        // Teksto nuskaitymas (kartais reikia "peršokti" per vieną eilutę (22 eilutėj parašyta ta vieta), jog galėtų normaliai nuskaityti tekstą))
        skaitytuvas.nextLine();
        System.out.println("Įveskite tekstą: ");
        String tekstas = skaitytuvas.nextLine();
        System.out.println("tekstas = " + tekstas);





        // Kitas pvz. pirma nuskaitom tekstą, tada einame į skaičius.
        System.out.println("-------------------------------------------------");
        int plotis;
        String adresas;

        System.out.println("Įveskite adresą: ");
        adresas = skaitytuvas.nextLine();
        System.out.println("adresas = " + adresas);

        System.out.println("Įveskite namo plotį: ");
        plotis = skaitytuvas.nextInt();
        System.out.println("plotis = " + plotis);
    }
}
