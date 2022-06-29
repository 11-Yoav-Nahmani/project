import java.util.*;


public class MainDesk {
    private TreeMap<Integer, String> rooms = new TreeMap<Integer, String>();
    public static void main(String[]a){
        Scanner n = new Scanner(System.in);
        Hotel m = new Hotel();
int commandInput,floor,room;
String visitor;

        System.out.println("hello and welcome to the hotel system!");
        System.out.println("");


commandInput = n.nextInt();
        while(commandInput != 5){

            System.out.println("");
            System.out.println("press 1 for check in a reservation");
            System.out.println("press 2 for check out of the hotel room");
            System.out.println("press 3 for  printing floor occupancy");
            System.out.println("press 4 for  printing hotel occupancy");
            System.out.println("press 5 to quit the system");
            System.out.println("");
            commandInput = n.nextInt();
            switch (commandInput){
                case 1:
                    System.out.println("type the name of the visitor: ");
                    visitor = n.next();
                    System.out.println("type the number of the room: ");
                    room = n.nextInt();
                    if(m.checkIn(room,visitor)){
                        System.out.println("the visitor has got the room! ");
                    }else{
                        System.out.println("error. the visitor did not get the room ");
                    }
                    break;
                case 2:
                    System.out.println("type the number of the room: ");
                    room = n.nextInt();
                    if(m.checkOut(room)){
                        System.out.println("the visitor has left the hotel! ");
                    }else{
                        System.out.println("error. the visitor did not left the hotel ");
                    }
                    break;
                case 3:
                    System.out.println("type the number of the floor: ");
                    floor = n.nextInt();
                    m.printFloor(floor);
                    break;
                case 4:
                    m.printHotel();
                    break;
                case 5:

                    break;
                default:
                    break;
            }
        }
    }
}
