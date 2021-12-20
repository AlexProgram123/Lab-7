package com.company;


public class Home1 implements Collection {
    private String stage;
    private Room[] rooms1;


    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Room[] getRooms(){
        return rooms1;
    }

    public void setRooms(Room[] rooms1){
        this.rooms1=rooms1;
    }

    @Override
    public Iterator getIterator() {
        return new RoomsIterator();
    }

    private class RoomsIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext(){
            if(index<rooms1.length) {
                return true;
            }
            return false;
        }
        @Override
        public Room next(){
            return rooms1[index++];
        }
    }
}








