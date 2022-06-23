public class SwitchPavyzdys {
    public static void main(String[] args) {
        System.out.println("Pavyzdžiai su if'u: ");
        System.out.println("dienaTekstuSuIfu(5) = " + dienaTekstuSuIfu(5));
        System.out.println("dienaTekstuSuIfu(8) = " + dienaTekstuSuIfu(8));
        System.out.println("dienaTekstuSuIfu(4) = " + dienaTekstuSuIfu(4));
        System.out.println("dienaTekstuSuIfu(1) = " + dienaTekstuSuIfu(1));

        System.out.println("Pavyzdžiai su switchu: ");
        System.out.println("dienaTekstuSuSwitchu(6) = " + dienaTekstuSuSwitchu(6));
        System.out.println("dienaTekstuSuSwitchu(9) = " + dienaTekstuSuSwitchu(9));
        System.out.println("dienaTekstuSuSwitchu(3) = " + dienaTekstuSuSwitchu(3));


        System.out.println("Pavyzdžiai su masyvu: ");
        System.out.println("dienaTekstuSuMasyvu(4) = " + dienaTekstuSuMasyvu(4));
        System.out.println("dienaTekstuSuMasyvu(8) = " + dienaTekstuSuMasyvu(8));
        System.out.println("dienaTekstuSuMasyvu(6) = " + dienaTekstuSuMasyvu(6));
        System.out.println("dienaTekstuSuMasyvu(7) = " + dienaTekstuSuMasyvu(7));

    }


    /**
     * Funkcija konvertuoja dienos skaičių į dienos tekstą
     * @param diena dienos skaičius nuo 1 iki 7
     * @return Dienos pavadinimą konvertuotą į String (pirmadienis, antradienis, t.t.)
     */
    public static String dienaTekstuSuIfu(int diena) {
        if (diena == 1) {
            return "Pirmadienis";
        }
        else if (diena == 2) {
            return "Antradienis";
        }
        else if (diena == 3) {
                return "Trečiadienis";
        }
        else if (diena == 4) {
                return "Ketvirtadienis";
        }
        else if (diena == 5) {
                return "Penktadienis";
        }
        else if (diena == 6) {
                return "Šeštadienis";
        }
        else if (diena == 7) {
                return "Sekmadienis";
        }
        else {
            return "Netinkama diena";
        }
    }

    /**
     * Funkcija konvertuoja dienos skaičių į dienos tekstą
     * @param diena dienos skaičius
     * @return String tipo dienos tekstą
     */
    public static String dienaTekstuSuSwitchu(int diena) {
        switch (diena) {
            case 1:
                return "Pirmadienis";
                // break; - jeigu nebūtų return'o, tai po kiekvienu case'u reikia breakinti - t.y., sustabdyti funkciją, jog ji be reikalo netikrintų kitų case'ų
            case 2:
                return "Antradienis";
            case 3:
                return "Trečiadienis";
            case 4:
                return "Ketvirtadienis";
            case 5:
                return "Penktadienis";
            case 6:
                return "Šeštadienis";
            case 7:
                return "Sekmadienis";
            default:
                return "Netinkama diena";
        }
    }


    /**
     * Funkcija konvertuoja dienos skaičių į dienos tekstą NAUDOJANT MASYVĄ
     * @param diena dienos skaičius
     * @return String tipo dienos tekstą
     */
    public static String dienaTekstuSuMasyvu(int diena) {
        final String[] dienos = {"Pirmadienis", "Antradienis", "Trečiadienis", "Ketvirtadienis", "Penktadienis", "Šeštadienis", "Sekmadienis"};
        if ((diena <= 7) && (diena > 0)) {
            return dienos[diena - 1];
        }
        else {
            return "Netinkama diena";
        }

    }
}
