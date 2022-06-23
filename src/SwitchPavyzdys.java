public class SwitchPavyzdys {
    public static void main(String[] args) {
        System.out.println("Pavyzdžiai su if'u: ");
        System.out.println("dienaTekstuSuIfu(5) = " + dienaTekstuSuIfu(5));
        System.out.println("dienaTekstuSuIfu(8) = " + dienaTekstuSuIfu(8));
        System.out.println("dienaTekstuSuIfu(4) = " + dienaTekstuSuIfu(4));
        System.out.println("dienaTekstuSuIfu(1) = " + dienaTekstuSuIfu(1));

        System.out.println("Pavyzdžiai su switchu: ");

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
}
