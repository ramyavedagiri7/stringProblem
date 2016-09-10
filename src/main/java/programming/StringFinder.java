package programming;

/**
 * Created by rvedagiri on 9/9/16.
 */
public class StringFinder {

    public String stringProblem(String str, char c){
        String newStr="";
        for(int i=0;i<str.length();i++){ // Iterates over every character
            if(str.charAt(i) == c){
                // DO Nothing
            }
            else{
                newStr= newStr+""+str.charAt(i);    // Removed the matched character from the string
            }
        }
        return newStr;

    }

    public String stringProblem1(String str,char c){

        return str.replace(Character.toString(c),"");  // Replace all matched characters with

    }

    public static void main(String[] args){
        StringFinder sf= new StringFinder();
        System.out.println(sf.stringProblem1("Hello World. This is Java", 'l'));
    }
}
