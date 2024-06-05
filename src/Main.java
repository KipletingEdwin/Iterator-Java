import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet<String> foods = new HashSet<String>();

        foods.add("Pizza");
        foods.add("Ice Cream");
        foods.add("bourbon chicken");


        Iterator<String> it = foods.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(23);
        nums.add(213);
        nums.add(123);
        nums.add(233);

        Iterator<Integer> ite = nums.iterator();

        while (ite.hasNext()){
            int i = ite.next();

            if(i < 150){
                ite.remove();
            }
        }
        System.out.println(nums);


    }
}