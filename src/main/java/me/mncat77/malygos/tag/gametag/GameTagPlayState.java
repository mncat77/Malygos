package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagPlayState;

public class GameTagPlayState extends GameTag {

    public GameTagPlayState(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagPlayState.byId(value);
    }

}
