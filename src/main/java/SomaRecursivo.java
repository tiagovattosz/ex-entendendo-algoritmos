import java.util.Arrays;
import java.util.List;

public class SomaRecursivo {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 90);
        Integer soma = soma(array);
        System.out.println(soma);
    }

    private static Integer soma(List<Integer> array) {
        if (array.size() == 1) {
            return array.get(0);
        }
        Integer primeiroElemento = array.remove(0);
        return  primeiroElemento + soma(array);
    }
}
