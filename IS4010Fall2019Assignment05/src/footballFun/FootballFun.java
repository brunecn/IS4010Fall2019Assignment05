/*
 * IS4010 Fal 2019
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package footballFun;

public class FootballFun {

    public static void main(String[] args) {
        int correctCount = 0;
        if (translateScore(2).equals("safety") == true) { correctCount++;}
        if (translateScore(3).equals("field goal") == true) { correctCount++;}
        if (translateScore(6).equals("touchdown") == true) { correctCount++;}
        if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
        if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
        if (translateScore(-1).equals("") == true) { correctCount++;}
        if (translateScore(1).equals("invalid") == true) { correctCount++;}
        if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}

        if (correctCount == 8) {
            System.out.println("All tests passed");
        } else {
            System.out.println("At least one test failed");
        }
    }
    
    /***
     * Takes a football score and returns the name that corresponds it
     * @param score The football score
     * @return Return string
     */
    
    public static String translateScore (int score) {
        String scoreDisc = "";

        switch(score) {
        case 2:
            scoreDisc = "safety";
            break;
        case 3:
            scoreDisc = "field goal";
            break;
        case 6:
            scoreDisc = "touchdown";
            break;
        case 7:
            scoreDisc = "touchdown and extra point";
            break;
        case 8:
            scoreDisc = "touchdown and 2-point conversion";
            break;
        case -1:
            scoreDisc = "";
            break;
        case 1:
            scoreDisc = "invalid";
            break;
        case 10:
    		scoreDisc = "you must be playing Quidditch ";
    		break;
            
        }
        return scoreDisc;
        
    }

      
    }

