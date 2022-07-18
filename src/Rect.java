public class Rect implements Figurable{

    int side1;
    int side2;
    String fname;

    Rect(int x, int y, String n) {
        this.side1 = x;
        this.side2 = y;
        this.fname = n;
    }

    @Override
    public int calc_perim() {
        return (side1+side2)*2;
    }

    @Override
    public int calc_area() {
        return side1*side2;
    }

    @Override
    public String print_name() {
        return(fname);
    }



}