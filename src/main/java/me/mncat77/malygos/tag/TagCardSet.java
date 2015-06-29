package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagCardSet {

    INVALID(0),
    TEST_TEMPORARY(1),
    CORE(2),
    EXPERT1(3),
    REWARD(4),
    MISSIONS(5),
    DEMO(6),
    NONE(7),
    CHEAT(8),
    BLANK(9),
    DEBUG_SP(10),
    PROMO(11),
    FP1(12),
    PE1(13),
    BRM(14),
    PE2(15),
    CREDITS(16),
    HERO_SKINS(17);

    private static final Map<Integer, TagCardSet> byId = new HashMap<>();

    public static TagCardSet byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagCardSet(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    static {
        for(TagCardSet tagCardSet : TagCardSet.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
