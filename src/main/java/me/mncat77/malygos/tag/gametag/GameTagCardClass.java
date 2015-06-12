package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagCardClass;

public class GameTagCardClass extends GameTag {

    public GameTagCardClass(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagCardClass.byId(value);
    }

}
