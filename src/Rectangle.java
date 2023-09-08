public class Rectangle {
    public int length;
    public int width;


    public Rectangle(int Length, int Width){
        this.length = Length;
        this.width = Width;
    }

    public int acreage(){
        int sumAcreage = this.length * this.width;
        return sumAcreage;
    }
    public int perimeter(){
        int sumPerimeter = this.length + this.width;
        return sumPerimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

class Runs{
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,5);
        Rectangle rectangle2 = new Rectangle(15,6);
        Rectangle rectangle3 = new Rectangle(20,7);
        Rectangle rectangle4 = new Rectangle(25,8);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println("Diện tích HCN-1:" + rectangle1.acreage());
        System.out.println("Chu Vi HCN-1:"+ rectangle1.perimeter());
        System.out.println("Diện tích HCN-2:" +rectangle2.acreage());
        System.out.println("Chu Vi HCN-2:"+ rectangle2.perimeter());
        System.out.println("Diện tích HCN-3:" +rectangle3.acreage());
        System.out.println("Chu Vi HCN-3:"+ rectangle3.perimeter());
        System.out.println("Diện tích HCN-4:" +rectangle4.acreage());
        System.out.println("Chu Vi HCN-4:"+ rectangle4.perimeter());
    }
}
