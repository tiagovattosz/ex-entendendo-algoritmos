import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaiorValorArrayRecursivo {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(12, 3, 4, 556, 5));
        System.out.println(encontrarMaiorValor(array));
    }

    public static Integer encontrarMaiorValor(List<Integer> array) {
        if (array.size() == 2) {
            if (array.get(0) > array.get(1)) return array.get(0);
            else return array.get(1);
        }
        List<Integer> novaArray = new ArrayList<>(array);
        novaArray.remove(0);
        Integer subMax = encontrarMaiorValor(novaArray);
        if (subMax > array.get(0)) return subMax;
        else return array.get(0);
    }
}
