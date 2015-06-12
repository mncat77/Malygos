package me.mncat77.malygos.tag.gametag;

import me.mncat77.malygos.tag.TagCardRace;

public class GameTagCardRace extends GameTag {

    public GameTagCardRace(int i, String n) {
        super(i, n);
    }

    @Override
    public Object getValue(int value) {
        return TagCardRace.byId(value);
    }

}
