import java.util.Scanner;

public class Quad implements Figurable{

    int side;
    String fname;

    Quad(int x, String n) {
        this.side = x;
        this.fname = n;
    }

    @Override
    public int calc_perim() {
        return side*4;
    }

    @Override
    public int calc_area() {
        return side*side;
    }

    @Override
    public String print_name() {
        return(fname);
    }



}
