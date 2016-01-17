
package simpleinheritance;

import java.util.HashSet;

class FpsGame {
    private int fov;
    public void setFov(int fov) {
        fov=Math.min(100, fov);
        fov=Math.max(60, fov);
        this.fov=fov;
    }
    public int getFov(){
        return fov;
    }
}

class Quake extends FpsGame {
    private boolean openGL;
    public void setOpenGL(boolean openGL){
        this.openGL=openGL;
    }
    public boolean getOpenGL(){
        return openGL;
    }
}

class RaceGame {
    private int numberOfVehicles;
    RaceGame(int vehicles){
        numberOfVehicles=vehicles;
        System.out.println("Inside base class");
    }
    public int getVehicles(){
        return numberOfVehicles;
    }
    public void setVehicles(int vehicles) {
        numberOfVehicles=vehicles;
    }
}

class MotoRacer extends RaceGame{
    private int laps;
    MotoRacer(int vehicles, int laps) {
        //numberOfVehicles=vehicles; compilation error, not accesible, use protected
        super(vehicles);
        this.laps=laps;
        System.out.println("Inside derived class");
    }
    public int getLaps() {
        return laps;
    }
    
    public void setLaps(int laps) {
        this.laps=laps;
    }
    @Override
    public void setVehicles(int vehicles){
        super.setVehicles(vehicles);
        System.out.println(vehicles+" motors added.");
    }
}

public class SimpleInheritance {

    
    public static void main(String[] args) {
        Quake quake1=new Quake();
        quake1.setFov(120);
        System.out.println(quake1.getFov());
        quake1.setOpenGL(true);
        System.out.println(quake1.getOpenGL());
        
        MotoRacer motoGP = new MotoRacer(6,10);
        motoGP.setVehicles(12);
        
    }
    
}
