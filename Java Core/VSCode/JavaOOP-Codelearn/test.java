import java.util.LinkedList;

class Main{
    public static void main(String[] args) {
        LinkedList<String> aList = new LinkedList<>();
        aList.add("A");
        aList.add("B");
        aList.add("B");
        aList.add("C");

        for(int i = 0 ; i < aList.size() - 1; ++i){
            for(int j = i + 1 ; j < aList.size() ; ++j){
                if(aList.get(i) == aList.get(j)){
                    aList.remove(j);
                    --j;
                }
            }
        }
        for(int i = 0; i < aList.size() ; ++i){
            System.out.println(aList.get(aList.size()));
        }
    }
}