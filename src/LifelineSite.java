public class LifelineSite extends Site{

    public static double _units = 0.2;
    public static double _rate = 0.1;

    public double getBaseAmount(){
        double base = _units * _rate * 0.5;

        return base;
    }

    public double getTaxAmount(){
        double tax = getBaseAmount() * Site.TAX_RATE * 0.2;
        return tax;
    }


}
