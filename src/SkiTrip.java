

public class SkiTrip extends Trip
{
    protected boolean hasSkiRental;
    protected boolean hasSnowboarding;
    protected String difficultyLevel; // (beginner, intermediate, expert)
    protected String skiResort;

    public SkiTrip(boolean hasSkiRental, boolean hasSnowboarding, String difficultyLevel, int duration, int travelers, String country, String transportation, String skiResort)
    {
        super(duration, travelers, country, transportation);
        this.hasSkiRental = hasSkiRental;
        this.hasSnowboarding = hasSnowboarding;
        this.difficultyLevel = difficultyLevel;
        this.skiResort = skiResort;
    }

    @Override
    public void displayTrip()
    {
        String skiRental = hasSkiRental ? "Yes" : "No";
        String snowboarding = hasSnowboarding ? "Yes" : "No";
        System.out.println("Ski trip to " + country + " for " + duration + " day(s) with "
                + travelers + " traveler(s). Transportation: " + transportation
                + ". Ski rental: " + skiRental + ". Snowboard rental: " + snowboarding
                + ". Difficulty level: " + difficultyLevel + ". Ski resort: " + skiResort);
    }
}
