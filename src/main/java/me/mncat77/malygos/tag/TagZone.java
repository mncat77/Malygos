package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagZone {

    INVALID(0),
    PLAY(1),
    DECK(2),
    HAND(3),
    GRAVEYARD(4),
    REMOVEDFROMGAME(5),
    SETASIDE(6),
    SECRET(7);

    private static final Map<Integer, TagZone> byId = new HashMap<>();

    public static TagZone byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagZone(int id) {
        this.id = id;
    }

    static {
        for(TagZone tagCardSet : TagZone.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
