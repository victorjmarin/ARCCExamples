package arcc.examples.market;

import java.util.ArrayList;
import java.util.List;

public class MarketValue2 {
	
	public static double bondMarketValue(double [] futureCashFlows, double discountRate){
		
		int length = futureCashFlows.length;
		List<Double> pv = new ArrayList<>(length);
		double value = 0.0;
		
		// Compute PV of the bond's future cash flows
		int year = 0;		
		while(year < length){			
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
