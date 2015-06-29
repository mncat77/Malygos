package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagCardRace {

    INVALID(0),
    BLOODELF(1),
    DRAENEI(2),
    DWARF(3),
    GNOME(4),
    GOBLIN(5),
    HUMAN(6),
    NIGHTELF(7),
    ORC(8),
    TAUREN(9),
    TROLL(10),
    UNDEAD(11),
    WORGEN(12),
    GOBLIN2(13),
    MURLOC(14),
    DEMON(15),
    SCOURGE(16),
    MECHANICAL(17),
    ELEMENTAL(18),
    OGRE(19),
    PET(20),
    TOTEM(21),
    NERUBIAN(22),
    PIRATE(23),
    DRAGON(24);

    private static final Map<Integer, TagCardRace> byId = new HashMap<>();

    public static TagCardRace byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagCardRace(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    static {
        for(TagCardRace tagCardSet : TagCardRace.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
