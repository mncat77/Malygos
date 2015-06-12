package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagStep;

public class GameTagStep extends GameTag {

    public GameTagStep(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagStep.byId(value);
    }

}
