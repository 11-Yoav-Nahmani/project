import java.util.ArrayList;
import java.util.TreeMap;

public class CityRecords {

   private String name;
   private  ArrayList<Record>cityRecord = new ArrayList<Record>();


   public CityRecords(ArrayList<Record>cityRecords,String name){
       this.cityRecord = cityRecords;
       this.name = name;
   }

public String GetNameFromId(int ID){

    for(int i = 0; i< cityRecord.size();){
        if(cityRecord.get(i).equalID(ID)){
            return cityRecord.get(i).toString();
        }
    }
    return null;
}
public void add(Record r){
boolean userExist = false;

    for(int i = 0; i< cityRecord.size();){
        if(cityRecord.get(i).equalID(r.getID())){
            userExist = true;
            cityRecord.get(i).setName(r.getName());
            cityRecord.get(i).setPhoneNumber(r.getPhoneNumber());
        }
    }
    if(!userExist){
        cityRecord.add(r);
    }
}
public void Delete(Record r){
    boolean userExist = false;

    for(int i = 0; i< cityRecord.size();){
        if(cityRecord.get(i).equalID(r.getID())){
            userExist = true;
            cityRecord.remove(i);
        }
    }
    if(!userExist){
        System.out.println("THIS PERSON DOES NOT EXIST");
    }
}
public void DeleteAll(){
    for(int i = 0; i< cityRecord.size();){
            cityRecord.remove(i);
        }
    }
    public void PrintAll(){
        for(int i = 0; i< cityRecord.size();){
            System.out.println(cityRecord.get(i).toString());
        }
    }


}
