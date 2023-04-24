public class Single {

    public double calculateTax(double income) {
        double tax = 0;
        if (income <= 0) {
            tax = 0;
        } else if (income <= 19999) {
            tax = income * .12;
        } else if (income <= 49999) {
            tax = income * .15;
        } else {
            tax = income * .2;
        }
        return(Math.round(tax));
    }
}
