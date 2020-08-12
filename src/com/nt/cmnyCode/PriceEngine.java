package com.nt.cmnyCode;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PriceEngine extends Wheels_Structure implements Runnable {
	public static int frame_Price = 200;
	public static int handleBarWithBrakes_Price = 300;
	public static int seating_Price = 400;
	public static int chain_assembly = 450;
	static int t_sum_Cycle = frame_Price + handleBarWithBrakes_Price + seating_Price + chain_assembly + steel_frame + four_gears;
	String user_name;
	String user_choice_tyre;

	PriceEngine(String user_name, String user_choice_tyre) {
  this.user_name=user_name;
  this.user_choice_tyre=user_choice_tyre;
  
	}
	public void run() {
	
		
		if (user_choice_tyre.equalsIgnoreCase("with_tyre")) {
			PriceEngine.t_sum_Cycle = t_sum_Cycle + 200;
			System.out.println("frame_Price = 200");
			System.out.println("handleBarWithBrakes_Price = 200");
			System.out.println("seating_Price = 200");
			System.out.println("chain_assembly = 200");
			System.out.println("with Tyre..." + Wheels_Structure.tyre);
			
		} else if (user_choice_tyre.equalsIgnoreCase("tyreLess")) {
			PriceEngine.t_sum_Cycle = t_sum_Cycle + 200;
			System.out.println("frame_Price = 200");
			System.out.println("handleBarWithBrakes_Price = 200");
			System.out.println("seating_Price = 200");
			System.out.println("chain_assembly = 200");
			System.out.println("with out Tyre..." + Wheels_Structure.tubeless_tyres);
			
			PriceEngine.t_sum_Cycle = t_sum_Cycle + 450;
			System.out.println("with tyreLess..." + t_sum_Cycle);
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
System.out.println(Wheels_Structure.main());
		System.out.println("Enter your Name:" );
		String u_name1=sc.next();
		String u_name=new String(u_name1);
		System.out.println("Enter the cycle with tyre or tyreless" );
		String cycle_Choice1 = sc.next();
		String cycle_Choice=new String(cycle_Choice1);
		PriceEngine[] jobs = {
				
				new PriceEngine(u_name, cycle_Choice)};

		ExecutorService service = Executors.newFixedThreadPool(1);// ThreadPools for store no of thread
		for (PriceEngine job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}
