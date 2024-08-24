import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("nhap so 1");
            int num1 = sc.nextInt();
            System.out.println("nhap so 2");
            int num2 = sc.nextInt();
            int thuong = num1 / num2;
            System.out.println("Thuong hai so la: " + thuong);
        }catch (Exception e){
            System.err.println("Khong the chia cho 0");
        }finally {
            System.out.println("Ket thuc chuong trinh");
        }
    }
}
