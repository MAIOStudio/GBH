package OrdenamientoNumericoIO;

import java.io.*;
import java.util.*;

/**
 * Created by dearmartinez on 5/8/15.
 */
public class OrdenamientoNumericoIO {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("IntegerArray.txt"));
        int numero[] = new int [100];
        int i = 0;
        while(scanner.hasNextInt())
        {
            numero[i++] = scanner.nextInt();
            System.out.println(i);
        }
    }
}
