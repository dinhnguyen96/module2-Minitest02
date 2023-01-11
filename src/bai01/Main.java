package bai01;

public class Main {

    public static void main(String[] args) {

        Trapezoid trapezoid1 = new Trapezoid(5,15,12,6,8);
        Trapezoid trapezoid2 = new Trapezoid(6,12,10,6,8);

        double onePerimete = trapezoid1.getPerimeter();
        double oneArea = trapezoid1.getArea();
        double twoPerimete = trapezoid2.getPerimeter();//
        double twoArea = trapezoid2.getArea();

        if (onePerimete > twoPerimete)
        {
            System.out.println("Chu vi hình thang 1 lớn hơn hình thang 2");
        }
        else if (onePerimete < twoPerimete)
        {
            System.out.println("Chu vi hình thang 2 lớn hơn hình thang 1");
        }
        else
        {
            System.out.println("Chu vi của hai hình bằng nhau");
        }
        if (oneArea > twoArea)
        {
            System.out.println("Diện tích hình thang 1 lớn hơn hình thang 2");
        }
        else if(oneArea < twoArea)
        {
            System.out.println("Diện tích hình thang 2 lớn hơn hình thang 1");
        }
        else
        {
            System.out.println("Diện tích của hai hình bằng nhau");
        }

    }
}
