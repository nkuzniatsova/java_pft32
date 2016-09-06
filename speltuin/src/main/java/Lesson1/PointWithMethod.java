package Lesson1;

/**
 * Created by Natallia on 3-9-2016.
 */
public class PointWithMethod {

public double x;
public double y;

public PointWithMethod(double x, double y) {
  this.x=x;
  this.y=y;
}

public double distance(PointWithMethod p){
        return Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2));
        }
}