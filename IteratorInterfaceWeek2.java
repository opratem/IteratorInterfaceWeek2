import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterfaceWeek2 {
    public static void main(String[] args){
        //Create a list
        List<String> words = new ArrayList<>();
        words.add("opratem");
        words.add("praise");
        words.add("game");
        words.add("peace");
        words.add("precious");
        words.add("fruit");
        words.add("bank");

        //print out the list
        System.out.println("The Original List is: " +words);

        //to specify the character and word to look for
        char specificChar = 'o';
        String specificWord = "game";

        //the iterator for the list
        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();

             //remove words containing the specific character
             if(word.contains(String.valueOf(specificChar))) {
                System.out.println("Removing \"" +word+ "\" because it contains" +specificChar);
                iterator.remove();
             }

             //removing words containing the specific words
             else if (word.equals(specificWord)) {
                System.out.println("Removing word \"" +word+ "\" because it matches the specific word" +word);
             }

        }

        //to print out the remaining list
        System.out.println("The Updated list is: "+words);

       
    }
    
}
