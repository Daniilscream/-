import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        Boolean b = true;
        while(in.hasNext()&&b) {
            String[] s = in.nextLine().split(" ");
            if(s[0].equals("printList")) {
                for (Integer i : arr) {
                    System.out.print(i + " ");
                }
            b=false;
            break;
            }
            if(s.length>=2){
            int n = Integer.valueOf(s[1]);

            switch (s[0]) {
                case ("create"):
                    for (int i = 1; i <= n; i++) {
                        arr.add(i);
                    }
                    break;

                case ("add"):
                    if (s.length == 3) {
                        int or = Integer.valueOf(s[2]);
                        arr.add(n, or);
                    } else arr.add(n);
                    break;

                case ("remove"):
                    arr.remove(n);
                    break;

                case ("set"):
                    int or = Integer.valueOf(s[2]);
                    arr.set(n, or);
                    break;
            }
            }
        }
    }
}
