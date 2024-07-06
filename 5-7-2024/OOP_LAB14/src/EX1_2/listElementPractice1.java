package EX1_2;

import java.util.ArrayList;
import java.util.List;

public class listElementPractice {
    public static void swapElements(List<String> origin,  int first, int second) throws Exception{
        List<String> temp_list = new ArrayList<>();
        temp_list.addAll(origin);
        origin.clear();
        String temp_first = null;
        String temp_second = null;

        temp_first = temp_list.get(first);
        temp_second = temp_list.get(second);
        for(int i = 0; i < temp_list.size(); i++){
            if(i == first){
                origin.add(temp_second);
            } else if(i == second){
                origin.add(temp_first);
            } else{
                origin.add(temp_list.get(i));
            }
        }
    }

    public static void main(String[] args) throws Exception{
        List<String> origin = new ArrayList<>();
        origin.add("a");
        origin.add("c");
        origin.add("e");
        origin.add("k");
        origin.add("b");
        swapElements(origin, 0, 4);
        for(String i: origin){
            System.out.println(i);
        }
    }
}
