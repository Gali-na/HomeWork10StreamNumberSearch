import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer[] arryNumber = new Integer[]{5, 6, 7, 8, 9, 2, -4, -2,};
        numberSearch (arryNumber);
    }

    public static void numberSearch ( Integer[] arryNumber) {
        Optional<Integer> negativeNumber = Arrays.stream(arryNumber)
                .filter(x -> x < 0)
                .sorted((a, b) -> b - a)
                .findFirst();
        Optional<Integer> positivNumber = Arrays.stream(arryNumber)
                .filter(x -> x > 0)
                .sorted()
                .findFirst();
        int rezult = 0;
        if (negativeNumber.isPresent() && positivNumber.isPresent()) {
            rezult = Math.abs(negativeNumber.get())<= Math.abs(positivNumber.get()) ? positivNumber.get() : negativeNumber.get();
        }
        System.out.println(rezult);
    }
}
