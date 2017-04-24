
package MagicSquare;

import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {
         
        int sumRow, sumCol, sum = 0;
	boolean magic = true;
	int[][] score = new int[4][4];
	Scanner input = new Scanner(System.in);

	System.out.print("Enter 16 numbers ");
	for (int i=0; i<4; i++)
	   for (int j=0; j<4; j++) 
	      score[i][j] = input.nextInt();

	System.out.println("Magic Square");
	for (int i=0; i<4; i++) {
	   for (int j=0; j<4; j++) 
	      System.out.print(score[i][j] + " ");
                System.out.println();
	}

	for (int j=0; j<4; j++)
	   sum += score[0][j];

	for (int i=1; i<4; i++) {
	   sumRow = 0;
	   for (int j=0; j<4; j++)
	      sumRow += score[i][j];
	   if (sumRow != sum) {
	      magic = false;
	      break;
	   }
	}

	if (magic) {
	   for (int j=0; j<4; j++) {
	      sumCol = 0;
	      for (int i=0; i<4; i++)
		 sumCol += score[i][j];
	      if (sumCol != sum) {
		 magic = false;
		 break;
	      }
	   }
	}

	if (magic)
	   System.out.println("It is true.");
	else
	   System.out.println("It is false.");
             
    }        

}
    