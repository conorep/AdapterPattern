package athletes;

public class BaseballAdapter implements IAthlete
{
    BaseballAthlete adaptee;

    public BaseballAdapter(BaseballAthlete bbAthlete)
    {
        this.adaptee = bbAthlete;
    }

    @Override
    public String getFullName()
    {
        return adaptee.getFirstName() + " " + adaptee.getLastName();
    }

    @Override
    public String[] getStats()
    {
        if(adaptee.getStatNames() != null)
        {
            String[] returnStats = new String[adaptee.getStatValues().size()];
            for (int i = 0; i < returnStats.length; i++)
            {
                returnStats[i] = adaptee.getStatNames().get(i) + ": " + adaptee.getStatValues().get(i);

            }

            return returnStats;
        }
        return new String[]{"No stats!"};
    }
}
