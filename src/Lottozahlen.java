import java.util.*;
public class Lottozahlen {
	
	public static void main(String[] args) {
		lotto();
	}
	
	public static void lotto() {
		
		// initialisieren die Variablen
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		ArrayList<Integer> randNum = new ArrayList<Integer>(5);
		int inNum = 1;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		boolean weiter = true;
		
		
		System.out.println("\nDer Lottozahlenziehung:\n");
		while(inNum<7) {
			System.out.print("Zahl " +inNum+" :1/49: ");
			int zahl = scan.nextInt();
			if(zahl > 0 & zahl <50) {
				if(numbers.contains(zahl)) {
					System.out.println("Error!!! Sie haben schon dise Number genohmne! nehmen noch ein");
				}else {
					numbers.add(zahl);
					inNum ++;
				}
			}else {
				System.out.println("Error!!! Sie konnen nicht dise zahle nehmen!!!");
			}
		}
		for(int i=0; i<6; i++) {
			int rand = random.nextInt(49)+1;
			if(randNum.contains(rand)) {
				i--;
			}else {
				randNum.add(rand);
			}
		}
		Collections.sort(numbers);
		Collections.sort(randNum);
		ArrayList<Integer> richtig = new ArrayList<Integer>(5);
		int test = 0;
		for(int set : numbers) {
			for(int val : randNum) {
				if(set == val) {
					richtig.add(set);
					test++;
				}
			}
		}
		System.out.println("\nIhre Lottozahlenziehungen:  " + numbers);
		System.out.println("Lottozahlen sind:           " + randNum);
		if(test==6) {
			System.out.println("\nGlückwunsch!!! Sie haben die Lotterie gewonnen");
		}else {
			System.out.println("\nSie haben die Lotterie nicht gewonnen!!!");
			System.out.println("Richtige Numers: " + richtig);
		}
		randNum.clear();
		richtig.clear();
		
		
		while(weiter) {
			int take=0;
			System.out.println("\n\n1 - Versuchen Sie es noch einmal mit den letzten Zahlen. \n2 - Programm beenden. ");
			take = scan.nextInt();
			
			
			if(take==1) {
				for(int i=0; i<6; i++) {
					int rand = random.nextInt(49)+1;
					if(randNum.contains(rand)) {
						i--;
					}else {
						randNum.add(rand);
					}
				}
				Collections.sort(numbers);
				Collections.sort(randNum);
				test = 0;
				for(int set : numbers) {
					for(int val : randNum) {
						if(set == val) {
							richtig.add(set);
							test++;
						}
					}
				}
				System.out.println("\nIhre Lottozahlenziehungen:  " + numbers);
				System.out.println("Lottozahlen sind:           " + randNum);
				randNum.clear();
				richtig.clear();
				
				if(test==6) {
					System.out.println("\nGlückwunsch!!! Sie haben die Lotterie gewonnen");
				}else {
					System.out.println("\nSie haben die Lotterie nicht gewonnen!!!");
					System.out.println("Richtige Numers: " + richtig);
				}
			}
			
			if(take==2) {
				numbers.clear();
				weiter=false;
				scan.close();
			}
		}
		
		
	}

}
