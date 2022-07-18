import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Quad quad = new Quad(25, "squad-rat");
         Rect rect = new Rect(15, 12,"Get rekt");
         Hex hex = new Hex(24, "hexes of war");

        System.out.println(" Имя квадрата: " + quad.print_name());
        System.out.print(" Периметр квадрата " + quad.calc_perim());
        System.out.print(" Площадь квадрата " + quad.calc_area());

        System.out.println(" Имя прямоугольника: " + rect.print_name());
        System.out.print(" Периметр прямоугольника " + rect.calc_perim());
        System.out.print(" Площадь прямоугольника " + rect.calc_area());

        System.out.println(" Имя шестиугольника: " + hex.print_name());
        System.out.print(" Периметр шестиугольника " + hex.calc_perim());
        System.out.print(" Площадь шестиугольника " + hex.calc_area());

    }

}