package FlyWeightPattern;

public class RailwayTicket implements Ticket {
    private String type;
    private int fare;
    private String name;
  
    public RailwayTicket(String type){
        this.type = type;
    }
  
    public void setName(String name){
        this.name = name;
    }
  
    public void setFare(int fare){
        this.fare = fare;
    }
  
    @Override
    public void printTicket(){
        System.out.println("--------TICKET--------");
        System.out.println("Name : "+ name + "\nTicket Type : "
            + type + "\nFare : " + fare);
    }
}
