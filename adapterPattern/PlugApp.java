package adapterPattern;

public class PlugApp 
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartPhoneCharger = new SmartphoneCharger();
        PowerOutlet smartOutlet = new SmartPhoneAdapter(smartPhoneCharger);

        System.out.println(laptopOutlet.plugIn());
        System.out.println(refOutlet.plugIn());
        System.out.println(smartOutlet.plugIn());
    }    
}
