package lance.series;

public class Series {

    public static int nSum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){
        if (n <= 1 && n >= 0) { //terminate
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) { //terminate
            return 0;
        } else if(n == 1){
            return 1;
        }
//
//        System.out.printf("f(%d - 1) -> %d; f(%d - 2) -> %d%n",
//                n, factorial(n - 1), n, factorial(n - 2));
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i ++) {
            System.out.print(nSum(i) + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i ++) {
            System.out.print(factorial(i)+ " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i ++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}

//Factorial
    //return self * fact(n-1)

//Fibonacci
    //0:0, 1:1, n:(n-1)+(n-2)