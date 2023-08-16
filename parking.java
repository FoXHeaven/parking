package assignment;
import java.text.SimpleDateFormat;
import java.util.*;
public class parking {
    long date= System.currentTimeMillis();
    String strDateFormat ="HH:mm:ss a";

    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

    private int selection,ticket ;
    private long timeS,total;
    private String color;
    private String enteredColor;
    private String plate_no;
    //--------------------------------------------------------------------------------------
    parking(){
        plate_no  =" ";
        color     =" ";
        ticket    = 1 ;
    }
    String getplate_no(){
        return plate_no;
    }
    int getselection() {
        return selection;
    }
    String getcolor() {
        return color;
    }
    int getticket(){
        return ticket;

    }long gettimeS(){
        return timeS;

    }long gettotal(){
        return total;

    }void setplate_no(String plate_no){
        this.plate_no = plate_no;

    }void setselection(int selection){
        this.selection =selection;

    }void setcolor(String color){
        this.color =color;

    }void settimeS(long l){
        this.date= l;

    }void settotal(long l){
        this.total =l/1000;
    }
    //--------------------------------------------------------------------------------------
    Scanner miku = new Scanner(System.in);
    ArrayList <String> car = new ArrayList<String>();
    ArrayList <String> motor = new ArrayList<String>();
    ArrayList <Integer> ticketN = new ArrayList<Integer>();
    ArrayList <Long> timeStart = new ArrayList<Long>();
    //--------------------------------------------------------------------------------------
    void display(){//列出menu
        System.out.println();
        System.out.println("============================================");
        System.out.println("NEUC Car Management And Parking System");
        System.out.println("1. Car Entry");
        System.out.println("2. Motorbike Entry");
        System.out.println("3. Car Exit");
        System.out.println("4. Motorbike Exit");
        System.out.println("5. Display Parking Status");
        System.out.println("0. Exit");
        System.out.println("============================================");

    }void selection(){//scanner输入的选择
        System.out.println();
        System.out.print("PLS Enter U Choose:");
        setselection(miku.nextInt());
        checkselection();
    }
    void displayV() {
        System.out.print("Please enter your vehicle number: ");
        setplate_no(miku.nextLine());
        if (!getplate_no().matches("[a-zA-Z0-9]+")) {
            System.out.println("Input does not meet the requirements, it should only contain letters and numbers.");
            return;
        }



        System.out.print("Please enter your vehicle color (letters only): ");
        String enteredColor = miku.next();
        if (!enteredColor.matches("^[a-zA-Z]+$")) {
            System.out.println("Invalid color input. Color should only contain English letters.");
            return;
        }
        setcolor(enteredColor);
    }

    void ticket(){//加ticket数量
        this.ticket++;

    }void parkingSlot (){
        System.out.println("----------------------------");
        System.out.println("!!The Parking Slot is full!!");
        System.out.println("----------------------------");

    }
    double fee(long parkingDuration) {
        // Assuming the base fee for the first hour is 10 units
        double baseFee = 10.0;

        // Duration in milliseconds for one hour
        long oneHourInMillis = 60 * 60 * 1000;

        // Additional fee rate for each hour after the first hour
        double additionalFeePerHour = 5.0;

        // Calculate the number of hours parked after the first hour
        double additionalHours = Math.ceil((double) (parkingDuration - oneHourInMillis) / oneHourInMillis);

        // Calculate the total fee
        double totalFee = baseFee + (additionalHours * additionalFeePerHour);

        if (totalFee < 10) {
            // Minimum fee is RM1
            return 1.0;
        }

        return totalFee;
    }

    void checkselection(){
        while(true) {
            if(getselection()>5) {
                display();
                System.out.println("Wrong option");
                System.out.print("Pls Enter u number again between(1-5):");
                setselection(miku.nextInt());
            }
            else {break;}
        }
    }
}
