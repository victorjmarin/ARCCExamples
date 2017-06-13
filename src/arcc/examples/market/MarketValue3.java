package arcc.examples.market;

import java.util.ArrayList;
import java.util.List;

public class MarketValue3 {
	
	public static double bondMarketValue(double [] futureCashFlows, double discountRate){
		
		List<Double> pv = new ArrayList<>(futureCashFlows.length);
		double value = 0.0;
		
		// Compute PV of the bond's future cash flows
		int year = 0;		
		while(year < futureCashFlows.length){			
			pv.add(futureCashFlows[year]/Math.pow( 1+discountRate , year + 1 ));
			year++;
		}
		
		// Compute value of the bond
		for(int i=0; i<pv.size(); i++){
			value += pv.get(i);
		}		
		return value;
	}

}
