import java.util.TreeMap;

public class Hotel {

    private TreeMap<Integer, String> rooms = new TreeMap<Integer, String>();



    public boolean checkIn(int roomNumber, String guestName){

        TreeMap<Integer, String> temp = rooms;
        for(int i: temp.keySet()){
            if(i == roomNumber){
                return false;
            }
        }
        if(guestName.equals("")){
            return false;
        }else{
            rooms.put(roomNumber,guestName);
            return true;
        }
    }

    public boolean checkOut(int roomNumber){

        TreeMap<Integer, String> temp = rooms;
        for(int i: temp.keySet()){
            if(i == roomNumber){
                rooms.remove(roomNumber);
                return true;
            }
        }
        return false;
    }

    private boolean isRoomOccupied(int roomNumber){
        TreeMap<Integer, String> temp = rooms;
        for(int i: temp.keySet()){
            if(i == roomNumber){
                return true;
            }
        }
        return false;
    }
    public void printFloor(int floor){
        TreeMap<Integer, String> temp = rooms;
        boolean noPeople = true;

        for(int i: temp.keySet()){
            if(floor == i/100){
                noPeople = false;
                System.out.println("room " + i + " is occupied by " + rooms.get(i));
            }
        }
        if(noPeople){
            System.out.println("in this floor there are no people");
        }
    }
    public void printHotel(){
        boolean noPeople = true;

        for(int i: rooms.keySet()){
                noPeople = false;
                System.out.println("room " + i + " is occupied by " + rooms.get(i));
        }
        if(noPeople){
            System.out.println("in this hotel there are no people at all!");
        }

    }
}
