package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagGoldRewardState;

public class GameTagGoldRewardState extends GameTag {

    public GameTagGoldRewardState(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagGoldRewardState.byId(value);
    }

}
