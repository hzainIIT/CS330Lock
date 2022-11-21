import java.util.Scanner;

class main {
	public static void main(String[] args) {
	int accesscode = 64188;
	int stage = 0;
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.print("Enter Code:");
		String code = sc.nextLine();
		for(int i = 0; i<code.length()-5; i++) {
			String numword =(code.substring(i, i+6));
			//String jnum = numword.replaceAll("[^0-9]","");
			//int realnum = Integer.parseInt(numword);
			//System.out.println(realnum);
			if(("641881").equals(numword) || ("641884").equals(numword)) {
				int realnum = Integer.parseInt(numword);
				if((realnum%10) == 4) {
					System.out.println("Locked");
				}
				else if((realnum%10) == 1){
					System.out.println("Unlocked");
				}
			}
		}
		}
	}
}
