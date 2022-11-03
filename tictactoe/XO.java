import java.util.*;
public class XO {
    static char[][] board= {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boardp();
		int player=1,res=1;
		while(res!=0) {
		    System.out.println("Player "+player+" enter the position to insert: ");
		    int pos=sc.nextInt();
		    res=insert(pos,player);
		    if(res!=2) {
		    if(player==1) {
		    	player=2;
		    }
		    else {
		    	player--;
		    }
		    }
		    
		}
	}
        //insert the element in the XO
	static int insert(int pos,int player) {
		int res=0;
		switch(pos) {
		case 1:
			if(board[0][0]!='x' && board[0][0]!='o') {
			if(player==1) {
				board[0][0]='x';
				boardp();
				res=check(board[0][0]);
			}
			else {
				board[0][0]='o';
				boardp();
				res=check(board[0][0]);
			}
			
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
			System.out.println("player "+player+" won the match...");
			return 0;
			}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 2:
			if(board[0][2]!='x' && board[0][2]!='o') {
			if(player==1) {
				board[0][2]='x';
				boardp();
				res=check(board[0][2]);
			}
			else {
				board[0][2]='o';
				boardp();
				res=check(board[0][2]);
			}
			
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 3:
			if(board[0][4]!='x' && board[0][4]!='o') {
			if(player==1) {
				board[0][4]='x';
				boardp();
				res=check(board[0][4]);
			}
			else {
				board[0][4]='o';
				boardp();
				res=check(board[0][4]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 4:
			if(board[2][0]!='x' && board[2][0]!='o') {
			if(player==1) {
				board[2][0]='x';
				boardp();
				res=check(board[2][0]);
			}
			else {
				board[2][0]='o';
				boardp();
				res=check(board[2][0]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		
		case 5:
			if(board[2][2]!='x' && board[2][2]!='o') {
			if(player==1) {
				board[2][2]='x';
				boardp();
				res=check(board[2][2]);
			}
			else {
				board[2][2]='o';
				boardp();
				res=check(board[2][2]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 6:
			if(board[2][4]!='x' && board[2][4]!='o') {
			if(player==1) {
				board[2][4]='x';
				boardp();
				res=check(board[2][4]);
			}
			else {
				board[2][4]='o';
				boardp();
				res=check(board[2][4]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 7:
			if(board[4][0]!='x' && board[4][0]!='o') {
			if(player==1) {
				board[4][0]='x';
				boardp();
				res=check(board[4][0]);
			}
			else {
				board[4][0]='o';
				boardp();
				res=check(board[4][0]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 8:
			if(board[4][2]!='x' && board[4][2]!='o') {
			if(player==1) {
				board[4][2]='x';
				boardp();
				res=check(board[4][2]);
			}
			else {
				board[4][2]='o';
				boardp();
				res=check(board[4][2]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
		case 9:
			if(board[4][4]!='x' && board[4][4]!='o') {
			if(player==1) {
				board[4][4]='x';
				boardp();
				res=check(board[4][4]);
			}
			else {
				board[4][4]='o';
				boardp();
				res=check(board[4][4]);
			}
			}
			else {
				System.out.println("The given position is already occupied. Please select another place");
				return 2;
			}
			if(res==1) {
				System.out.println("player "+player+" won the match...");
				return 0;
				}
			else if(res==2) {
				System.out.println("The match is draw.");
				return 0;
			}
			break;
			default:
				System.out.println("Invalid position");
		}
		return 1;
	}
	
	//check ever step if the player who take the last move is win or not
	
	static int check(char c){
		//System.out.println(c);
		int arr[]=new int[9];
		int k=0,count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(board[i][j]==' ') {
					count++;
				}
				if(board[i][j]==c) {
				arr[k]=1;
				k++;
				}
				else if(board[i][j]!='|' && board[i][j]!='+' && board[i][j]!='-') {
					arr[k]=0;
				k++;
				}
				
			}
		}
		if(count==0) {
			return 2;
		}
	//	System.out.println(Arrays.toString(arr));
		if(arr[0]==1 && arr[4]==1 && arr[8]==1) {
			return 1;
		}
		
		if(arr[2]==1 && arr[4]==1 && arr[6]==1) {
			return 1;
		}
		for(int i=0;i<arr.length;i+=3) {
			if(arr[i]==1 && arr[i+1]==1 && arr[i+2]==1) {
				return 1;
			}
		}
		
		for(int i=0;i<3;i++) {
			if(arr[i]==1 && arr[i+3]==1 && arr[i+6]==1) {
				return 1;
			}
		}
		return 0;
	}
	static void boardp() {
		for(char[] row:board) {
			for(char ele:row) {
				System.out.print(ele);
			}
			System.out.println();
		}
	}
}
