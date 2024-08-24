import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("nhap vao so nguyen so 1");
            int num1 = sc.nextInt();
            System.out.println("nhap vao so nguyen so 2");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("Tong hai so nguyen la: " + sum);
        }catch (Exception e){
            System.err.println("Hay nhap vao so nguyen");
        }finally {
            System.out.println("Ket thuc chuong trinh");
        }
    }
}
