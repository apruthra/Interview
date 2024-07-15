package ArrayEasy;

public class CCopyArray {
    public static void main(String[] args) {
        int a[] = {1, 8, 3,4,5,6,7,3463647};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length;i++){
            b[i]=a[i];
        }
        for(int k:b){
            System.out.println(k);
        }
    }
}
