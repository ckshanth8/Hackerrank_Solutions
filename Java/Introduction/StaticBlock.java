import java.io.*;
import java.util.*;

public class StaticBlock {

    static int B, H;
    static boolean flag = true;
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
        try {
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            flag = false;
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}