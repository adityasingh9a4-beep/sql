import java.util.Scanner;

class Rectangle {
    double length, width, area;
    String color;
    Scanner sc = new Scanner(System.in);

    void set_length() {
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
    }

    void set_width() {
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }

    void set_color() {
        sc.nextLine();
        System.out.print("Enter Color: ");
        color = sc.nextLine();
    }

    void find_area() {
        area = length * width;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Rectangle 1");
        r1.set_length();
        r1.set_width();
        r1.set_color();
        r1.find_area();

        System.out.println("\nRectangle 2");
        r2.set_length();
        r2.set_width();
        r2.set_color();
        r2.find_area();

        if (r1.area == r2.area && r1.color.equalsIgnoreCase(r2.color)) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-Matching Rectangle");
        }
    }
}