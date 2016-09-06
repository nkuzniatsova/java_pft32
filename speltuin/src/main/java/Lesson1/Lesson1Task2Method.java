package Lesson1;

/**
 * Created by Natallia on 3-9-2016.
 */
public class Lesson1Task2Method {

public static void main(String[] args) {

  PointWithMethod p1 = new PointWithMethod(1.0, 25.0);

  PointWithMethod p2 = new PointWithMethod(3.0, 5.0);

  System.out.println("Расстояние между точками с координатами (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") = " + p1.distance(p2));
}

}
