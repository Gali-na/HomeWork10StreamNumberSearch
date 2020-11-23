import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;


public class Main {
    public static void main(String[] args) {
        int[] arryNumber = new int[]{5, 6, 7, 8, 9,2,-1, -4, -2,};
        Arrays.sort(arryNumber);
        numberSearch(arryNumber);
    }

    public static void numberSearch(int[] arryNumber) {
        OptionalInt positivNumber = Arrays.stream(arryNumber)
                .map(currentElement -> {
                    int tempElement = 0;
                    if (currentElement < 0) {
                        tempElement = currentElement * (-1);
                    } else {
                        tempElement = currentElement;
                    }
                    return tempElement; })
                .sorted()
                .findFirst();
        int rezult = 0;
        if (positivNumber.isPresent()) {
            if(Arrays.binarySearch(arryNumber, positivNumber.getAsInt())>0){
             rezult=Arrays.binarySearch(arryNumber, positivNumber.getAsInt());
            }
            else {
                rezult=positivNumber.getAsInt()*(-1);
            }
            System.out.println(rezult);
        }
    }
}
