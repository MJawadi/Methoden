import java.util.*;


public class Kino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int reih, sitz;
		System.out.print("Zahl für Reihen: ");
		reih = scan.nextInt();
		System.out.print("Zahl für Sitze: ");
		sitz = scan.nextInt();
		int task;
		int inNum, outNum;
		List<Integer> takenSeats = new ArrayList<Integer>(reih*sitz);
		
		while(true) {
			System.out.print("\nWählen ein: \n1-Reservation \n2-Cansel reservation \n3-Exit programm: ");
			task = scan.nextInt();
			
			if(task==1) {
				System.out.print("The number of seat: ");
				inNum = scan.nextInt();
				if(takenSeats.contains(inNum)) {
					System.out.println("Sorry!! This seat has been taken");
				}else {
					takenSeats.add(inNum);
				}
				Collections.sort(takenSeats);
				methoden(reih, sitz, takenSeats);
			}
			
			if(task==2) {
				System.out.print("The number of seat: ");
				outNum = scan.nextInt();
				takenSeats.remove(new Integer(outNum));
				Collections.sort(takenSeats);
				methoden(reih, sitz, takenSeats);
			}
			
			if(task==3) {
				System.out.println("\nEnd of Programm!");
				Collections.sort(takenSeats);
				methoden(reih, sitz, takenSeats);
				scan.close();
				break;
			}
		}
		Collections.sort(takenSeats);
		methoden(reih, sitz, takenSeats);

	}
	
	public static void methoden(int reihen, int sitze, List<Integer> list) {
		int count =0;
		for(int i=0; i<reihen; i++) {
			for(int j=0; j<sitze; j++) {
				count++;
				if(list.contains(count)) {
					System.out.print(" X");
				}else {
					System.out.print(" O");
				}
			}
			System.out.print("\n");
		}
		
	}
}
