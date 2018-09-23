import java.util.Random;

public class Jordanova {
	
	public static double brainRate;
	
	
	//WRITE THIS THING
	
	
	
	//Using the Jordanova study, this takes in what wave it is and sets brain rate
	public static double setBrainRateAlpha() {
		//EEG of frontal cortex, parietal lobe, 
		
		//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
		
		//delta band
		Random randDelta = new Random();
		double DeltaVal = randDelta.nextInt(688);
		double DeltaDoub = DeltaVal / 1000;
		double rand1 = Math.random();
		double FINALDELTAVAL;
		if(rand1<0.5) {
			 FINALDELTAVAL = 7.37 + DeltaDoub;
		}
		else {
			 FINALDELTAVAL = 7.37 - DeltaDoub;
		}
		double HzDelta = 2.0/FINALDELTAVAL;
		
		
		//alpha band
		Random randAlpha = new Random();
		double AlphaVal = randAlpha.nextInt(1189);
		double AlphaDoub = AlphaVal / 1000;
		double rand2 = Math.random();
		double FINALALPHAVAL;
		if(rand2<0.5) {
			FINALALPHAVAL = 7.77 + AlphaDoub;
		}
		else {
			FINALALPHAVAL = 7.77 - AlphaDoub;
		}
		double HzAlpha = 10.0/FINALDELTAVAL;
		
		
		//theta band
		Random randTheta = new Random();
		double ThetaVal = randAlpha.nextInt(578);
		double ThetaDoub = ThetaVal / 1000;
		double rand3 = Math.random();
		double FINALTHETAVAL;
		if(rand3<0.5) {
			FINALALPHAVAL = 10.08 + ThetaDoub;
		}
		else {
			FINALALPHAVAL = 10.08 - ThetaDoub;
		}
		double HzTheta = 6.0/FINALDELTAVAL;
		
		
		//beta band
		Random randBeta = new Random();
		double BetaVal = randBeta.nextInt(578);
		double BetaDoub = BetaVal / 1000;
		double rand4 = Math.random();
		double FINALBETAVAL;
		if(rand4<0.5) {
			FINALBETAVAL = 8.44 + BetaDoub;
		}
		else {
			FINALBETAVAL = 8.44 - BetaDoub;
		}
		double HzBeta = 18.0/FINALBETAVAL;
		
		
		
		return 0.0;
	}
	
	
	
	
	//Using the Jordanova study, this uses what BrainWave it is and sets brain rate
	//KEEP THIS ONE
	//FINISH THIS
		public static double setBrainRateBeta(Waves w) {
			//EEG of different bands
			
			//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
			
			//delta band
			Random randDelta = new Random();
			double DeltaVal = randDelta.nextInt(688);
			double DeltaDoub = DeltaVal / 1000;
			double rand1 = Math.random();
			double FINALDELTAVAL;
			if(rand1<0.5) {
				 FINALDELTAVAL = 7.37 + DeltaDoub;
			}
			else {
				 FINALDELTAVAL = 7.37 - DeltaDoub;
			}
			double HzDelta = 2.0/FINALDELTAVAL;
			
			
			//alpha band
			Random randAlpha = new Random();
			double AlphaVal = randAlpha.nextInt(1189);
			double AlphaDoub = AlphaVal / 1000;
			double rand2 = Math.random();
			double FINALALPHAVAL;
			if(rand2<0.5) {
				FINALALPHAVAL = 7.77 + AlphaDoub;
			}
			else {
				FINALALPHAVAL = 7.77 - AlphaDoub;
			}
			double HzAlpha = 10.0/FINALDELTAVAL;
			
			
			//theta band
			Random randTheta = new Random();
			double ThetaVal = randAlpha.nextInt(578);
			double ThetaDoub = ThetaVal / 1000;
			double rand3 = Math.random();
			double FINALTHETAVAL;
			if(rand3<0.5) {
				FINALALPHAVAL = 10.08 + ThetaDoub;
			}
			else {
				FINALALPHAVAL = 10.08 - ThetaDoub;
			}
			double HzTheta = 6.0/FINALDELTAVAL;
			
			
			//beta band
			Random randBeta = new Random();
			double BetaVal = randBeta.nextInt(578);
			double BetaDoub = BetaVal / 1000;
			double rand4 = Math.random();
			double FINALBETAVAL;
			if(rand4<0.5) {
				FINALBETAVAL = 8.44 + BetaDoub;
			}
			else {
				FINALBETAVAL = 8.44 - BetaDoub;
			}
			double HzBeta = 18.0/FINALBETAVAL;
			
			
			
			return 0.0;
		}
		
		
		
		
		
