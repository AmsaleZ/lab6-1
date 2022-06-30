package helloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        int array1[]= {35,9,8,7,6,5,4,3,12};

       printHelloWorld(array1);
    }
    public static void printHelloWorld(int[] array) {
        for(int i=0;i<array.length;i++) {
            if((array[i]%5 ==0) && (array[i]% 7 ==0)) {
                System.out.println("Hello World");

            }
            else if(array[i]% 5 == 0) {
                System.out.println("Hello");

            }
            else if(array[i] %7 == 0) {
                System.out.println("World");
            }

        }

    }
}
