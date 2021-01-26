import java.util.Scanner;



public class ifElse {

    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        int N = scanner.nextInt();
         scanner.skip("(\r\n| [\n\r\u2028\u2029\u0085])?");
         scanner.close();

        if (( N%2) == 0 || (6 < N && N < 20) ) {

            System.out.println("Weired");
        }
        else {
             System.out.println("Not Weired");
        }
                }
            }





