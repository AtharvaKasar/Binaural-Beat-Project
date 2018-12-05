import java.util.*;
import java.io.*;

//class that turns the binaural beat into which BRAIN waves are produced
public class Waves {

	double overallFrequency;
	String type;
	double pulse;
	BinauralBeat beat;
	
	//Add the following to constructor
	String areaOfBrainAffected;
		
	public String testName (BinauralBeat beat) {
		if(beat.TablaOrNot != true)
		return "yuh";
		else
			return "nah";
	}
	
	/*
	 * 
	 * Amplitude
	 * 
	 */
	
	//WRITE THIS
	public boolean AmplitudeMatch() {
		if (20.0 <= this.beat.amplitude && this.beat.amplitude <= 200.0 && this.type == "alpha")
			return true;
		else if(5.0 <= this.beat.amplitude && this.beat.amplitude <= 10.0 && this.type == "beta")
			return true;
		else if(20.0 <= this.beat.amplitude && this.beat.amplitude <= 200.0 && this.type == "delta")
			return true;
		else if(this.beat.amplitude == 10.0 && this.type == "theta")
			return true;
		else
			return false;
	}
	
	public double AmplitudeCoeff() {
		double rand = Math.random();
		if(this.AmplitudeMatch() == true && rand <0.988) {
			return 0.7712;
		}
		else if(this.AmplitudeMatch() == true && rand>=0.988 && rand <0.3122) {
			return 0.8567;
		}
		else if(this.AmplitudeMatch() == true && rand>=0.3122 && rand <0.9515) {
			return 0.977;
		}
		else if(this.AmplitudeMatch() == true && rand >= 0.9515) {
			return 0.997;
		}
		else {
			return 0.6688;
		}
	}
	
	
	//MAXFIELD STUDY
	//ALSO RANDOMIZE NUMBERS W RNG
	public double MaxfieldValues() {
		//System.out.println("PULSE: " + this.beat.pulse());
		if(this.beat.pulse() > 3.0 && this.beat.pulse() < 4.0 && this.type == "theta")
			return 1.002 + (0.01* Math.random() - 0.005);
		else if(this.beat.pulse() > 4.5 && this.beat.pulse() < 5.5 && this.type == "theta")
			return 0.999 + (0.01* Math.random() - 0.005);
		else if(this.beat.pulse() > 4.0 && this.beat.pulse() < 4.5 && this.type == "theta")
			return 1.101 + (0.01* Math.random() - 0.005);
		else if(this.beat.pulse() > 4.0 && this.beat.pulse() < 4.5 && this.type == "alpha")
			return 1.222 + (0.01* Math.random() - 0.005);
		else if(this.beat.pulse() > 4.0 && this.beat.pulse() < 4.5 && this.type == "beta")
			return 0.991 + (0.01* Math.random() - 0.005);
		else
			return 0.878 + (0.4* Math.random() - 0.005);
	}

	
	public double finalEfficiencyRate() {
		double check = 0.0;
		if (this.beat.TablaOrNot && this.AmplitudeMatch()) { 
			check = 0.08 * Math.random() - 0.008;
		}
		else if(this.beat.TablaOrNot && !this.AmplitudeMatch()) {
			check = 0.03 * Math.random() - 0.008;
		}
		//System.out.println("YO RIGHT HERE: " + this.MaxfieldValues() * this.AmplitudeCoeff());
		return this.MaxfieldValues() * this.AmplitudeCoeff() + check;
	}
	
	//CONSTRUCTOR
	public Waves(double freq, BinauralBeat bb) {
		overallFrequency = freq;
		//need method for how freq defines wave
		
		//HOW OVERALL FREQUENCY AFFECTS wave type
		
			if(this.overallFrequency < 4.0) {
				this.type = "delta";
			}
			if(this.overallFrequency > 4.0 && this.overallFrequency < 8.0) {
				this.type = "theta";
			}
			if(this.overallFrequency > 8.0 && this.overallFrequency < 13.0) {
				this.type = "alpha";
			}
			if(this.overallFrequency > 13.0 && this.overallFrequency < 30.0) {
				this.type = "beta";
			}
			if(this.overallFrequency > 30.0) {
				this.type = "gamma";
			}
		
		
		pulse = bb.pulse();
		beat = bb;
		
		//Write this VVVVV
		//Based on type of wave, says what part of brain is affected the most and how much
		areaOfBrainAffected = "";
		
		if (this.type == "alpha") {
			this.areaOfBrainAffected = "occipital lobe, visual cortex";
			System.out.println(this.areaOfBrainAffected);
		}
		else if (this.type == "beta") {
			
		}
		else if (this.type == "theta") {
			
		}
		else if (this.type == "delta") {
			
		}
		else if (this.type == "gamma") {
			
		}
	}
	
	
}


