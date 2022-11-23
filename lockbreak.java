import java.util.Scanner;

class lockbreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount of attempts:");
		int tri = sc.nextInt();
		int accesscode = 64188;
		int attempts = 0;
		//int tri = 1000;
		double avg = 0;
		boolean complete = false;
		String state = "Locked";
		for(int i = 0; i<tri; i++) {
			complete = false;
			attempts = 0;
			while(!complete) {
				int guess = (int)(Math.random()*1000000);
				//System.out.println(guess);
				if(641881==guess || 641884==guess) { 
					if((guess%10) == 4) {
						state = "Locked";
						System.out.println(state + " through " + attempts + " attempts");
						avg = attempts+avg;
						complete = true;
						}
					else if((guess%10) == 1){
						state = "Unlocked";
						System.out.println(state + " through " + attempts + " attempts");
						avg = attempts+avg;
						complete = true;
					}
				}
				else {
						attempts = attempts+1;
				}
			}
		}
		System.out.println("Average time: " + (avg/tri) + " Seconds");
	}
}
