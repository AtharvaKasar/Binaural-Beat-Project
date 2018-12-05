import java.util.Random;

public class Jordanova {
	
	public static double brainRate;
	
	
	//WRITE THIS THING
	
	/*
	 * Delta: 2
	 * Theta: 6
	 * Alpha: 10
	 * Beta: 20-25
	 */
	
	
	//Using the Jordanova study, this takes in what wave it is and sets brain rate
	//*****TAKES THE COEFFICIENTS FROM MAXFIELD AND REDUCES VARIATION based on it*****
	public static double setBrainRateAlpha(double efficiencyRate) {
		System.out.println("Going Alpha");
		//EEG of frontal cortex, parietal lobe, 
		
		//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
		
		//delta band
		Random randDelta = new Random();
		double DeltaVal = randDelta.nextInt(688);
		double DeltaDoub = DeltaVal / 1000 / efficiencyRate;
		double rand1 = Math.random();
		double FINALDELTAVAL;
		if(rand1<0.5) {
			 FINALDELTAVAL = 7.37 + DeltaDoub;
		}
		else {
			 FINALDELTAVAL = 7.37 - DeltaDoub;
		}
		
		
		
		//alpha band
		Random randAlpha = new Random();
		double AlphaVal = randAlpha.nextInt(1189);
		double AlphaDoub = AlphaVal / 1000 / efficiencyRate;
		System.out.println("Alpha Doub " + AlphaDoub) ;
		double rand2 = Math.random();
		double FINALALPHAVAL;
		if(rand2<0.5) {
			FINALALPHAVAL = 7.77 + AlphaDoub;
		}
		else {
			FINALALPHAVAL = 7.77 - AlphaDoub;
		}
		
		
		
		//theta band
		Random randTheta = new Random();
		double ThetaVal = randTheta.nextInt(578);
		double ThetaDoub = ThetaVal / 1000 / efficiencyRate;
		double rand3 = Math.random();
		double FINALTHETAVAL;
		if(rand3<0.5) {
			FINALTHETAVAL = 10.08 + ThetaDoub;
		}
		else {
			FINALTHETAVAL = 10.08 - ThetaDoub;
		}
		
		
		
		//beta band
		Random randBeta = new Random();
		double BetaVal = randBeta.nextInt(578);
		double BetaDoub = BetaVal / 1000 / efficiencyRate;
		double rand4 = Math.random();
		double FINALBETAVAL;
		if(rand4<0.5) {
			FINALBETAVAL = 8.44 + BetaDoub;
		}
		else {
			FINALBETAVAL = 8.44 - BetaDoub;
		}
		
		
		
		double VFinal = FINALBETAVAL + FINALDELTAVAL + FINALALPHAVAL + FINALTHETAVAL;
		
		double HzDelta = 2.0*FINALDELTAVAL/VFinal;
		//System.out.println("HzDelta: " + HzDelta);
		double HzAlpha = 10.0*FINALALPHAVAL/VFinal;
		//System.out.println("HzAlpha: " + HzAlpha);
		double HzTheta = 6.0*FINALTHETAVAL/VFinal;
		//System.out.println("HzTheta: " + HzTheta);
		double HzBeta = 18.0*FINALBETAVAL/VFinal;
		//System.out.println("HzBeta: " + HzBeta);
		
		return HzBeta + HzDelta + HzAlpha + HzTheta;
	}
	
	
	
	
	//Using the Jordanova study, this uses what BrainWave it is and sets brain rate
	//KEEP THIS ONE
	//FINISH THIS
		public static double setBrainRateBeta(double efficiencyRate) {
			System.out.println("Going Beta");
			//EEG of different bands
			
			//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
			
			//delta band
			Random randDelta = new Random();
			double DeltaVal = randDelta.nextInt(688);
			double DeltaDoub = DeltaVal / 1000 / efficiencyRate;
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
			double AlphaDoub = AlphaVal / 1000 / efficiencyRate;
			double rand2 = Math.random();
			double FINALALPHAVAL;
			if(rand2<0.5) {
				FINALALPHAVAL = 7.77 + AlphaDoub;
			}
			else {
				FINALALPHAVAL = 7.77 - AlphaDoub;
			}
			double HzAlpha = 10.0/FINALALPHAVAL;
			
			
			//theta band
			Random randTheta = new Random();
			double ThetaVal = randTheta.nextInt(578);
			double ThetaDoub = ThetaVal / 1000 / efficiencyRate;
			double rand3 = Math.random();
			double FINALTHETAVAL;
			if(rand3<0.5) {
				FINALTHETAVAL = 10.08 + ThetaDoub;
			}
			else {
				FINALTHETAVAL = 10.08 - ThetaDoub;
			}
			double HzTheta = 6.0/FINALTHETAVAL;
			
			
			//beta band
			Random randBeta = new Random();
			double BetaVal = randBeta.nextInt(578);
			double BetaDoub = BetaVal / 1000 / efficiencyRate;
			double rand4 = Math.random();
			double FINALBETAVAL;
			if(rand4<0.5) {
				FINALBETAVAL = 8.44 + BetaDoub;
			}
			else {
				FINALBETAVAL = 8.44 - BetaDoub;
			}
			double HzBeta = 18.0/FINALBETAVAL;
			
			
			
			return (HzAlpha + HzBeta + HzDelta + HzTheta)*4.77;
		}
		
		
		
		
		
