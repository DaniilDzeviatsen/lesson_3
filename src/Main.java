public class Main {

    public static void main(String[] args) {
        int [] arr=new int[13];
        for (int i=0; i<13; i++){
            arr[i]=i;}
        for (int i=2;i<13;i++){
            arr [i]=arr[i-1]+arr [i-2];
            System.out.println(arr[i-2]);
        }


    }
}