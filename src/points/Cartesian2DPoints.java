package points;

import java.util.ArrayList;
import java.util.List;

//this is the "target system" and the class has expectations
//of the types of objects that it works with
public class Cartesian2DPoints
{
    private List<ICartesianPoints> points;

    public Cartesian2DPoints()
    {
        points = new ArrayList<>();
    }

    public void addPoint(ICartesianPoints point)
    {
        points.add(point);
    }

    @Override
    public String toString()
    {
        return points.toString();
    }
}
