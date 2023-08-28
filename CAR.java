package assignment;

public class CAR extends parking{

    //private String color , plate_no;
    private int number;
    private int slot = 10;

    void displayV(){//V=vehicle
        System.out.print("Pls Enter u Car number:");
        miku.nextLine();
        setplate_no(miku.nextLine());
        car.add(getplate_no());
        System.out.print("Pls Enter U Car color:");
        this.setcolor(miku.next());
        leftslot();

        //--------------------------------------------------------------------------------------
    }int setnumber(int number){
        return this.number = number ;
    }int getnumber(){
        return this.number;
    }
    int leftslot(){//当车进来时候，自动扣1
        return this.slot -=1;
    }int getslot(){//获取现在车数量
        return this.slot;
    }int backslot(){//车退出时，车位+1
        return this.slot +=1;
    }
    //--------------------------------------------------------------------------------------
    void displayS(){
        System.out.println("--------------------------------------------");
        System.out.println("List Of All Parked as Follow:");
        System.out.println("The Car Slot left " + getslot());
        System.out.println("==============CAR==============");
        for(int i = 0;i<car.size();i++) {
            System.out.print(ticketN.get(i)+"["+ car.get(i)+"]");}

    }void carexit(){
        if(ticketN.size() == 0) {
            System.out.println("The Parking Area is Empty");
        }else {
            System.out.println("Pls Enter U Ticket Number:");
            setnumber(miku.nextInt());
            for(int i =0;i<ticketN.size();i++) {
                if(getnumber()== ticketN.get(i)) {
                    long currentTime =System.currentTimeMillis();
                    long parkingDuration = currentTime -timeStart.get(i);
                    System.out.println("The Time Enter is[" + sdf.format(timeStart.get(i))+"]");
                    double totalFee = fee(parkingDuration);
                    settotal((long)totalFee);

                    ticketN.remove(ticketN.get(i));
                    car.remove(car.get(i));
                    timeStart.remove(timeStart.get(i));
                    System.out.println("Thank you for coming again");
                    backslot();}}}

        //--------------------------------------------------------------------------------------
    }void displayNow(){
        System.out.println();
        System.out.println("The color of vehicle is:"+ this.getcolor());
        System.out.println("The Plate No vehicle is:"+this.getplate_no());
        System.out.println("The ticket of this vehicle is:"+this.getticket());
        System.out.println("The number of wheels in this vehicle is:4");
        ticketN.add(this.getticket());
        this.ticket();
        timeStart.add(System.currentTimeMillis());
        settimeS(System.currentTimeMillis());
        System.out.println("The Time Enter is:" + sdf.format(date));
        System.out.println("--------------------------------------------");}}


