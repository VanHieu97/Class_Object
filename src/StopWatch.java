import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class StopWatch {
     public long starTime;
     public long endTime;

    public StopWatch(){
        this.starTime = System.currentTimeMillis();
    }
    public void Star(){
        this.starTime =  System.currentTimeMillis();
    }
    public void End(){
        this.endTime = System.currentTimeMillis();
    }
    public long ThoiGianChay(){
        return this.endTime - this.starTime;
    }

}

class Run2{
    public static void main(String[] args) {
        StopWatch Chay = new StopWatch();
        int[] Arr = new int[100000];
        Random random = new Random();
        for(int i = 0; i < Arr.length;i++){
            Arr[i] = random.nextInt(5000);
        }
        Chay.Star();
        selectionSort(Arr);
        Chay.End();
        System.out.println(Chay.ThoiGianChay());

    }
    public static void selectionSort(int[] Arr){
        for (int i = 0;i< Arr.length-1;i++){
            int min = i;
            for (int j = i+1; j < Arr.length; j++) {
                if(Arr[j]<Arr[min]){
                    min = j;
                }
            }
            int tam = Arr[i];
            Arr[i] = Arr[min];
            Arr[min] = tam;
        }
    }
}
