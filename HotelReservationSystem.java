import java.util.Scanner;

public class HotelReservationSystem {

	public static void main(String[] args) {
		Reservation[] reserv = new Reservation[10];
        int id = 1;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Create new Reservation\n");
            System.out.println("2. Display all Reservations\n");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            System.out.printf("\n");

            if (choice==1) {
                System.out.println("Hotel Name: ");
                String hotelName = sc.next();
                System.out.println("Reservation Month: ");
                String reservationMonth = sc.next();
                System.out.println("Reservation Start: ");
                int reservationStart = sc.nextInt();
                System.out.println("Reservation End: ");
                int reservationEnd = sc.nextInt();
                System.out.println("Daily Cost: ");
                int dailyCost = sc.nextInt();
                reserv[id-1] = new Reservation(dailyCost, reservationEnd, reservationStart, reservationMonth, hotelName);
                System.out.printf("Reservation created!\n");
                id++;

            }
            else if (choice==2) {

                for(int i=0; i<id-1; i++) {
                    System.out.println(reserv[i].displayInfo());
                    System.out.printf("\n");
                }
            }
            
            else if (choice==0) {
                break;
            }
            else {
                System.out.println("Wrong choice!");
            }
        }

        sc.close();
		

	}

}
