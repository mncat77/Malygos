package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagMulliganState {

    INVALID(0),
    INPUT(1),
    DEALING(2),
    WAITING(3),
    DONE(4);

    private static final Map<Integer, TagMulliganState> byId = new HashMap<>();

    public static TagMulliganState byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagMulliganState(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    static {
        for(TagMulliganState tagCardSet : TagMulliganState.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
