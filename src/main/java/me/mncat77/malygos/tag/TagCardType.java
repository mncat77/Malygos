package me.mncat77.malygos.tag;

import java.util.HashMap;
import java.util.Map;

public enum TagCardType {

    INVALID(0),
    GAME(1),
    PLAYER(2),
    HERO(3),
    MINION(4),
    ABILITY(5),
    ENCHANTMENT(6),
    WEAPON(7),
    ITEM(8),
    TOKEN(9),
    HERO_POWER(10);

    private static final Map<Integer, TagCardType> byId = new HashMap<>();

    public static TagCardType byId(int id) {
        return byId.get(id);
    }

    public final int id;

    private TagCardType(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    static {
        for(TagCardType tagCardSet : TagCardType.values()) {
            byId.put(tagCardSet.id, tagCardSet);
        }
    }

}
