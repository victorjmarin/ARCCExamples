package arcc.examples.market;

import java.util.List;
import java.util.ArrayList;

public class Bonds2 {
	
	public static double estimateMarketValue(int maturity, double couponRate, double maturityValue, double discountRate){
				
		List<Double> presentValuePerYear = new ArrayList<>(maturity);
		double marketValue = 0.0;
		
		// Compute PV of the bond's future cash flows
		for(int i=0; i<maturity; i++){
			
			double cashFlow = couponRate * maturityValue;
			
			if(i == maturity - 1)
				cashFlow += maturityValue;			
			
			presentValuePerYear.add(cashFlow/Math.pow( 1+discountRate , i + 1 ));
		}
		
		// Compute value of the bond
		for(int i=0; i<presentValuePerYear.size(); i++){
			marketValue += presentValuePerYear.get(i);
		}		
		
		return marketValue;		
	}

}
