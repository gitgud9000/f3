import java.util.Scanner;

public class Rect implements Figurable{
    Scanner sc = new Scanner(System.in);

    int side1 = Integer.valueOf(sc.nextLine());
    int side2 = Integer.valueOf(sc.nextLine());
    String fname = String.valueOf(sc.nextLine());

    @Override
    public int calc_perim(int side) {
        return 0;
    }

    @Override
    public int calc_area(int side) {
        return 0;
    }

    @Override
    public int calc_perim(int side1, int side2) {
        return (side1+side2)*2;
    }

    @Override
    public int calc_area(int side1, int side2) {
        return side1*side2;
    }

    @Override
    public String print_name(String fname) {
        return fname;
    }

    @Override
    public String toString() {
        return ("Имя: " + print_name(fname) + " Периметр: " + calc_perim(side1,side2) + " Площадь: " + calc_area(side1,side2));
    }


}
