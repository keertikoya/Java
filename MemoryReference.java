import java.util.*;

public class MemoryReference {
    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(6);
        x.add(7);
        ArrayList<Integer> y = new ArrayList<>();
        for( Integer g: x)
            y.add(g);
        y.set(0,999);
        System.out.println(x.get(0));
    }
    public static void house( int[] g)
    {
        g[0]++;
    }
}
