package pft32.speltuin;

/**
 * Created by Natallia on 21/10/16.
 */
public class Equation {

    private final double a;
    private final double b;
    private final double c;

    private int n; //number of roots

    //constructor
    public Equation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double d = b*b - 4*a*c; //discrimenant
        if (a ==0 ) {
            if (b == 0) {
                if (c == 0) {
                    n = -1;
                } else {
                    n = 0;
                }
            }
             else {
                    n = 1;
                }
        }
        else {
            if (d>0) {
                n = 2;
            }
            else {
                if(d == 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
            }
        }

    }


    public int rootNumber() {
        return n;
    }
}
