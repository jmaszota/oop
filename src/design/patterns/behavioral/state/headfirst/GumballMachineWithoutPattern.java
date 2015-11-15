package design.patterns.behavioral.state.headfirst;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public class GumballMachineWithoutPattern {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachineWithoutPattern(int count) {
        this.count = count;
        if(count>0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("You can't insert another quarter!");
        }else  if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("You inserted quarter");
        }else if (state == SOLD_OUT){
            System.out.println(" You can't insert a quarter, machine is sold out");
        }else if(state == SOLD){
            System.out.println("Please wait, we are already giving a gumball");
        }
    }

    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        }else  if (state == NO_QUARTER){
            System.out.println("You haven't inserted quarter");
        }else if (state == SOLD_OUT){
            System.out.println("You can't eject, you haven't inserted quarter yet");
        }else if(state == SOLD){
            System.out.println("Sorry, you already turned the crank");
        }
    }

    public void turnCrank(){
        if(state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }else  if (state == NO_QUARTER){
            System.out.println("You turned, but there are not quarters");
        }else if (state == SOLD_OUT){
            System.out.println("You turned, but there are no gumballs");
        }else if(state == SOLD){
            System.out.println("Turning twice won't get you another gumball");
        }
    }


    public void dispense(){
        if(state == SOLD){
            System.out.println("Gumball comes rolling out the slot...");
            count = count - 1;
            if(count==0){
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
        }else  if (state == NO_QUARTER){
            System.out.println("You need to pay first");
        }else if (state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        }else if(state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
