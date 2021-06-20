package business;

import java.time.LocalDate;

public class Reservation {
	
	final double PRICE_PER_NIGHT = 145.00;
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private int numberOfNights;
	private double totalPrice;
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate, int numberOfNights, double totalPrice) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.numberOfNights = numberOfNights;
		this.totalPrice = totalPrice;
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

	/**
	 * @return the numberOfNights
	 */
	public int getNumberOfNights() {
		return numberOfNights;
	}

	/**
	 * @param numberOfNights the numberOfNights to set
	 */
	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the pRICE_PER_NIGHT
	 */
	public double getPRICE_PER_NIGHT() {
		return PRICE_PER_NIGHT;
	}
	

	
	
}
