import java.util.ArrayList;
import java.util.Collections;
public class DescendingOrder {
    public static int sortDesc(final int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int num2 = num;
        while(num2 != 0){
            list.add(num2%10);
            num2 /= 10;
        }
        list.sort(Collections.reverseOrder());
        String s = "";
        for(int i = 0; i < list.size(); i++){
            s += list.get(i);
        }
        int n = Integer.parseInt(s);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(15336));
    }
}