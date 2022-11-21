import java.util.Scanner;

class main {
	public static void main(String[] args) {
	int accesscode = 64188;
	int stage = 0;
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.print("Enter Code:");
		String code = sc.nextLine();
		String jnum = code.replaceAll("[^0-9]","");
		for(int i = 0; i<jnum.length()-5; i++) {
			int realnum = Integer.parseInt(jnum.substring(i, i+6));
			System.out.println(realnum);
			if((int)(realnum/10) == accesscode) {
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
