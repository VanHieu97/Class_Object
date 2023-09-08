import java.util.Arrays;
import java.util.Scanner;

public class Try{
    public String name;
    public int age;
    public String gender;
    public String address;
    public double[] point;

    public Try(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tên sinh viên: ");
        String name = input.nextLine();
        this.name = name;
        System.out.println("Tuổi: ");
        int age = input.nextInt();
        this.age = age;
        Scanner inputGT = new Scanner(System.in);
        System.out.println("Giới tính: ");
        String gender = inputGT.nextLine();
        this.gender = gender;
        Scanner inputDC = new Scanner(System.in);
        System.out.println("Địa chỉ: ");
        String address = inputDC.nextLine();
        this.address = address;
        System.out.println("Số lượng điểm chuyền vào mảng: ");
        int length = input.nextInt();
        this.point = new double[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập điểm thứ:" +(i+1));
            this.point[i] = input.nextDouble();
        }
    }
    public void showAllInfoStudent(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.address);
        System.out.println(Arrays.toString(this.point));
    }
    public double Avg(){
        double avg = 0;
        for(double sum: point){
            avg += sum;
        }
        return avg/point.length;
    }
    public void editInfoStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tên sinh viên: ");
        String name = input.nextLine();
        this.name = name;
        System.out.println("Tuổi: ");
        int age = input.nextInt();
        this.age = age;
        Scanner inputGT = new Scanner(System.in);
        System.out.println("Giới tính: ");
        String gender = inputGT.nextLine();
        this.gender = gender;
        Scanner inputDC = new Scanner(System.in);
        System.out.println("Địa chỉ: ");
        String address = inputDC.nextLine();
        this.address = address;
        System.out.println("Số lượng điểm chuyền vào mảng: ");
        int length1 = input.nextInt();
        this.point = new double[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Nhập điểm thứ:" +(i+1));
            this.point[i] = input.nextDouble();
        }
    }

}

class Run{
    public static void main(String[] args) {
        Try sv = new Try();
        Try sv1 = new Try();
        sv.showAllInfoStudent();
        sv1.showAllInfoStudent();
        System.out.println(sv.Avg());
        System.out.println(sv1.Avg());
        if(sv.Avg() > sv1.Avg()){
            sv.showAllInfoStudent();
        }else {
            sv1.showAllInfoStudent();
        }
//        sv.editInfoStudent();
//        sv1.editInfoStudent();
//        sv.showAllInfoStudent();
//        sv1.showAllInfoStudent();
    }
}