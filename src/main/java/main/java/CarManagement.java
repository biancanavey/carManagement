import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

//        CAR MANAGEMENT
//        - The user should be able to add new cars including daily price for renting
public class CarManagement {
        public static void main (String[] args) {
            Scanner myCar = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter Registration");

            String carRegistration= myCar.nextLine();  // Read user input
            System.out.println("Registration confirmation: " + carRegistration);  // Output user input

            //PRICE
            Scanner myCarPrice = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter rental price per day");

            BigDecimal carPrice= myCarPrice.nextBigDecimal();  // Read user input
            System.out.println("Price confirmation: " + carPrice + " GBP");

            //Brand
            System.out.println("Enter Car Brand");
            System.out.println(java.util.Arrays.toString(Brand.values()));
            String a = myCarPrice.nextLine();
            System.out.println(a);
            Brand brand = Brand.valueOf(myCarPrice.nextLine());
            System.out.println(brand);
//            Brand carBrand = myCar.valueOf();  // Read user input
//            System.out.println("Brand confirmation: " + carBrand);  // Output user input



// Scanner
// myCar.add - Arraylist
//  Daily price use Bigdecimal
//  string for car registration



//        - The user should be able to remove cars if not being rented
    //.remove


//        - The user should be able to list available cars for rent
    //arraylist - availible cars - if statement - sout



//        - The user should be able to list rented cars
//  arraylist - unavailible cars - if statement - sout

}
