import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,6,8,2,3);
        //stream<Integer>data = nums.stream();
        Stream<Integer> data = nums.stream();

        //long count = data.count();
        //System.out.println(count);

        // Stream<Integer>mappedData = data.map(n->n*2);
        // mappedData.forEach(n->System.out.println(n));

        Stream<Integer>SortedData = data.sorted();
        SortedData.forEach(n->System.out.println(n));

    }
    
}
