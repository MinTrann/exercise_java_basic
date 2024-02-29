// */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Bai12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao mot so nguyen dương n : ");
            int n = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 1; i < n + 1; i++) {
                    map.put(i,i*i);
            } 
            System.out.println(map);
        scanner.close();
    }
}
