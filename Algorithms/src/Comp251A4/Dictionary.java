package Comp251A4;
/*
 * Created by evanknox on 15-11-26.
 */

import java.util.ArrayList;

public class Dictionary {

    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String args[]){
        String word = "intermissionoftimes";

        if (print_isValidSentence(word)){
            System.out.println("This string is a valid sentence");
        }else{
            System.out.println("This string isn't a valid sentence");
        }

    }

    private static boolean isValidSentence(String sentence){
        int sLength = sentence.length();

        //Create an array to store boolean values
        boolean M[] = new boolean[sLength];
        M[sLength-1] = true;
        String sub;
        //Now go through the sentence
        for (int i=M.length-1;i>=0;i--){
            for (int j=i;j<sLength;j++){
                sub = sentence.substring(i,j+1);
                if (dict(sub)){
                    if(M[i-1+sub.length()]){
                        if(i == 0){
                            //Then there is a valid string!!
                            return true;
                        }
                        M[i-1] = true;
                        break;
                    }
                }
            }
        }

        return false;
    }


    private static boolean print_isValidSentence(String sentence){
        int sLength = sentence.length();

        //Create an array to store boolean values
        boolean M[] = new boolean[sLength];
        M[sLength-1] = true;
        String sub;
        //Now go through the sentence
        for (int i=M.length-1;i>=0;i--){
            for (int j=i;j<sLength;j++){
                sub = sentence.substring(i,j+1);
                if (dict(sub)){
                    if(M[i-1+sub.length()]){
                        if(i == 0){
                            //Then there is a valid path all the way!!!
                            printFinalList(M,sentence);
                            return true;
                        }
                        M[i-1] = true;
                        break;
                    }
                }
            }
        }

        return false;
    }

    private static void printFinalList(boolean[] m, String sentence) {
        String sub;

        System.out.println("Words are...");
        for (int i=0;i<m.length;i++){
            for (int j= m.length-1;j>0;j--){
                sub = sentence.substring(i,j+1);
                if(m[j] && dict(sub)){
                    i=j;
                    System.out.println(sub);
                    break;
                }
            }
        }
    }

    //Sample dictionary function
    public static boolean dict(String word){
        boolean returnVal;

        switch (word){
            case ("Hello"):
            case("it"):
            case("was"):
            case("the"):
            case("best"):
            case("of"):
            case("times"):
            case("miss"):
            case("is"):
            case("mission"):
            case("intermission"):
                returnVal = true;
                break;
            default:
                returnVal = false;
        }
        return returnVal;
    }
}