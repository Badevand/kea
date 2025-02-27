

public abstract class Trip
{
    protected int duration;
    protected int travelers;
    protected String country;
    protected String transportation;

    public Trip(int duration, int travelers, String country, String transportation)
    {
        this.duration = duration;
        this.travelers = travelers;
        this.country = country;
        this.transportation = transportation;
    }

    public abstract void displayTrip();
}