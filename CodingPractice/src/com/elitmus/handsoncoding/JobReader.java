package com.elitmus.handsoncoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JobReader {
	public static void main(String[] args) {

		List<LocalDate> eventDates = new LinkedList<>(); 

		try {
			populateEventDates(eventDates);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Comparator<LocalDate> comparator = getLocalDateCompartor();
		
		Collections.sort(eventDates, comparator);
		
//		for(LocalDate date : eventDates)
//			System.out.println(date);
		
		displayResult(eventDates);
	}

	private static Comparator<LocalDate> getLocalDateCompartor() {
		return (d1,d2) -> {
			if(new Integer(d1.getYear()).equals(new Integer(d2.getYear()))) {
				if(d1.getMonth().equals(d2.getMonth()))
					return new Integer(d1.getDayOfMonth()).compareTo(new Integer(d2.getDayOfMonth()));
				return d1.getMonth().compareTo(d2.getMonth());
			}
			
			return new Integer(d1.getYear()).compareTo(new Integer(d2.getYear()));
				
		};
	}

	private static void displayResult(List<LocalDate> eventDates) {
		int currentYear = eventDates.get(0).getYear();
		int lastPrintedYear =-1;
		Month currentMonth = eventDates.get(0).getMonth();
		int monthEvents = 0;
		
		for(LocalDate date : eventDates) {
			if(currentYear != date.getYear()) {
				System.out.println("Year "+currentYear);
				lastPrintedYear = currentYear;
				currentYear = date.getYear();
			}
			if(!currentMonth.equals(date.getMonth())) {
				System.out.println(currentMonth + " " + monthEvents);
				currentMonth = date.getMonth();
				monthEvents = 0;
			}
			monthEvents ++;
		}
		if(lastPrintedYear != eventDates.get(eventDates.size() - 1).getYear())
			System.out.println("Year "+currentYear);
		System.out.println(currentMonth + " " + monthEvents);
	}

	private static void populateEventDates(List<LocalDate> eventDates) throws IOException {
		URL url = new URL("https://www.elitmus.com/jobs?experience_category=all");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String str ;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
		while((str = br.readLine()) != null) {
			String pattern = "(<i class='fa fa-calendar'></i>)(.*)(<br/><br/><i class='fa fa-map-marker'>)";
			Pattern pat = Pattern.compile(pattern);
			Matcher matcher = pat.matcher(str);
			if(matcher.find()) {
				String eventDate = matcher.group(2).trim();
				eventDates.add(LocalDate.parse(eventDate,formatter));
			}

		}

	}
} 
