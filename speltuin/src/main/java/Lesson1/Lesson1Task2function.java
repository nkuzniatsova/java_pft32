package Lesson1;

/**
 * Created by Natallia on 2-9-2016.
 */
public class Lesson1Task2function {


  public static void main(String[] args) {

    Point p1 = new Point();
    p1.x = 1;
    p1.y = 5;

    Point p2 = new Point();
    p2.x = 3;
    p2.y = 5;

    System.out.println("Расстояние между точками с координатами (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") = " + distance(p1,p2));
  }

    public static double distance(Point p1,Point p2) {
      return Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
    }
  }




