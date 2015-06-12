package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagStep {

    INVALID(0),
    BEGIN_FIRST(1),
    BEGIN_SHUFFLE(2),
    BEGIN_DRAW(3),
    BEGIN_MULLIGAN(4),
    MAIN_BEGIN(5),
    MAIN_READY(6),
    MAIN_RESOURCE(7),
    MAIN_DRAW(8),
    MAIN_START(9),
    MAIN_ACTION(10),
    MAIN_COMBAT(11),
    MAIN_END(12),
    MAIN_NEXT(13),
    FINAL_WRAPUP(14),
    FINAL_GAMEOVER(15),
    MAIN_CLEANUP(16),
    MAIN_START_TRIGGERS(17);

    private static final Map<Integer, TagStep> byId = new HashMap<>();

    public static TagStep byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagStep(int id) {
        this.id = id;
    }

    static {
        for(TagStep tagCardSet : TagStep.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}