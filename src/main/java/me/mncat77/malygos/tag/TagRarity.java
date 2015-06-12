package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagRarity {

    INVALID(0),
    COMMON(1),
    FREE(2),
    RARE(3),
    EPIC(4),
    LEGENDARY(5);

    private static final Map<Integer, TagRarity> byId = new HashMap<>();

    public static TagRarity byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagRarity(int id) {
        this.id = id;
    }

    static {
        for(TagRarity tagCardSet : TagRarity.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
