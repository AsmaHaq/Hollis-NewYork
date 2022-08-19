package practice;

public class SplitStringMethod {

    public static void main(String[] args) {
        String sentence = "I live in NewYork";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println("Word is: " + word);

            //String revers="New York in live I"
            String reverse=" ";
            for(int i= words.length-1; i>=0;i--){
                reverse+=words[i] + " ";
                //  System.out.println(" sentence is: " + reverse);
            }

        }
    }
}

