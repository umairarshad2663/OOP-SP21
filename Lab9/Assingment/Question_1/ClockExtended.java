package Question_1;
public class ClockExtended extends Clock {
    ClockExtended(int a, int b, int c){
        super( a, b,  c);
    }
    public void Display(){
        super.Display();
        if(hour>=1 && hour<=12){
            hour=hour%12;
            System.out.println("The current time is " +hour+":"+minute+":"+second+" " + "AM");
        }
        else if(hour>=12 && hour<=24){
            hour=hour%12;
            System.out.println("The current time is " + hour+":"+minute+":"+second+" " +"PM");
        }
    

    }
}