package com.nt.cmnyCode;

import java.time.LocalDate;
import java.time.Month;

public class Wheels_Structure {
public static int tubeless_tyres=300;
public static int tyre;
public static int steel_frame=500;
public static int four_gears=800;
public static int main()
{
	LocalDate currentDate=LocalDate.now(); // its using java8 features
	int current_month=currentDate.getMonthValue();
	int current_year=currentDate.getYear();
	
	// Here i have mentioned current year
	if((current_year-4)==2016)
	{
		// from >=1 JAN to NOV <=11 
		if(current_month >=1 && current_month<=11)
		{
			tyre=200;
			System.out.println(tyre);
			//return tyre;
		}
		}
	else if((current_year-4)>=2016)
	{
		Wheels_Structure.tyre=230;
		System.out.println(tyre);
		//return tyre;
	}
	return tyre;
}

}
