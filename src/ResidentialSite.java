public class ResidentialSite extends Site{

    public static double _units = 0.2;
    public static double _rate = 0.15;


    public double getBaseAmount(){
        double base = _units * _rate;

        return base;
    }

    public double getTaxAmount(){
        double tax = getBaseAmount() * Site.TAX_RATE;
        return tax;
    }
}