		//Using the Jordanova study, this uses what BrainWave it is and sets brain rate
		//FINISH THIS
			public static double setBrainRateDelta(double efficiencyRate) {
				System.out.println("Going Delta");
				//EEG of frontal cortex, parietal lobe, 
				
				//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
				
				//delta band
				Random randDelta = new Random();
				double DeltaVal = randDelta.nextInt(688);
				double DeltaDoub = DeltaVal / 1000 / efficiencyRate;
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
				
				return (HzBeta + HzDelta + HzAlpha + HzTheta);
			}
			
			//Using the Jordanova study, this uses what BrainWave it is and sets brain rate
			//FINISH THIS
			public static double setBrainRateTheta(double efficiencyRate) {
				System.out.println("Going Theta");
				//EEG of frontal cortex, parietal lobe, 
				
				//FIGURE OUT HOW TYPE OF WAVE CONTRIBUTES TO THESE THINGS
				
				//delta band
				Random randDelta = new Random();
				double DeltaVal = randDelta.nextInt(688);
				double DeltaDoub = DeltaVal / 1000 / efficiencyRate;
				double rand1 = Math.random();
				double FINALDELTAVAL;
				if(rand1<0.5) {
					 FINALDELTAVAL = 4.4202 + DeltaDoub;
				}
				else {
					 FINALDELTAVAL = 4.4202 - DeltaDoub;
				}
				
				
				
				//alpha band
				Random randAlpha = new Random();
				double AlphaVal = randAlpha.nextInt(1334);
				double AlphaDoub = AlphaVal / 1000 / efficiencyRate;
				System.out.println("Alpha Doub " + AlphaDoub) ;
				double rand2 = Math.random();
				double FINALALPHAVAL;
				if(rand2<0.5) {
					FINALALPHAVAL = 4.67288 + AlphaDoub;
				}
				else {
					FINALALPHAVAL = 4.67288 - AlphaDoub;
				}
				
				
				
				//theta band
				Random randTheta = new Random();
				double ThetaVal = randTheta.nextInt(444);
				double ThetaDoub = ThetaVal / 1000 / efficiencyRate;
				double rand3 = Math.random();
				double FINALTHETAVAL;
				if(rand3<0.5) {
					FINALTHETAVAL = 7.056 + ThetaDoub;
				}
				else {
					FINALTHETAVAL = 7.056 - ThetaDoub;
				}
				
				
				
				//beta band
				Random randBeta = new Random();
				double BetaVal = randBeta.nextInt(578);
				double BetaDoub = BetaVal / 1000 / efficiencyRate;
				double rand4 = Math.random();
				double FINALBETAVAL;
				if(rand4<0.5) {
					FINALBETAVAL = 4.8952 + BetaDoub;
				}
				else {
					FINALBETAVAL = 4.8952 - BetaDoub;
				}
				
				
				
				double VFinal = FINALBETAVAL + FINALDELTAVAL + FINALALPHAVAL + FINALTHETAVAL + 14.668;
				
				double HzDelta = 2.0*FINALDELTAVAL/VFinal;
				System.out.println("HzDelta: " + HzDelta);
				double HzAlpha = 10.0*FINALALPHAVAL/VFinal;
				System.out.println("HzAlpha: " + HzAlpha);
				double HzTheta = 6.0*FINALTHETAVAL/VFinal;
				System.out.println("HzTheta: " + HzTheta);
				double HzBeta = 18.0*FINALBETAVAL/VFinal;
				System.out.println("HzBeta: " + HzBeta);
				
				return (HzBeta + HzDelta + HzAlpha + HzTheta);
			}
				
			
				
			
}
