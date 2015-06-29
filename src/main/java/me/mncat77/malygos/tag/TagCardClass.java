package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagCardClass {

    INVALID(0),
    DEATHKNIGHT(1),
    DRUID(2),
    HUNTER(3),
    MAGE(4),
    PALADIN(5),
    PRIEST(6),
    ROGUE(7),
    SHAMAN(8),
    WARLOCK(9),
    WARRIOR(10),
    DREAM(11);

    private static final Map<Integer, TagCardClass> byId = new HashMap<>();

    public static TagCardClass byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagCardClass(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    static {
        for(TagCardClass tagCardSet : TagCardClass.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
