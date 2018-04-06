package com.play;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HandyUtil {
	public static void main(String[] args){
		whatTime(0, 14, 15);
	}

	/**
	 * days, hours, minutes, seconds
	 * @param args
	 */
	static void whatTime(Integer... args) {
		final int N = args.length;

		Integer days = args[0];
		Integer hours = (N != 0) ? args[1] : 0;
		Integer minutes = (N > 2) ? args[2] : 0;
		Integer seconds = (N > 3) ? args[3] : 0;

		long time = System.currentTimeMillis();
		time += TimeUnit.DAYS.toMillis(days);
		time += TimeUnit.HOURS.toMillis(hours);
		time += TimeUnit.MINUTES.toMillis(minutes);
		time += TimeUnit.SECONDS.toMillis(seconds);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM HH:mm");
		System.out.println(dateFormat.format(new Date(time)));

	}
}
