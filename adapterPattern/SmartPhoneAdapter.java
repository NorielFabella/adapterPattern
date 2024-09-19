package adapterPattern;

public class SmartPhoneAdapter implements PowerOutlet
{
    private SmartphoneCharger smartPhoneCharger;

    public SmartPhoneAdapter(SmartphoneCharger smartPhoneCharger)
    {
        this.smartPhoneCharger = smartPhoneCharger;
    }

    @Override
    public String plugIn() {
        return smartPhoneCharger.chargePhone();
    }

    
}

