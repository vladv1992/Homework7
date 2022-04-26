package ro.Fasttrackit.lab7;

public class Bottle {
    private String type;
    private int totalCapacity;
    private int availabalLiquid;
    private boolean open;

      Bottle (int totalCapacity, int availabalLiquid, boolean open, String type){
        this.type = type;
        this.totalCapacity = totalCapacity;
        this.availabalLiquid = availabalLiquid;
        this.open = open;

    }
    String getType(){
        return type;
    }
    int getTotalCapacity(){
        return totalCapacity;
    }

    public void open() {
        if (isOpen()) {
            System.out.println("the botlle " + getType() + " is already open");
        } else {
            this.open = true;
            System.out.println("the botlle " + getType() + " is not open");
        }
    }
     public void close(){
        if(isClose()){
            System.out.println("the botlle " + getType() +  " is already clouse");

        }else{
            this.open = false;
            System.out.println("the botlle "  + getType() + " is close");
        }

    }
    public boolean isOpen(){
        return open;
    }
    boolean isClose(){
        return !open;
    }

    boolean moreLiquid(){
          return availabalLiquid > 0;
    }
    int getAvailabalLiquid(){
          return  availabalLiquid;
    }
    int availabalLiquid(){
          return availabalLiquid = totalCapacity - availabalLiquid;

    }
    String drink(int quantity){
          if(isOpen()){
              return "you need to open the botlle in order to drink for it";
          }
          if(availabalLiquid > quantity) {
              availabalLiquid = availabalLiquid - quantity;
              return "You drank " + quantity + " you have left " + availabalLiquid + " juce";
          }else{
              return "dont have juice";
          }
    }


}
