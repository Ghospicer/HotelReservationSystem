
public class Reservation {

	private String hotelName;
	private String reservationMonth;
	private int reservationStart;
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getReservationMonth() {
		return reservationMonth;
	}

	public void setReservationMonth(String reservationMonth) {
		this.reservationMonth = reservationMonth;
	}

	public int getReservationStart() {
		return reservationStart;
	}

	public void setReservationStart(int reservationStart) {
		this.reservationStart = reservationStart;
	}

	public int getReservationEnd() {
		return reservationEnd;
	}

	public void setReservationEnd(int reservationEnd) {
		this.reservationEnd = reservationEnd;
	}

	public int getDailyCost() {
		return dailyCost;
	}

	public void setDailyCost(int dailyCost) {
		this.dailyCost = dailyCost;
	}

	private int reservationEnd;
	private int dailyCost;
	
	public Reservation(int dailyCost, int reservationEnd, int reservationStart, String reservationMonth, String hotelName) {
		this.hotelName = hotelName;
		this.reservationMonth = reservationMonth;
		this.reservationStart = reservationStart;
		this.reservationEnd = reservationEnd;
		this.dailyCost = dailyCost;
	}
	
	public int totalDay() {
		return reservationEnd - reservationStart;
	}
	
	public int calculateTotalPrice() {
		return totalDay() * dailyCost;
	}
	
	public String displayInfo() {
		return "Reservation for " + hotelName + " starts on "
				+ reservationMonth + " " + reservationStart + 
				" and ends on " + reservationMonth + " " +
				reservationEnd + ". Reservation has a "
				+ "total cost of $" 
				+ calculateTotalPrice()+ "."; 
	}
	


}
