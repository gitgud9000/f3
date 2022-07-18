import java.util.Scanner;

public class Hex implements Figurable{
    int side;
    String fname;

    Hex(int x, String n) {
        this.side = x;
        this.fname = n;
    }

    @Override
    public int calc_perim() {
        return side*6;
    }

    @Override
    public int calc_area() {
        return (int) ((3*Math.sqrt(3))/2*side*side);
    }

    @Override
    public String print_name() {
        return(fname);
    }




}
