package secondBiggestNumber;

public class SecondBiggestNumber {
    public static void main(String[]args){
        int array1[]= {35,9,8,7,6,5,4,3,12};
        System.out.println(findSecondBiggestNumber(array1));
    }
    public static int findSecondBiggestNumber(int[]array){
        int firstBiggestNumber=Integer.MIN_VALUE;
        int secondBiggestNumber=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>firstBiggestNumber){
                secondBiggestNumber=firstBiggestNumber;
                firstBiggestNumber=array[i];
            }
            else if(array[i]>secondBiggestNumber){
                secondBiggestNumber=array[i];
            }
        }
        return secondBiggestNumber;
    }
}
