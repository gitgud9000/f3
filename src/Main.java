interface Figurable {




    int calc_perim(int side);

    int calc_area(int side);

    int calc_perim(int side1, int side2);

    int calc_area(int side1, int side2);

    String print_name(String fname);
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Введи размер стороны квадрата, затем имя фигуры");
        Quad quad = new Quad();
        System.out.println(quad.toString());
        System.out.println("Введи размер у прямоугольника стороны 1, стороны 2, затем имя фигуры");
        Rect rect = new Rect();
        System.out.println(rect.toString());
        System.out.println("Введи размер стороны шестиугольника, затем имя фигуры");
        Hex hex = new Hex();
        System.out.println(hex.toString());

    }

}