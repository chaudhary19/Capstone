import java.util.*;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double TotalBill = 0;
		String customerName, typeOfRoom;
		int noOfExtraPerson, noOfStayOfDays;

		System.out.println("Please enter the name of the Customer: ");
		customerName = sc.nextLine();
		System.out.println("Options available for room - Standard, Deluxe and Cottage");
		System.out.println("Please enter the type of Room");
		typeOfRoom = sc.nextLine();

		System.out.println("Please enter the number of extra person");
		noOfExtraPerson = sc.nextInt();

		System.out.println("Please enter the no of day of stay");
		noOfStayOfDays = sc.nextInt();
		
		sc.close();     // close the scanner object

		RoomDetails obj1 = new RoomDetails(customerName, typeOfRoom, noOfExtraPerson, noOfStayOfDays);

		System.out.println("BillID : " + obj1.getBillId());
		System.out.println("CustomerName : " + obj1.getCustomerName());
		System.out.println("No of days of stay : " + obj1.getNoOfStayOfDays());

		TotalBill = obj1.calculate();

		System.out.println("Total Bill : " + TotalBill);

	}

}