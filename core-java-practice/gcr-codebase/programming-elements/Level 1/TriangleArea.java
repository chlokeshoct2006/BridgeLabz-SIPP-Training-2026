import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516;
        System.out.println("The area of triangle is " + areaSqInches +
                " square inches and " + areaSqCm + " square centimeters");
    }
}