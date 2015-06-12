package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagMulliganState;

public class GameTagMulliganState extends GameTag {

    public GameTagMulliganState(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagMulliganState.byId(value);
    }
}
