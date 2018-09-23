import java.util.*;
import java.io.*;

public class Test {

	String PerceivedWaves;
	boolean focusImprovement;
	boolean attentionImprovement;
	boolean effectOrNot;
	String Effect;
	
	static double brainRate;
	
	
	//OVERALL WAVE AFFECT MENTAL AROUSAL... JORDANOVA ALGORITHM
	public String OverallMentalArousal(Waves wav, Person p) {
		if(p.age == 12 && wav.type == "alpha") {
			return "Relaxed";
		}
		else {
			return "";
		}
	}
	
	public static void main (String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("data.in"));
		
		BinauralBeat testBeat = new BinauralBeat (in.nextDouble(), in.nextDouble(), 3.3, true);
		Waves testWave = new Waves(9.990, "SOC", testBeat);
		double pul = testBeat.pulse();
		String res = testWave.testName(testBeat);
		System.out.println(pul);
		System.out.println(res);
		
		//calculation of BrainRate -- FINISH THIS
		if(testWave.type == "alpha") {
			brainRate = Jordanova.setBrainRateAlpha();
		}
		
		System.out.println("BrainRate: " + brainRate);
		
		
		
		
		//testing randoms
		Random testRand = new Random();
		double val = testRand.nextInt(700);
		double newVal = val / 1000;
		System.out.println("Val: " + val);
		System.out.println(newVal);
		
		Person newGuy = new Person(10, 10.0, "lol");
		newGuy.diagnosis(testWave);
		
		in.close();
	}
}
