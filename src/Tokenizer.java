public class Tokenizer {
    private String subject;
    private char[] tokens = null;
    private String current;
    private int currentPosition=-1;

    //constructor for tokenizer call
    public Tokenizer(){

    }

    //converting string into a token value
    public void storeTokenizableString(String subject){
        this.subject = subject;
        tokens = subject.toCharArray();
        currentPosition=0;
        current = String.valueOf(tokens[0]);
    }

    //method to retrieve current token
    public String getCurrentToken(){
        return current;
    }

    //method to check if the token is at the end of the string
    private boolean endOfString(){
        return currentPosition == tokens.length-1;
    }

    //method to retrieve the next token
    public String getNextToken(){
        if(endOfString()){
            current="#";
            return "#";
        }
        else if(String.valueOf(tokens[currentPosition+1]).equals(" ")){
            currentPosition++;
            return getNextToken();
        }
        else{
            current = String.valueOf(tokens[currentPosition+1]);
            currentPosition++;
            return current;
        }
    }
}