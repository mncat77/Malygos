package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagPlayState {

    INVALID(0),
    PLAYING(1),
    WINNING(2),
    LOSING(3),
    WON(4),
    LOST(5),
    TIED(6),
    DISCONNECTED(7),
    QUIT(8);

    private static final Map<Integer, TagPlayState> byId = new HashMap<>();

    public static TagPlayState byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagPlayState(int id) {
        this.id = id;
    }

    static {
        for(TagPlayState tagCardSet : TagPlayState.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
