public class RoomDetails implements RoomBillComponent {

	private int billId, noOfExtraPerson, noOfStayOfDays;
	private String customerName, typeOfRoom;
	private static int COUNTER = 101;

	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPerson, int noOfStayOfDays) {

		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPerson = noOfExtraPerson;
		this.noOfStayOfDays = noOfStayOfDays;
		this.billId = COUNTER++;

	}

	public int getBillId() {
		return billId;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int getNoOfStayOfDays() {
		return noOfStayOfDays;
	}
	
	public int getNoOfExtraPerson() {
		return noOfExtraPerson;
	}

	private boolean validateNoOfDays() {
		return true;
	}

	private boolean validateTypeOfRoom() {
		if (typeOfRoom.matches("Standard|Deluxe|Cottage")) {
			return true;
		}
		else
			return false;
	}

	private boolean validateNoOfExtraPerson() {
		if (noOfExtraPerson >= 1 && noOfExtraPerson < 3)
			return true;
		else
			return false;
	}
	
	@Override
	public double calculate() {

		double totalBill = 0;

		if (!validateTypeOfRoom())
			System.out.println("Please enter correct type of room (Standard|Deluxe|Cottage) !!!!!CASE SENSITIVE !!!!!");

		else if (!validateNoOfExtraPerson())
			System.out.println("The Number of extra person must in 0 to 2");

		else if (!validateNoOfDays())
			System.out.println("The number of days is incorrect");

		else {

			double baseRoomFare = 0;
			if (typeOfRoom.equals("Standard"))
				baseRoomFare = 2500;
			else if (typeOfRoom.equals("Deluxe"))
				baseRoomFare = 3500;
			else
				baseRoomFare = 5500;

			totalBill = (noOfStayOfDays * baseRoomFare) + noOfStayOfDays * (FOOD_CHARGE)
					+ (EXTRA_PERSON_CHARGE * noOfExtraPerson);

			totalBill = totalBill + (TAX * totalBill);

		}

		return totalBill;

	}

}
