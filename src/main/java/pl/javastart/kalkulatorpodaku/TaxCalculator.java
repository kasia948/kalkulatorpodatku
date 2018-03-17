package pl.javastart.kalkulatorpodaku;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculator {

    public double calculateTax(double income) {// TODO zaimplementuj obliczanie podaktu wg skali podatkowej
        double tax = 0;
        if (income == 0) {
            tax = 0;
        } else if (income <= 85528) {
            tax = Math.round(income * 0.18 - 556.02);
        } else {
            tax = Math.round((income - 85528) * 0.32 + 14839.02);
        }
        return tax;
    }

}
