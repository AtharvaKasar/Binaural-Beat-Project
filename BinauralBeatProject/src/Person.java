import java.util.*;
import java.io.*;

public class Person {

	int age;
	double durationOfListening;
	String mentalCondition;
	double BrianRate;
	
	//How do different type of waves affect people
	
	public void diagnosis (Waves wave) {
		if(this.age < 10 && wave.type == "alpha")
			System.out.println("Diagnosis: focus good and stuff");
		else
			System.out.println("No diagnosis");
	}
	

	
	//THIS WILL BE A COEFFICIENT OF LISTENING 
	public double EffectOfListening() {
		if(this.durationOfListening < 2.0) {
			double ran = Math.random();
			if(ran<0.4) {
				return this.durationOfListening *0.4;
			}
			else {
				return this.durationOfListening*0.5;
			}
		}
		else if(this.durationOfListening>2.0 && this.durationOfListening < 14.0) {
			double ran = Math.random();
			if(ran<0.2) {
				return 0.7*this.durationOfListening;
			}
			else if(ran>0.2 && ran<0.8) {
				return 0.8*this.durationOfListening;
			}
			else {
				return 0.9*this.durationOfListening;
			}
		}
		else {
			return this.durationOfListening;
		}
	}
	
	//takes into account age, duration, current condition, and brainwave and sets the new condition
	public void setCondition(Waves w) {
		
	}
	
	public Person (int a, double dur, String s) {
		age = a;
		durationOfListening = dur;
		mentalCondition = s;
	}
	
}
