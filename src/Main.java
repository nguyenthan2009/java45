import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập cạnh thứ nhất");
        double side1 = sc.nextDouble();
        System.out.println("mời bạn nhập cạnh thứ hai");
        double side2 = sc.nextDouble();
        System.out.println("mời bạn nhập cạnh thứ 3");
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("mời bạn nhập màu ");
        String color = sc.nextLine();
        boolean filled = filled(side1,side2,side3);

        Triangle triangle = new Triangle(side1,side2,side3,color,filled);
        System.out.println(triangle.toString());
    }
    public static boolean filled(double side1,double side2, double side3){
        if((side1+side2>side3)&&(side2+side3>side1)&&(side1+side3>side2)){
            return true;
        }else{
            return false;
        }

    }
}
