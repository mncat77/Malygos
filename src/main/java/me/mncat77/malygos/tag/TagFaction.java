package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagFaction {

    INVALID(0),
    HORDE(1),
    ALLIANCE(2),
    NEUTRAL(3);

    private static final Map<Integer, TagFaction> byId = new HashMap<>();

    public static TagFaction byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagFaction(int id) {
        this.id = id;
    }

    static {
        for(TagFaction tagCardSet : TagFaction.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
