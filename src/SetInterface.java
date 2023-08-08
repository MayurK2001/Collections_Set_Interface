import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class SetInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of the cities: ");
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();
        System.out.println("Enter the names of "+n+" cities: ");
        sc.nextLine();
        for(int i = 0 ; i < n ; i  ++){
            list.add(sc.nextLine());
        }
        HashSet<String> h = new HashSet<>(list);
        System.out.println("All cities:");
        System.out.println(h);
    }
}
