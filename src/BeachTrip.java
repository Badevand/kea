

public class BeachTrip extends Trip
{
    protected String beachType; // (sandy, rocky etc.)
    boolean hasSnorkeling;
    boolean hasSurfing;


    public BeachTrip(int duration, int travelers, String country, String transportation, String beachType, boolean hasSnorkeling, boolean hasSurfing)
    {
        super(duration, travelers, country, transportation);
        this.beachType = beachType;
        this.hasSnorkeling = hasSnorkeling;
        this.hasSurfing = hasSurfing;
    }


    @Override
    public void displayTrip()
    {
        String snorkeling = hasSnorkeling ? "Yes" : "No";
        String surfing = hasSurfing ? "Yes" : "No";
        System.out.println("Beach trip to " + country + " for " + duration + " day(s) with "
                + travelers + " traveler(s). Transportation: " + transportation + ". Beach type: "
                + beachType + ". Snorkeling: " + snorkeling + ". Surfing: " + surfing);
    }
}