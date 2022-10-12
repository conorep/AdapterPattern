package athletes;

import java.util.HashMap;
import java.util.Map;

public class FootballAthlete
{
    private String first;
    private char middleInitial;
    private String last;
    private Map<String, Object> stats;

    public FootballAthlete(String first, char middleInitial, String last)
    {
        this.first = first;
        this.middleInitial = middleInitial;
        this.last = last;
    }

    public void newStat(String name, Object value)
    {
        if(stats == null)
        {
            stats = new HashMap<>();
        }
        stats.put(name, value);
    }

    public String getFirst()
    {
        return first;
    }

    public char getMiddleInitial()
    {
        return middleInitial;
    }

    public String getLast()
    {
        return last;
    }

    public Map<String, Object> getStats()
    {
        return stats;
    }
}
