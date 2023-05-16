import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String celeJmeno = "Alena Rudykh";
        LocalDate datumNarozeni = LocalDate.of(1980,12,12);
        int celkovyPocetSmluv = 10;
        double celkoveMnozstvi = 2.5; // hodnota je v tunach
        String mesto = "Praha";
        String SPZ = "1A2 2030";
        BigDecimal spotreba = BigDecimal.valueOf(6.3);
        String ipAddress = "192.168.24.0";


        double prumerneMnostviProdaneMrkvi = celkoveMnozstvi/celkovyPocetSmluv;
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu: "+ prumerneMnostviProdaneMrkvi + " tuny");

    }
}
