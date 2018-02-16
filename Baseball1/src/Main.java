import java.util.Scanner;


public class Main 
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("player name?");
		String name = kb.nextLine();
		
		System.out.println("player hits?");
		int hits = kb.nextInt();
		
		System.out.println("player doubles?");
		int doubles = kb.nextInt();
		
		System.out.println("player triples?");
		int triples = kb.nextInt();
		
		System.out.println("player home runs?");
		int homeruns = kb.nextInt();
		
		System.out.println("player walks?");
		int walks = kb.nextInt();
		
		System.out.println("player at bats?");
		int atBat = kb.nextInt();
		
		System.out.println("player hit by pitch?");
		int hitByPitch = kb.nextInt();
		
		System.out.println("player sacrifice fly?");
		int sacFly = kb.nextInt();
		
		Baseballer BabeRuth = new Baseballer(hits, atBat, walks, hitByPitch, sacFly, doubles, triples, homeruns);
		
		/* Babe Ruth stats
		 * 
		 * Hits: 2873
		 * AB: 8399
		 * BB: 2062
		 * HBP: 43
		 * SF: 0
		 * 2B: 506
		 * 3B: 136
		 * HR: 714
		 * 
		 */
		
		System.out.println("Statistics for" + name + ": ");
		System.out.println("Hits: "+hits);
		System.out.println("At bats: "+atBat);
		System.out.println("Walks: "+walks);
		System.out.println("Sacrafice flys: "+sacFly);
		System.out.println("Doubles: "+doubles);
		System.out.println("Triples: "+triples);
		System.out.println("Home runs: "+homeruns);
		System.out.println("BA: "+ BabeRuth.getBA());
		System.out.println("OBP: " + BabeRuth.getOBP());
		System.out.println("SLG: " + BabeRuth.getSLG());
		System.out.println("OBS: " + BabeRuth.getOBS());
		System.out.println("TB: " + BabeRuth.getTB());
	}

}
