package athletes;

import java.util.Set;

public class FootballAdapter implements IAthlete
{
    FootballAthlete adaptee;

    public FootballAdapter(FootballAthlete fbAthlete)
    {
        this.adaptee = fbAthlete;
    }

    @Override
    public String getFullName()
    {
        return adaptee.getFirst() + " " + adaptee.getMiddleInitial() + " " + adaptee.getLast();
    }

    @Override
    public String[] getStats()
    {
        if(adaptee.getStats() != null)
        {
            String[] returnStats = new String[adaptee.getStats().size()];
            int returnStatsPlace = 0;

            for(String statKey : adaptee.getStats().keySet())
            {
                returnStats[returnStatsPlace] = statKey + ": " + adaptee.getStats().get(statKey);
                returnStatsPlace++;
            }

            return returnStats;
        }
        return new String[]{"No stats!"};
    }
}
