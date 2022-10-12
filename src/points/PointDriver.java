package points;

public class PointDriver
{
    public static void main(String[] args)
    {
        Cartesian2DPoints plane = new Cartesian2DPoints();

        plane.addPoint(new Point2D(3, 2));
        plane.addPoint(new Point2D(1, 1));
        plane.addPoint(new Point2D(0, 0));

        //forcing capability with my adapter
        plane.addPoint(new PointAdapter(new Point3D(1, 2, 3)));
        plane.addPoint(new PointAdapter(new Point3D(-1, 4, 4)));

        System.out.println(plane);
    }
}
