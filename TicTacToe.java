package Game;

import java.util.Scanner;

public class TicTacToe 
{  
	//uc case 1
	static char tic[]=new char[10];
	public static void board()
	{
	 for(int i=0;i<10;i++)
	 {
		tic[i]=' ';
	 }
	 System.out.println("empty board is");
	 for(int i=0;i<10;i++)
	 {
		System.out.println(tic[i]);
	 }
	}
  public static void main(String[] args) {
		  char usermark,computermark;
		TicTacToe game=new TicTacToe();
	    Scanner in=new Scanner(System.in); 
	    
	   //initialize board
	     int counter=0;
	     for(int i=0 ; i<3; i++)
	     {
	      for(int j=0 ; j<3 ; j++)
	      {
	       game.tictoc[i][j]=Character.forDigit(++counter,10);
	      }
	    }  
	     board();
     }
}
