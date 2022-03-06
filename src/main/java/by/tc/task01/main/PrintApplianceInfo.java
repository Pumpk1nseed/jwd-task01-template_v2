package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		if (!appliances.isEmpty()){
			for (Appliance appliance : appliances){
				System.out.println(appliance);
			}
		} else {
			System.out.println("Result isn't found!");
		}
		
	}
	
	// you may add your own code here

}
