import java.util.*;
import java.io.*;

public class BinauralBeat {
	//NEED TO INCORPORATE PARTIAL TONES???
	
	double frequencyRangeMin;
	double frequencyRangeMax;
	double toneFrequencyMin;
	double toneFrequencyMax;
	double diff = Math.abs(frequencyRangeMax-frequencyRangeMin);
	double amplitude;
	boolean TablaOrNot;
	double BeatsPerSecondOfRhythm;
	String TablaPitch;
	double TablaFrequencyMin;
	double TablaFrequencyMax;
	double TablaTempo;
	String typeOfWaveCreated;
	
	
	/* 
	 * 
	 * Pulse / Maxfield
	 * 
	 */
	
	//ACTUALLY WRITE THIS -- PULSE ALGORITHM
	public double pulse() {
		double rand = Math.random();
		String efficiency;
		if (rand < 0.178) {
			efficiency = "not very good";
		}
		else if(0.178 < rand && rand < 0.292) {
			efficiency = "good";
		}
		else if (0.292 < rand && rand < 0.911) {
			efficiency = "very good";
		}
		else {
			efficiency = "perfect";
		}
		
		System.out.println(efficiency);
		
		//NEED TO FIX THIS PART
		if(this.TablaOrNot == true && efficiency == "not good") {
			//BS THE 0.8 part. this is assuming that having tabla weakens the pulse a little
			return 0.2 * this.BeatsPerSecondOfRhythm;
		}
		else if(this.TablaOrNot == true && efficiency == "good") {
			//BS THE 0.8 part. this is assuming that having tabla weakens the pulse a little
			return 0.6 * this.BeatsPerSecondOfRhythm;
		}
		else if(this.TablaOrNot == true && efficiency == "very good") {
			//BS THE 0.8 part. this is assuming that having tabla weakens the pulse a little
			return 0.9 * this.BeatsPerSecondOfRhythm;
		}
		else {
			return this.diff;
		}
	}
	
	
	
	
	/*
	 * 
	 * Frequency
	 * 
	 */
	
	//Convert tabla pitch to Frequency - http://members.efn.org/~qehn/global/building/cents.htm
	public void setTablaFrequency() {
		if(this.TablaOrNot == true) {
			if(this.TablaPitch == "A") {
				this.TablaFrequencyMin = 220 - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 + Math.random() * 11.673;
			}
			if(this.TablaPitch == "A#") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 1) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 1) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "B") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 2) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 2) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "C") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 3) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 3) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "C#") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 4) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 4) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "D") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 5) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 5) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "D#") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 6) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 6) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "E") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 7) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 7) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "F") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 8) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 8) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "F#") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 9) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 9) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "G") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 10) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 10) + Math.random() * 11.673;
			}
			if(this.TablaPitch == "G#") {
				this.TablaFrequencyMin = 220 * Math.pow(1.059460646, 11) - Math.random() * 11.673;
				this.TablaFrequencyMax = 220 * Math.pow(1.059460646, 11) + Math.random() * 11.673;
			}
		}
		else {}
	}
	
	//HOW DOES FREQUENCY OF TABLA EFFECT OVERALL FREQUENCY?
	public void FrequencyChange() {
		if(this.TablaOrNot == true) {
			frequencyRangeMin = TablaFrequencyMin;
			frequencyRangeMax = TablaFrequencyMax;
		}
		else {
			frequencyRangeMin = toneFrequencyMin;
			frequencyRangeMax = toneFrequencyMax;
		}
	}
	
	//HOW DOES TABLA AFFECT CONSISTENCY OF FREQUENCY? Can BS a coefficient?
	public double FrequencyConsistencyCoefficient() {
		double rand = Math.random();
		if(this.TablaOrNot == true && rand <0.778) {
			return 0.877;
		}
		else if(this.TablaOrNot == true && rand>=0.778) {
			return 1.122;
		}
		else
			return 1.0;
	}
	
	
	
	//SETTING THE FREQUENCY VALUES OF TABLA BASED ON PITCH. BS VALUES
	public void PitchToFrequency() {
		if (this.TablaOrNot == true) {
			if(this.TablaPitch == "C") {
				this.TablaFrequencyMax = 290.0;
				this.TablaFrequencyMin = 230.0;
			}
			if(this.TablaPitch == "A") {
				this.TablaFrequencyMax = 470.0;
				this.TablaFrequencyMin = 230.0;
			}
		}
	}
	
	
	public BinauralBeat(double freq1, double freq2, double amp, boolean tab) {
		frequencyRangeMin = freq1;
		frequencyRangeMax = freq2;
		diff = Math.abs(frequencyRangeMax - frequencyRangeMin);
		amplitude = amp;
		TablaOrNot = tab;
		
		if (tab != true) {
			double BeatsPerSecondOfRhythm = 0.0;
			String TablaPitch = "";
			double TablaFrequencyMin = 0.0;
			double TablaFrequencyMax = 0.0;
			double TablaTempo = 0.0;
		}
	}
	
	
}
