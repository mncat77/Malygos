package me.mncat77.malygos.tag.gametag;

public class GameTagBoolean extends GameTag {

    public GameTagBoolean(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return value == 1;
    }

}
