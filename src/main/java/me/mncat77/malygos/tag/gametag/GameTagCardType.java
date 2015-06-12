package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagCardType;

public class GameTagCardType extends GameTag {

    public GameTagCardType(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagCardType.byId(value);
    }

}
