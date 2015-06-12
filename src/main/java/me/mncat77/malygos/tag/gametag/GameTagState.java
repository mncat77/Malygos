package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagState;

public class GameTagState extends GameTag {

    public GameTagState(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagState.byId(value);
    }

}
