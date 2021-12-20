package com.company;
import java.util.LinkedList;


public class Home3 implements Collection {
    private String stage;

    private LinkedList<Room> rooms3;


    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public LinkedList getRooms(){
        return rooms3;
    }

    public void setRooms(LinkedList rooms3){
        this.rooms3=rooms3;
    }


    @Override
    public Iterator getIterator() {
        return new RoomsIterator();
    }

    private class RoomsIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext(){
            if(index<rooms3.size()) {
                return true;
            }
            return false;
        }
        @Override
        public Room next(){
            return rooms3.get(index++);
        }
    }
}
