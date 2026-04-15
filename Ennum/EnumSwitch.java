package Ennum;

enum Status { START, STOP, PAUSE }

public class EnumSwitch 
{
    public static void main(String[] args) 
    {
        Status s = Status.START;

        switch(s)
        {
            case START:
                System.out.println("System Started");
                break;

            case STOP:
                System.out.println("System Stopped");
                break;

            case PAUSE:
                System.out.println("System Paused");
        }
    }
}