		//Using the Jordanova study, this uses what BrainWave it is and sets brain rate
		//FINISH THIS
			public static double setBrainRateDelta(Waves w) {
				//EEG of frontal cortex, parietal lobe, 
				
				//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
				
				//delta band
				Random randDelta = new Random();
				double DeltaVal = randDelta.nextInt(688);
				double DeltaDoub = DeltaVal / 1000;
				double rand1 = Math.random();
				double FINALDELTAVAL;
				if(rand1<0.5) {
					 FINALDELTAVAL = 7.37 + DeltaDoub;
				}
				else {
					 FINALDELTAVAL = 7.37 - DeltaDoub;
				}
				double HzDelta = 2.0/FINALDELTAVAL;
				
				
				//alpha band
				Random randAlpha = new Random();
				double AlphaVal = randAlpha.nextInt(1189);
				double AlphaDoub = AlphaVal / 1000;
				double rand2 = Math.random();
				double FINALALPHAVAL;
				if(rand2<0.5) {
					FINALALPHAVAL = 7.77 + AlphaDoub;
				}
				else {
					FINALALPHAVAL = 7.77 - AlphaDoub;
				}
				double HzAlpha = 10.0/FINALDELTAVAL;
				
				
				//theta band
				Random randTheta = new Random();
				double ThetaVal = randAlpha.nextInt(578);
				double ThetaDoub = ThetaVal / 1000;
				double rand3 = Math.random();
				double FINALTHETAVAL;
				if(rand3<0.5) {
					FINALALPHAVAL = 10.08 + ThetaDoub;
				}
				else {
					FINALALPHAVAL = 10.08 - ThetaDoub;
				}
				double HzTheta = 6.0/FINALDELTAVAL;
				
				
				//beta band
				Random randBeta = new Random();
				double BetaVal = randBeta.nextInt(578);
				double BetaDoub = BetaVal / 1000;
				double rand4 = Math.random();
				double FINALBETAVAL;
				if(rand4<0.5) {
					FINALBETAVAL = 8.44 + BetaDoub;
				}
				else {
					FINALBETAVAL = 8.44 - BetaDoub;
				}
				double HzBeta = 18.0/FINALBETAVAL;
				
				return 0.0;
			}
			
			//Using the Jordanova study, this uses what BrainWave it is and sets brain rate
			//FINISH THIS
				public static double setBrainRateTheta(Waves w) {
					//EEG of frontal cortex, parietal lobe, 
					
					//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
					
					//delta band
					Random randDelta = new Random();
					double DeltaVal = randDelta.nextInt(688);
					double DeltaDoub = DeltaVal / 1000;
					double rand1 = Math.random();
					double FINALDELTAVAL;
					if(rand1<0.5) {
						 FINALDELTAVAL = 7.37 + DeltaDoub;
					}
					else {
						 FINALDELTAVAL = 7.37 - DeltaDoub;
					}
					double HzDelta = 2.0/FINALDELTAVAL;
					
					
					//alpha band
					Random randAlpha = new Random();
					double AlphaVal = randAlpha.nextInt(1189);
					double AlphaDoub = AlphaVal / 1000;
					double rand2 = Math.random();
					double FINALALPHAVAL;
					if(rand2<0.5) {
						FINALALPHAVAL = 7.77 + AlphaDoub;
					}
					else {
						FINALALPHAVAL = 7.77 - AlphaDoub;
					}
					double HzAlpha = 10.0/FINALDELTAVAL;
					
					
					//theta band
					Random randTheta = new Random();
					double ThetaVal = randAlpha.nextInt(578);
					double ThetaDoub = ThetaVal / 1000;
					double rand3 = Math.random();
					double FINALTHETAVAL;
					if(rand3<0.5) {
						FINALALPHAVAL = 10.08 + ThetaDoub;
					}
					else {
						FINALALPHAVAL = 10.08 - ThetaDoub;
					}
					double HzTheta = 6.0/FINALDELTAVAL;
					
					
					//beta band
					Random randBeta = new Random();
					double BetaVal = randBeta.nextInt(578);
					double BetaDoub = BetaVal / 1000;
					double rand4 = Math.random();
					double FINALBETAVAL;
					if(rand4<0.5) {
						FINALBETAVAL = 8.44 + BetaDoub;
					}
					else {
						FINALBETAVAL = 8.44 - BetaDoub;
					}
					double HzBeta = 18.0/FINALBETAVAL;
					
					
					return 0.0;
				}
				
			
}
