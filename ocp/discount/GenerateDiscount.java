package ocp.discount;

public class GenerateDiscount {
    
    public double generateDiscount(Discount typDiscount, double discount) {
        return typDiscount.processDiscount(discount);
    }
}
