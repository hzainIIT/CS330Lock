import java.util.Scanner;

class main {
	public static void main(String[] args) {
	int accesscode = 64188;
	String state = "Locked";
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.print("Enter Code:");
		String code = sc.nextLine();
		for(int i = 0; i<code.length()-5; i++) { // getting the 6 letters
			String numword =(code.substring(i, i+6));
			if(("641881").equals(numword) || ("641884").equals(numword)) { 
				int realnum = Integer.parseInt(numword);
				if((realnum%10) == 4) {
					state = "Locked";
					System.out.println(state);
				}
				else if((realnum%10) == 1){
					state = "Unlocked";
					System.out.println(state);
				}
			}
		}
		}
	}
}
