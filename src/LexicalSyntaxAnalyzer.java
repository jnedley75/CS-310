import java.util.Scanner;

public class LexicalSyntaxAnalyzer {
    public static void main(String[] args){

    }

    public boolean program(){
        /*
            check for keyword procedure
            then scan name
            check for keyword begin that follows name
            calls for stmtList
            checks for keyword end
         */
        return false;
    }

    public boolean stmtList(){
        /*
            calls for stmt
            check for multiple statements, if so use recursion
         */
        return false;
    }

    public boolean stmt(){
        //calls for assign statement or if statement
        return false;
    }

    public boolean If(){
       /*
            checks for keyword if(
            then calls for bool
            checks for keywords ) then
            calls for stmtList
            checks for keyword else, if present calls for stmtList
            checks for keyword endif
        */

        return false;
    }

    public boolean assign(){
       /*
            calls for var
            checks for keyword :=
            calls for expr
            checks for keyword ;
        */
        return false;
    }

    public boolean expr(){
        /*
            calls for term
            checks for key operator, if present call for term
         */
        return false;
    }

    public boolean term(){
        /*
            calls for var
            if var is false, then calls for Int
         */
        return false;
    }

    public boolean bool(){
        /*
            calls for var
            checks for key operators (= or !=), if present call for Int
         */
        return false;
    }

    public boolean letter(){
        //checks for characters [a-Z]
        return false;
    }

    public boolean digit(){
        //checks for integers [0-9]
        return false;
    }

    public boolean letterDigit(){
        if(letter()){
            return true;
        }
        else if(digit()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean var(){
        /*
            calls letter
            then calls for letterDigit repeatedly if needed
         */
        return false;
    }

    public boolean Int(){
        /*
            calls for digit repeatedly if needed
         */
        return false;
    }
}
