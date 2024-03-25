/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author Sandiso
 */
public class RockPaperScissorManager implements RockPaperScissorInterface {

    @Override
    public char generateSign() {
        char [] sign = {'R','P','S'};
        int index = (int)Math.floor(Math.random()*3);
        return sign[index];
    }

    @Override
    public String determineWinner(char playerChoice, char computerChoice) {
       String outcome = "";
       
       if(playerChoice == 'R' && computerChoice == 'P' ){
           outcome = "Paper wraps Rock. Computer wins";
       }else if(playerChoice == 'R' && computerChoice == 'S'){
           outcome = "Rock crashes Scissor. Player wins";
       }else if(playerChoice == 'P' && computerChoice == 'R'){
           outcome = "Paper wraps Rock. Player wins";
       }else if(playerChoice == 'P' && computerChoice == 'S'){
           outcome = "Scissor cuts Paper. Computer wins";
       }else if(playerChoice == 'S' && computerChoice == 'R'){
           outcome = "Rock crashes Scissor. Computer wins";
       }else if(playerChoice == 'S' && computerChoice == 'P'){
           outcome = "Scissor cuts Paper. Player wins";
       }else{
           outcome="Tie";
       }    
       
       
       return  outcome;
    }
    
}
