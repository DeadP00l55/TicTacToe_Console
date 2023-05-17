import java.util.Scanner;
public class TicTacToeD2 extends TicTacToe2 {
	public static void main(String[] args) {
	{
	int choice;
	String check;
	char[][] slot = new char[3][3];
System.out.println("This Program will be used to play a game of Tic Tac Toe");
System.out.println("Who will go first ? Enter 1 for X or 2 for O");
Scanner keyboard = new Scanner(System.in);
choice = keyboard.nextInt(); /*Public integer created */
newGame(choice);/*calls newGame method*/
	
		}

	}
}
