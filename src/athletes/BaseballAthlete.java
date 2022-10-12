package athletes;

import java.util.ArrayList;
import java.util.List;

public class BaseballAthlete
{
    private String firstName;
    private String lastName;
    private List<String> statNames;
    private List<Object> statValues;

    public BaseballAthlete(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addStat(String name, Object value)
    {
        if(statNames == null)
        {
            statNames = new ArrayList<>();
            statValues = new ArrayList<>();
        }
        statNames.add(name);
        statValues.add(value);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public List<String> getStatNames()
    {
        return statNames;
    }

    public List<Object> getStatValues()
    {
        return statValues;
    }
}
