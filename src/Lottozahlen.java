import java.util.*;
public class Lottozahlen {

	public static void main(String[] args) {
		lotto();
	}
	
	public static void lotto() {
		ArrayList<Integer> numbers = new ArrayList<Integer>(6);
		int inNum = 1;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Zahl " +inNum+": ");
			int zahl = scan.nextInt();
			if(zahl > 0 & zahl <50) {
				numbers.add(zahl);
				inNum ++;
			}else {
				System.out.println("Error!!! Sie konnen nicht dise zahle nehmen!!!");
			}
		}
	}

}
