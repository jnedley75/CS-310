import java.util.Scanner;

public class LexicalSyntaxAnalyzer {
    public static void main(String[] args){

    }

    public boolean program(){
        /*
            check for keyword procedure
            TEST TES TESTT
            then scan name
            check for keyword begin that follows name
            calls for stmtList
            checks for keyword end
         */
        return false;
    }
    
    //Lexical Analyzer Methods:
    
     public boolean int_literal(){
        /*
            calls for digit repeatedly if needed
         */
        return false;
    }
    
     public boolean procedure_keyword(){
        /*
            Checks to see if procedure keyword
         */
        return false;
    }
    
     public boolean begin_keyword(){
        /*
           Checks to see for begin keyword
         */
        return false;
    }
    
     public boolean end_keyword(){
        /*
            Checks to see for end keyword
         */
        return false;
    }
    
     public boolean semicolon(){
        /*
            Checks to see if token is a semicolon
         */
        return false;
    }
    
     public boolean assignment_op(){
        /*
            Checks to see if token is a assignment operator
         */
        return false;
    }
    
     public boolean addiion_op(){
        /*
            Checks to see if token is a '+'
         */
        return false;
    }
    
     public boolean subtraction_op(){
        /*
            checks to see if token is a '-'
         */
        return false;
    }
    
     public boolean multiplication_op(){
        /*
            Checks to see if token is '*'
         */
        return false;
    }
    
     public boolean division_op(){
        /*
            checks to see if token is '/'
         */
        return false;
    }
    
     public boolean equality_op(){
        /*
            Checks to see if '==' is the token
         */
        return false;
    }
    
     public boolean notequal_op(){
        /*
            Checks to see if '!=' is the token
         */
        return false;
    }
    
     public boolean parenthesis(){
        /*
           Checks to see if '(' or ')' are used
         */
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
    
     public boolean end_of_input(){
       /*
            checks to see if file reaches end of input
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
    
    /*
       function lex():
       invoked to retrive the next token from the input file. The input file s read character by characer.
       Depending on character read characters are joined into lexemes. 
       The lex function will return an integer representing one of the following oken classes or lexeme types
    */
    public 
   

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

   
}
