/* 
 * Q2. Write a Java program that computes the smaller angle between the hour and minute hands 
 * of an analog clock based on a given time. Your program should include a method with the 
 * following signature to perform the calculation: 
 * public static double clockAngle(int hour, int minute) 
 * 
 */
package questions_set_1.SET_C;

import java.util.Scanner;

public class Q2 {
	public static double clockAngle(int hour, int minute) {
		
		if(hour < 0 || minute < 0 || hour > 12 || minute > 60) {
			System.out.println("Backchodi karna band kar BSDK..");
			return 0.0;
		}
		if(hour == 12) { 
			hour = 0;
		}
		if(minute == 60) {
				minute = 0;
		}
		// With reference to 12:00
		double angle_hour_hand = hour * 30;
		double angle_minute_hand = minute * 6;
		
		double angle_between  = Math.abs(angle_hour_hand - angle_minute_hand);
		
		System.out.println("Angle Between :" + angle_between + "\n" + (360 - angle_between));
		return (int)Math.min(angle_between, Math.abs(360 - angle_between));
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Hours : ");
		int hours = obj.nextInt();
		System.out.print("Minutes : ");
		int minutes = obj.nextInt();
		
		System.out.println("Smaller angle between the hour and minute : " + clockAngle(hours, minutes));
		obj.close();
	}
}
