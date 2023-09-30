public class GetShortestWord
{
    public static String getShortestWord(String text1, String text2){
        if (text1.length() > text2.length()){
            return text2;
        }
        else {
            return text1;
        }
    }
    /* Code a method that returns the shortest word of the two inputs*/
}