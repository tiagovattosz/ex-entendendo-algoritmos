import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 6, 8, 12, 92, 3, 1, 2));
        System.out.println(quickSort(array));
    }

    public static List<Integer> quickSort(List<Integer> array){
        if(array.size() < 2){
            return array;
        } else {
            Integer pivo = array.remove(0);
            List<Integer> arrayMenor = new ArrayList<>();
            List<Integer> arrayMaior = new ArrayList<>();
            for (Integer item : array){
                if (item < pivo){
                    arrayMenor.add(item);
                } else {
                    arrayMaior.add(item);
                }
            }
            List<Integer> arrayOrdenada = new ArrayList<>();
            arrayOrdenada.addAll(quickSort(arrayMenor));
            arrayOrdenada.add(pivo);
            arrayOrdenada.addAll(quickSort(arrayMaior));
            return arrayOrdenada;
        }
    }
}
