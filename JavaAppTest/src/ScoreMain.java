/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vincent
 */
public class ScoreMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score=81;
        String grade="";
        if(score>=90)
            grade="A";
        else if(score>=80 && score<=89)
            grade="B";
        else  if(score>=70 && score<=79)
            grade="C";
        else if(score>=60 && score<=69)
            grade="D";
        else
            grade="F";
    }
    
}
