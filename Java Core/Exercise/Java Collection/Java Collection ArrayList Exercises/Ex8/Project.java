import java.util.ArrayList;
import java.util.Collections;

class Project{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(2);
        list.add(0);
        list.add(-5);

        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}