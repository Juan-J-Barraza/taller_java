package ocp.discount;

public class DiscountPorcentage  extends Discount{

    @Override
    public double processDiscount(double discount) {
        if ( discount > 0 && discount <= 100) {
            return discount * (discount/100);
        }
        System.out.println("discount no aviable");
        return 0.0;
    }

}