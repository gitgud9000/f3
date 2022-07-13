import java.util.Scanner;

public class Hex implements Figurable{
    Scanner sc = new Scanner(System.in);

    int side = Integer.valueOf(sc.nextLine());
    String fname = String.valueOf(sc.nextLine());

    @Override
    public int calc_perim(int side) {
        return side*6;
    }

    @Override
    public int calc_area(int side) {
        return (int) ((3*Math.sqrt(3))/2*side*side);
    }

    @Override
    public int calc_perim(int side1, int side2) {
        return 0;
    }

    @Override
    public int calc_area(int side1, int side2) {
        return 0;
    }

    @Override
    public String print_name(String fname) {
        return fname;
    }

    @Override
    public String toString() {
        return ("Имя: " + print_name(fname) + " Периметр: " + calc_perim(side) + " Площадь: " + calc_area(side));
    }


}
