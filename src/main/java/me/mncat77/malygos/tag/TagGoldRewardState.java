package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagGoldRewardState {

    INVALID(0),
    ELIGIBLE(1),
    WRONG_GAME_TYPE(2),
    ALREADY_CAPPED(3),
    BAD_RATING(4),
    SHORT_GAME(5),
    OVER_CAIS(6);

    private static final Map<Integer, TagGoldRewardState> byId = new HashMap<>();

    public static TagGoldRewardState byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagGoldRewardState(int id) {
        this.id = id;
    }

    static {
        for(TagGoldRewardState tagCardSet : TagGoldRewardState.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
