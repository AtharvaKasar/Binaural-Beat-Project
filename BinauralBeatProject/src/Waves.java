import java.util.*;
import java.io.*;

//class that turns the binaural beat into which BRAIN waves are produced
public class Waves {

	double overallFrequency;
	String type;
	String stateOfConsciousness;
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
			return 0.5;
		}
	}
	
	
	//CAN CREATE NUMBERS / BS THIS FOR THIS WITH MAXFIELD STUDY??
	//ALSO RANDOMIZE NUMBERS W RNG
	public double MaxfieldValues() {
		if(this.beat.pulse() > 3.0 && this.beat.pulse() < 4.0 && this.type == "theta")
			//CREATE COEFF
			return 1.002;
		else if(this.beat.pulse() > 4.5 && this.beat.pulse() < 5.5 && this.type == "theta")
			//CREATE COEFF
			return 0.999;
		else if(this.beat.pulse() > 4.0 && this.beat.pulse() < 4.5 && this.type == "theta")
			//CREATE COEFF
			return 1.101;
		else if(this.beat.pulse() > 4.0 && this.beat.pulse() < 4.5 && this.type == "alpha")
			// CREATE COEFF
			return 1.222;
		else if(this.beat.pulse() > 4.0 && this.beat.pulse() < 4.5 && this.type == "beta")
			//CREATE COEFF
			return 0.991;
		else
			return 0.878;
	}

	
	//CONSTRUCTOR
	public Waves(double freq, String state, BinauralBeat bb) {
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
		
		
		stateOfConsciousness = state;
		pulse = bb.pulse();
		beat = bb;
		
		//Write this VVVVV
		//Based on type of wave, says what part of brain is affected the most and how much
		areaOfBrainAffected = "";
		
		if (this.type == "alpha") {
			this.areaOfBrainAffected = "occipital lobe, visual cortex";
			System.out.println(this.areaOfBrainAffected);
		}
		if (this.type == "beta") {
			
		}
		if (this.type == "theta") {
			
		}
		if (this.type == "delta") {
			
		}
		if (this.type == "gamma") {
			
		}
	}
	
	
}


