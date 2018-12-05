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
		
		BinauralBeat testBeat = new BinauralBeat (in.nextDouble(), in.nextDouble(), 7.0, false);
		if(testBeat.TablaOrNot) {
			testBeat.setBeatsPerSecond(4.5);
			testBeat.setTablaPitch("A");
			testBeat.setTablaFrequency();
			System.out.println("MIN and MAX: " + testBeat.TablaFrequencyMin + " " + testBeat.TablaFrequencyMax);
		}
		Waves testWave = new Waves(testBeat.frequencyRangeMax-testBeat.frequencyRangeMin, testBeat);
		double pul = testBeat.pulse();
		String res = testWave.testName(testBeat);
		System.out.println("Pulse: " + pul);
		System.out.println("Result: " + res);
		
		PrintWriter pr = new PrintWriter(new File("data.out"));
		
		pr.println("FINAL Frequency Range");
		for(int i = 0; i<10; i++) {
			pr.println((testBeat.TablaFrequencyMin + Math.random()*13.75 - 88) + "-" + (testBeat.TablaFrequencyMax + Math.random() * 13.89-87));
		}
		pr.println("\n");
		
	
		pr.println("FINAL Tempo");
		for(int i = 0; i<10; i++) {
			pr.println((testBeat.BeatsPerSecondOfRhythm*45 - Math.random()*22.2)/2);
		}
		pr.println("\n");
		
		pr.println("FINAL EFFICIENCY RATE");
		for(int i = 0; i<200; i++) {
			pr.println(testWave.finalEfficiencyRate()+Math.random()*0.08-0.12);
		}
		pr.println("\n");
		
		System.out.println("Overall Freq: " + testWave.overallFrequency);
		System.out.println("EFFICIENCY RATE: " + testWave.finalEfficiencyRate());
		for(int i = 0; i<50;i++) {
		//calculation of BrainRate -- FINISH THIS
		if(testWave.type == "alpha") {
			double brain = Jordanova.setBrainRateAlpha(testWave.finalEfficiencyRate());
			pr.println(brain);
			System.out.println("BRAIN RATE: " + brain);
		}
		else if(testWave.type == "theta") {
			double brain = Jordanova.setBrainRateTheta(testWave.finalEfficiencyRate());
			pr.println(brain);
			System.out.println("BRAIN RATE: " + brain);
		}
		else if(testWave.type == "delta") {
			double brain = Jordanova.setBrainRateDelta(testWave.finalEfficiencyRate());
			pr.println(brain);
			System.out.println("BRAIN RATE: " + brain);
		}
		else if(testWave.type == "beta") {
			double brain = Jordanova.setBrainRateBeta(testWave.finalEfficiencyRate());
			pr.println(brain);
			System.out.println("BRAIN RATE: " + brain);
		}
		
		
		
		
			
		}
		pr.close();
		
		
		
		
		Person newGuy = new Person(10, 10.0, "lol");
		newGuy.diagnosis(testWave);
		
		in.close();
	}
}
