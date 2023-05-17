import java.util.Scanner;

public class TicTacToe2{
static Scanner keyboard = new Scanner(System.in);
private static char[][] slot = new char[3][3];/*2D Array to store character values assigned in Board*/
public static void writeBoard(int choice) {
	System.out.println("|R/C| |  1  | |  2  |  3  |");
System.out.println("___________________________" );		
System.out.println("| 1 | |  "+slot[0][0]+"  |"+" |  "+slot[0][1]+"  |  "+slot[0][2]+"  |");		
System.out.println("___________________________" );		
System.out.println("| 2 | |  "+slot[1][0]+"  |"+" |  "+slot[1][1]+"  |  "+slot[1][2]+"  |");		
System.out.println("___________________________" );		
System.out.println("| 3 | |  "+slot[2][0]+"  |"+" |  "+slot[2][1]+"  |  "+slot[2][2]+"  |");		
/*lines 7-13*/
winner();   
getmove(choice+1);
winner(); 
getmove(choice);
winner(); 	
getmove(choice+1);
winner(); 	
getmove(choice);
winner(); 	
getmove(choice+1);
winner(); 	
getmove(choice);
winner(); 	
getmove(choice+1);
winner(); 	
getmove(choice);
winner();
/*lines 15-31 call methods to check for a winner and to accept new moves*/
	}
public static void newGame(int choice) {/*determines if Xs or Os goes first */
if(choice == 1) {/*executes prompt if entered value = 1*/
System.out.println("Player one is Xs and Player two will be Os" );
System.out.println();
System.out.println("It is now Player One's turn" );
System.out.println();
System.out.println("Where do you want your marker placed?" );
System.out.println();
System.out.println("Please enter row and column numbers seperated by a space" );
System.out.println("|R/C| |  1  | |  2  |  3  |");
System.out.println("___________________________" );		
System.out.println("| 1 | |     | |     |     |");		
System.out.println("___________________________" );		
System.out.println("| 2 | |     | |     |     |");		
System.out.println("___________________________" );		
System.out.println("| 3 | |     | |     |     |");	
Board(choice);/*calls Board */
}
else if(choice == 2) {/*executes prompt if entered value = 2*/
	System.out.println("Player one is Os and Player two will be Xs" );
	System.out.println();
	System.out.println("It is now Player One's turn" );
	System.out.println();
	System.out.println("Where do you want your marker placed?" );
	System.out.println();
	System.out.println("Please enter row and column numbers seperated by a space" );
	
	Board(choice);/*calls Board */
}
else if((choice !=1)&&(choice !=2)){/*executes prompt if entered value does not = 1 or 2 */
	System.out.println("Please enter a valid value" );
	choice = keyboard.nextInt();
	newGame(choice);
	/*goes back to newgame if choice defies parameters */
}


}	

public static void Board(int choice) {/*accepts moves */
	String location;
	Scanner keyboard = new Scanner(System.in);
	location = keyboard.nextLine();/*accepts location of move */
	String[] spot = location.split(" ");/*splits location and makes it a string array */
	int a = Integer.parseInt(spot[0]);
	int b = Integer.parseInt(spot[1]);/*lines 70 and 69 convert string[] values to integers */
	System.out.println("You have entered row #"+ a +" column #" + b );/*prompt*/
	if((a > 3) || (a < 0)) {/*lines 72-79 check int values to see if they fit in the array, if not user must pick new values before moving on */
		    System.out.println("Please pick a spot on the board" );
		    Board(choice);
			}
	else if(( b > 3) || (b < 0)) {
			System.out.println("Please pick a spot on the board" );
		    Board( choice);
	}
	else if(choice%2!=0){ /*assigns chars to locations in the array and prompts user to input new values if location is already occupied */
		if(slot[a-1][b-1] =='O') {
			System.out.println("That spot is taken. Please try agin." );
			Board(choice);/*calls Board if value is unacceptable */
			}
			else {
				slot[a-1][b-1] = 'X';
				writeBoard(choice);/*calls writeBoard if value is acceptable *//* */	
			}	
	}
		 else if(choice%2==0) { 
			 if(slot[a-1][b-1] =='X') {
					System.out.println("That spot is taken. Please try agin." );
					Board(choice);/*calls Board if value is unacceptable */
					}
			 else {
				 slot[a-1][b-1] = 'O';
					writeBoard(choice);/*calls writeBoard if value is acceptable */
				 }
						   
			 }
		 }
  
   

public static void getmove(int choice){/*Tells who's move it is and calls Board to get next values */
	if(choice%2==0) {
		System.out.println("It is now O's turn" );
		Board(choice);
	}
	
	else if(choice%2!=0) {
		System.out.println("It is now X's turn" );
		Board(choice);
	}
	}
public static void winner() {/*checks to see if there is a winner or if its a draw and then terminates the program*/
	if(slot[0][0]=='X'&&slot[0][1]=='X'&&slot[0][2]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='X'&&slot[1][0]=='X'&&slot[2][0]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	
	else if(slot[1][0]=='X'&&slot[1][1]=='X'&&slot[1][2]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[2][0]=='X'&&slot[2][1]=='X'&&slot[2][2]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='X'&&slot[1][0]=='X'&&slot[2][0]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[0][1]=='X'&&slot[1][1]=='X'&&slot[2][1]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[0][2]=='X'&&slot[1][2]=='X'&&slot[2][2]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='X'&&slot[1][1]=='X'&&slot[2][2]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[2][0]=='X'&&slot[1][1]=='X'&&slot[0][2]=='X') {
		System.out.println("Xs wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='O'&&slot[0][1]=='O'&&slot[0][2]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='O'&&slot[1][0]=='O'&&slot[2][0]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[1][0]=='O'&&slot[1][1]=='O'&&slot[1][2]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[2][0]=='O'&&slot[2][1]=='O'&&slot[2][2]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='O'&&slot[1][0]=='O'&&slot[2][0]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[0][1]=='O'&&slot[1][1]=='O'&&slot[2][1]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[0][2]=='O'&&slot[1][2]=='O'&&slot[2][2]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(slot[0][0]=='O'&&slot[1][1]=='O'&&slot[2][2]=='O') {
		System.out.println("Os wins !" );
		System.exit(0);
	}
	else if(((slot[0][0] == 'X') || (slot[0][0] == 'O'))&&((slot[0][1] == 'X') || (slot[0][1] == 'O'))&&((slot[0][2] == 'X') || (slot[0][2] == 'O')) && 
			((slot[1][0] == 'X') || (slot[1][0] == 'O')) && ((slot[1][1] == 'X') || (slot[1][1] == 'O'))
			&& ((slot[1][2] == 'X') || (slot[1][2] == 'O')) && ((slot[2][0] == 'X') || slot[2][0] == 'O') && ((slot[2][1] == 'X') || (slot[2][1] == 'O'))
		    && ((slot[2][2] == 'X') || (slot[2][0] == 'O'))){
		System.out.println("It's a DRAW :(" );
		System.exit(0);
	}
}
}






