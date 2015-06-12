package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagRarity;

public class GameTagRarity extends GameTag {

    public GameTagRarity(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagRarity.byId(value);
    }

}
