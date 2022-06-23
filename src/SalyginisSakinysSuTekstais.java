import java.util.Scanner;

public class SalyginisSakinysSuTekstais {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite pirmą žodį: ");
        String zodis = skaitytuvas.nextLine();
        System.out.println("Įveskite antrą žodį: ");
        String tekstas = skaitytuvas.nextLine();

        System.out.println("zodis = " + zodis);
        System.out.println("tekstas = " + tekstas);

        boolean arVienodi = arZodziaiVienodi(zodis, tekstas);
        System.out.println("Ar žodžiai yra vienodi: " + arVienodi);

        System.out.println("-------------------------------------");
        System.out.println("Lyginant du žodžius, rezultatas: " + lyginimoZodinisRezultatas(palygintiSkaicius(zodis.length(), tekstas.length())));

        // Tas pats su žodžių ilgių lyginimu, tik išskaldytas, jog matytųsi nuoseklumas
        System.out.println("-------------------------------------");
        int pirmoZodzioIlgis = zodis.length();
        int antroZodzioIlgis = tekstas.length();
        int palyginimoRezultatas = palygintiSkaicius(pirmoZodzioIlgis, antroZodzioIlgis);
        String tekstinisRezultatas = lyginimoZodinisRezultatas(palyginimoRezultatas);
        System.out.println("tekstinisRezultatas = " + tekstinisRezultatas);

        // Paskutinis pavyzdys - jog if'e negalime lyginti String su ==, o reikia lyginti arba su equals() arba su equalsIgnoreCase()
        System.out.println("----------------------------------------------------------");
        String str1 = "namras";
        String str2 = "namdas";
        if (str1.equals(str2)) {                // blogas variantas: if (str1 == str2)
            System.out.println("Žodžiai vienodi");
        }
        else {
            System.out.println("Žodžiai skiriasi.");
        }

    }

    /**
     * Funkcija palygina ar du žodžiai yra vienodi (naudoja jau sukurtą realiai funkciją equalsIgnoreCase())
     * @param a pirmas lyginamas žodis
     * @param b antras lyginamas žodis
     * @return
     */
    public static boolean arZodziaiVienodi(String a, String b) {
        boolean arYra;
        arYra = a.equalsIgnoreCase(b);
        return arYra;
    }

    /**
     * Funkcija palygina du skaičius
     * @param a pirmas skaičius
     * @param b antras skaičius
     * @return grąžina -1 jeigu antras didesnis, 1 jeigu pirmas, 0 jeigu vienodi
     */
    public static int palygintiSkaicius(int a, int b) {
        if (a > b) {
            return 1;
        }
        else if (b > a) {
            return - 1;
        }
        else {
            return 0;
        }
    }


    public static String lyginimoZodinisRezultatas(int rezultatas) {
        if (rezultatas <= -1) {
            return "Antras ilgesnis";
        }
        else if (rezultatas >= 1) {
            return "Pirmas ilgesis";
        }
        else {
            return "Abu vienodi";
        }
    }

}

