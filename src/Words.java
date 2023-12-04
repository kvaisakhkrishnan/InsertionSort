import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Words {
    ArrayList<String> words;
    Words(){
        words = new ArrayList<>();
    }
    public void addWord(String word){
        this.words.add(word);
        System.out.println("Word " + word + " added");
    }
    void insertionSort() {
        if (this.words.size() <= 1) {
            return;
        }

        for (int i = 1; i < this.words.size(); i++) {
            String tempWord = this.words.get(i);
            int j = i - 1;

            while (j >= 0 && this.words.get(j).compareTo(tempWord) > 0) {
                this.words.set(j + 1, this.words.get(j));
                j--;
            }
            this.words.set(j + 1, tempWord);
        }

        System.out.println("Array After Insertion Sort: ");
        for (String word : this.words) {
            System.out.println(word);
        }
    }


}