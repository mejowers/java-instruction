package business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import com.util.Console;

public class Reservation {
	
	public static final double NIGHTLY_RATE = 145.00;
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private DateTimeFormatter dateTimeFormat = 
			DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public Reservation() {
		super();
	}

	/**
	 * @return the arrivalDate
	 */
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the departureDate
	 */
	public LocalDate getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}


public String getArrivalDateFormatted() {
	return dateTimeFormat.format(arrivalDate);
	}
public String getDepartureDateFormatted() {
	return dateTimeFormat.format(departureDate);
	}

public int getNumberOfNights() {
	return (int)ChronoUnit.DAYS.between(arrivalDate, departureDate);
}
public String getPricePerNightFormatted() {
	return currencyFormat.format(NIGHTLY_RATE);
}
public double getTotalPrice() {
	return NIGHTLY_RATE * getNumberOfNights();
}
public String getTotalPriceFormatted() {
	return currencyFormat.format(getTotalPrice());
}
}

	
	