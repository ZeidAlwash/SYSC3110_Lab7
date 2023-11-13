public class Site {
    public static double TAX_RATE = 0.13;

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    public double getBaseAmount(){
        return 0.12;
    }

    public double getTaxAmount(){
        return 0.13;
    }





}
