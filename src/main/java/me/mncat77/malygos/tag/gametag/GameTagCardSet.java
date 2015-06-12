package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagCardSet;

public class GameTagCardSet extends GameTag {

    public GameTagCardSet(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagCardSet.byId(value);
    }

}
