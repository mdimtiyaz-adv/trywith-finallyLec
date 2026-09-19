import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryWithfinally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // try with finally is used when we do or perform something with of without
        // handling the exception.
        int i = 0;
        int j = 20;
        int num;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.println("enter a number");
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            bf.close();

        }
        // catch (Exception e) {
        // System.out.println("cant divide by 0");
        // }
        // finally {
        // // it is used when we have to close the resources.
        // // bf.close();
        // }
    }
}
