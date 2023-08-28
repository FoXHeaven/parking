package assignment;

public class motor extends CAR{

    void displayV(){//V=vehicle

        System.out.print("Pls Enter u Motor Number:");
        this.setplate_no(miku.nextLine());
        motor.add(getplate_no());

        System.out.print("Pls Enter U Motor Color:");
        this.setcolor(miku.nextLine());
        leftslot();}

    void displayS(){
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("The Motor Slot left " + getslot());
        System.out.println("=============MOTOR=============");
        for(int i = 0;i<motor.size();i++) {
            System.out.print(ticketN.get(i)+"["+ motor.get(i)+"]");}

    }void motorexit() {
        if (ticketN.size() == 0) {
            System.out.println("The Parking Area is Empty");
        } else {
            System.out.println("Pls Enter U Ticket Number:");
            setnumber(miku.nextInt());

            for (int i = 0; i < ticketN.size(); i++) {
                if (getnumber() == ticketN.get(i)) {
                    long currentTime = System.currentTimeMillis();
                    long parkingDuration = currentTime - timeStart.get(i);
                    System.out.println("The Time Enter is[" + sdf.format(timeStart.get(i)) + "]");
                    double totalFee = fee(parkingDuration);
                    settotal((long) totalFee);

                    ticketN.remove(ticketN.get(i));
                    motor.remove(motor.get(i));
                    timeStart.remove(timeStart.get(i));
                    System.out.println("Thank you for coming again");
                    backslot();
                }
            }
        }

    }void displayNow(){
        System.out.println("The color of vehicle is:"+ this.getcolor());
        System.out.println("The Plate No vehicle is:"+this.getplate_no());
        System.out.println("The ticket of this vehicle is:"+this.getticket());
        System.out.println("The number of wheels vehicle is:2");
        System.out.println("--------------------------------------------");
        ticketN.add(this.getticket());
        this.ticket();
        timeStart.add(System.currentTimeMillis());
        settimeS(System.currentTimeMillis());
        System.out.println("The Time Enter is:" + sdf.format(date));
        System.out.println("--------------------------------------------");}}
