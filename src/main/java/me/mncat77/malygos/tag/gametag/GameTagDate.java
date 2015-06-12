package me.mncat77.malygos.tag.gametag;

public class GameTagDate extends GameTag {

    public GameTagDate(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        int delta = value - (int)(System.currentTimeMillis() / 1000);
        if(delta > 0) {
            return "in " + delta + " seconds";
        }
        else if(delta < 0) {
            return -delta + " seconds ago";
        }
        else {
            return "now";
        }

    }

}
