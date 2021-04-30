package Question_2;
import java.util.StringTokenizer;

class CustomStringTokenizer extends StringTokenizer{

    private int tCount;

    public CustomStringTokenizer(String someString) {
        super(someString);
    }

    public int countTokens(){
        int tTokens = super.countTokens();
        tCount = tTokens;
        String token;
        int i = 0;
        while(i<tTokens){
            token = super.nextToken();
            for(int j = 0; j<token.length(); j++){
                if(Character.isDigit(token.charAt(j))){
                    tCount--;
                    break;
                }
            }
            i++;
        }
        return tCount;
    }
}
