package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagFaction;

public class GameTagFaction extends GameTag {

    public GameTagFaction(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagFaction.byId(value);
    }

}
