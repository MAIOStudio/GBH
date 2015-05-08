/**
 * Created by dearmartinez on 5/8/15.
 */
public class NumeroRepetido {

    public static void main(String[] args) {
        int myNums[] = {3, 10, 5, 27, 1, 25, 2, 11, 24, 9, 31, 19, 28, 12, 22, 18, 4, 23, 29, 14, 6, 30 , 26, 21, 7, 34, 35, 32, 15, 13, 8, 20, 16, 33, 17, 7};
        int numRep = -1;
        int posNumRep = -1;
        for (int i = 1; i < myNums.length; i++) {
            int currNum = myNums[i];
            for (int j = 0; j<i; j++){
                if (currNum == myNums[j]) {
                    numRep = currNum;
                    posNumRep = i;
                    break;
                }
                if (numRep >= 0)
                    break;
            }
        }
        System.out.println("El número " + numRep + " se repite en la posición #" + posNumRep);
    }
}