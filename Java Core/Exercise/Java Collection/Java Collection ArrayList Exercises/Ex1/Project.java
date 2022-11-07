import java.util.ArrayList;
class Project{
    public static void main(String[] args) {
        ArrayList<String> ListColor = new ArrayList<String>();
        
        ListColor.add("Red");
        ListColor.add("black");

        // Cach 1 :
        for(int i = 0 ; i < ListColor.size() ; ++i){
            System.out.println(ListColor.get(i));
        }

        // Cach 2 :
        for(String color : ListColor){
            System.out.println(color);
        }

        // Cach 3 :
        // Cach 4 :
        // Cach 5 :
        // Cach 6 :
        
        // Ngoai ra neu list toan la string thi co the dung :
        //System.out.println(ListColor);
    }
}