import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("breedflip.in"));
        PrintWriter pw = new PrintWriter("breedflip.out");
        int N = sc.nextInt();
        String[] intend = sc.next().split("");
        String[] actual = sc.next().split("");

        int ind = 0;
        boolean same = true;
        int count = 0;
        while (ind < N) {
            if (!intend[ind].equals(actual[ind]) && same) {
                same = false;
            } else if (!same && intend[ind].equals(actual[ind])) {
                count++;
                same = true;
            }
            ind++;
        }

        pw.println(count);
        pw.close();
    }
}