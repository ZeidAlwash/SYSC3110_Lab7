public class ResidentialSite extends Site{

    public static double _units = 0.2;
    public static double _rate = 0.15;


    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
