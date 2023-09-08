import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public double Toan;
    public double Ly;
    public double Hoa;

    public Student(String Name,int Age, double Toan, double Ly, double Hoa){
        this.name = Name;
        this.age = Age;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public double Avg(){
        double avg = (this.Toan+this.Ly+this.Hoa)/3;
        return avg;
    }

    public void showInfoStudent(){
        System.out.println("Tên: "+ this.name);
        System.out.println(" Age: "+ this.age);
        System.out.println(" Point: "+ this.Toan+" "+ this.Ly +" "+ this.Hoa);

    }

    public void editInfoStudent(String Name, int Age, double Toan,double Ly, double Hoa){
        this.name = Name;
        this.age = Age;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
        System.out.println(this.name +" "+this.age+" "+this.Toan+" "+this.Ly+" "+this.Hoa);
    }
}

class Runs1{
    public static void main(String[] args) {
        Student Sv1 = new Student("Nguyễn Văn Hiếu", 27, 1, 2, 3);
        Student Sv2 = new Student("Nguyễn Văn Hải", 30, 5, 5, 6);
        Sv1.showInfoStudent();
        Sv2.showInfoStudent();
        System.out.println(Sv1.Avg());
        System.out.println(Sv2.Avg());
        if(Sv1.Avg() > Sv2.Avg()){
            Sv1.showInfoStudent();
        }else {
            Sv2.showInfoStudent();
        }
        Sv1.editInfoStudent("Bùi Thị Lệ",26,7,8,9);
    }
}