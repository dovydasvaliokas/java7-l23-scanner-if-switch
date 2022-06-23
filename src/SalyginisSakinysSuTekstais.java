public class SalyginisSakinysSuTekstais {
    public static void main(String[] args) {
        String zodis = "kelmas";
        String tekstas = "kelmas";

        boolean arVienodi = arZodziaiVienodi(zodis, tekstas);
        System.out.println("Ar žodžiai yra vienodi: " + arVienodi);

    }

    public static boolean arZodziaiVienodi(String a, String b) {
        boolean arYra;
        arYra = a.equalsIgnoreCase(b);
        return arYra;
    }
}

