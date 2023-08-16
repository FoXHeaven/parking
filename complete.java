package assignment;

public class complete extends CAR{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CAR a = new CAR();
        motor b = new motor();

        while(true) {
            a.display();
            a.selection();
            System.out.println("selection:"+a.getselection());
            if(a.getselection()==1) {

                if(a.car.size()>(9)){
                    a.parkingSlot();
                }else{
                    a.displayV();
                    a.displayNow();}

            }else if(a.getselection()==2) {
                if(b.motor.size()>(9)) {
                    a.parkingSlot();}
                else {
                    b.displayV();
                    b.displayNow();}

            }else if(a.getselection()==3) {
                a.carexit();

            }else if(a.getselection()==4) {
                b.motorexit();

            }else if(a.getselection()==5) {
                a.displayS();
                b.displayS();
            }
            else if(a.getselection()==0) {
                System.out.println("Thank You for Using This Program");
                break;}
            }
    }
}

