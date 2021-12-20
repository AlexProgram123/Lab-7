package com.company;
import java.util.ArrayList;


public class Home2 implements Collection {
    private String stage;

    private ArrayList<Room> rooms2;


    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public ArrayList<Room> getRooms(){
        return rooms2;
    }

    public void setRooms(ArrayList<Room> rooms2){
        this.rooms2=rooms2;
    }


    @Override
    public Iterator getIterator() {
        return new RoomsIterator();
    }

    private class RoomsIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext(){
            if(index<rooms2.size()) {
                return true;
            }
            return false;
        }
        @Override
        public Room next(){
            return rooms2.get(index++);
        }
    }
}
