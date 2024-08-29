import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ContaElementosRecursivo {
    public static void main(String[] args) {
        List<Integer> array = new LinkedList<>(Arrays.asList(1, 2, 3, 3, 1));
        System.out.println(contarElementos(array));
    }

    public static Integer contarElementos(List array){
        if(array.isEmpty()){
            return 0;
        }
        array.remove(0);
        return 1 + contarElementos(array);
    }
}
