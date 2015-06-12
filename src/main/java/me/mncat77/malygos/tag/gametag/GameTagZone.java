package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagZone;

public class GameTagZone extends GameTag {

    public GameTagZone(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagZone.byId(value);
    }

}
