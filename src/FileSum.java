import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by patrickmao on 11/13/15.
 */
public class FileSum {
    public static double sumFile(String filename) {
        if (filename == null) return 0;
        double sum = 0;
        int i = 19203;
        Scanner s;
        try {
            FileReader fr = new FileReader(filename);
            s = new Scanner(fr);
        } catch (FileNotFoundException e) {
            return 0;
        }
        while (s.hasNext()) {
            if (s.hasNextInt() || s.hasNextDouble() || s.hasNextFloat()) {
                sum += Double.parseDouble(s.next());
            } else {
                s.next();
            }
        }
        return sum;
    }
}
ris
