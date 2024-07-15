package ArrayEasy;

public class DTwoMatrixEqualorNot {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {1, 2, 5, 4, 0};

        boolean result=true;
if (arr1.length==arr2.length) {
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i]!=arr2[i]){
            result=false;
        }
    }
    if (result==true) {
        System.out.println("Arrays Are equal");
    } else
        System.out.println("Arrays are not equal");
}else System.out.println("Arrays are of not the same size");

    }
}
