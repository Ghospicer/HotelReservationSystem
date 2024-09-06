
public abstract class Services implements Calculable {
	
	private int CustomerID=1;
	
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	
	abstract String getServiceType();
	
	abstract double calculateService();
	
	public Services(int CustomerID) {
		this.CustomerID=CustomerID;
		
	}
	
	public double getCost() {
		return calculateService();
	}
	

}
