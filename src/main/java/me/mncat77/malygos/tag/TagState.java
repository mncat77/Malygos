package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagState {

    INVALID(0),
    LOADING(1),
    RUNNING(2),
    COMPLETE(3);

    private static final Map<Integer, TagState> byId = new HashMap<>();

    public static TagState byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagState(int id) {
        this.id = id;
    }

    static {
        for(TagState tagCardSet : TagState.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
