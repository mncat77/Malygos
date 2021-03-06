package me.mncat77.malygos.tag.gametag;

import java.util.HashMap;
import java.util.Map;

public class GameTag {

    private static final Map<Integer, GameTag> byId = new HashMap<>();

    public static final GameTag IGNORE_DAMAGE = new GameTagBoolean(1, "IGNORE_DAMAGE");
    public static final GameTag MISSION_EVENT = new GameTag(6, "MISSION_EVENT");
    public static final GameTag TIMEOUT = new GameTag(7, "TIMEOUT");
    public static final GameTag TURN_START = new GameTagDate(8, "TURN_START");
    public static final GameTag TURN_TIMER_SLUSH = new GameTag(9, "TURN_TIMER_SLUSH");
    public static final GameTag PREMIUM = new GameTagBoolean(12, "PREMIUM");
    public static final GameTag GOLD_REWARD_STATE = new GameTagGoldRewardState(13, "GOLD_REWARD_STATE");
    public static final GameTag PLAYSTATE = new GameTagPlayState(17, "PLAYSTATE");
    public static final GameTag LAST_AFFECTED_BY = new GameTag(18, "LAST_AFFECTED_BY");
    public static final GameTag STEP = new GameTagStep(19, "STEP");
    public static final GameTag TURN = new GameTag(20, "TURN");
    public static final GameTag FATIGUE = new GameTag(22, "FATIGUE");
    public static final GameTag CURRENT_PLAYER = new GameTag(23, "CURRENT_PLAYER");
    public static final GameTag FIRST_PLAYER = new GameTagBoolean(24, "FIRST_PLAYER");
    public static final GameTag RESOURCES_USED = new GameTag(25, "RESOURCES_USED");
    public static final GameTag RESOURCES = new GameTag(26, "RESOURCES");
    public static final GameTag HERO_ENTITY = new GameTag(27, "HERO_ENTITY");
    public static final GameTag MAXHANDSIZE = new GameTag(28, "MAXHANDSIZE");
    public static final GameTag STARTHANDSIZE = new GameTag(29, "STARTHANDSIZE");
    public static final GameTag PLAYER_ID = new GameTag(30, "PLAYER_ID");
    public static final GameTag TEAM_ID = new GameTag(31, "TEAM_ID");
    public static final GameTag TRIGGER_VISUAL = new GameTagBoolean(32, "TRIGGER_VISUAL");
    public static final GameTag RECENTLY_ARRIVED = new GameTagBoolean(33, "RECENTLY_ARRIVED");
    public static final GameTag PROTECTING = new GameTag(34, "PROTECTING");
    public static final GameTag PROTECTED = new GameTag(35, "PROTECTED");
    public static final GameTag DEFENDING = new GameTag(36, "DEFENDING");
    public static final GameTag PROPOSED_DEFENDER = new GameTag(37, "PROPOSED_DEFENDER");
    public static final GameTag ATTACKING = new GameTag(38, "ATTACKING");
    public static final GameTag PROPOSED_ATTACKER = new GameTag(39, "PROPOSED_ATTACKER");
    public static final GameTag ATTACHED = new GameTag(40, "ATTACHED");
    public static final GameTag EXHAUSTED = new GameTagBoolean(43, "EXHAUSTED");
    public static final GameTag DAMAGE = new GameTag(44, "DAMAGE");
    public static final GameTag HEALTH = new GameTag(45, "HEALTH");
    public static final GameTag ATK = new GameTag(47, "ATK");
    public static final GameTag COST = new GameTag(48, "COST");
    public static final GameTag ZONE = new GameTagZone(49, "ZONE");
    public static final GameTag CONTROLLER = new GameTag(50, "CONTROLLER");
    public static final GameTag OWNER = new GameTag(51, "OWNER");
    public static final GameTag DEFINITION = new GameTag(52, "DEFINITION");
    public static final GameTag ENTITY_ID = new GameTag(53, "ENTITY_ID");
    public static final GameTag ELITE = new GameTagBoolean(114, "ELITE");
    public static final GameTag MAXRESOURCES = new GameTag(176, "MAXRESOURCES");
    public static final GameTag CARD_SET = new GameTagCardSet(183, "CARD_SET");
    public static final GameTag CARDTEXT_INHAND = new GameTag(184, "CARDTEXT_INHAND");
    public static final GameTag CARDNAME = new GameTag(185, "CARDNAME");
    public static final GameTag CARD_ID = new GameTag(186, "CARD_ID");
    public static final GameTag DURABILITY = new GameTag(187, "DURABILITY");
    public static final GameTag SILENCED = new GameTagBoolean(188, "SILENCED");
    public static final GameTag WINDFURY = new GameTagBoolean(189, "WINDFURY");
    public static final GameTag TAUNT = new GameTagBoolean(190, "TAUNT");
    public static final GameTag STEALTH = new GameTagBoolean(191, "STEALTH");
    public static final GameTag SPELLPOWER = new GameTag(192, "SPELLPOWER");
    public static final GameTag DIVINE_SHIELD = new GameTagBoolean(194, "DIVINE_SHIELD");
    public static final GameTag CHARGE = new GameTagBoolean(197, "CHARGE");
    public static final GameTag NEXT_STEP = new GameTagStep(198, "NEXT_STEP");
    public static final GameTag CLASS = new GameTagCardClass(199, "CLASS");
    public static final GameTag CARDRACE = new GameTagCardRace(200, "CARDRACE");
    public static final GameTag FACTION = new GameTagFaction(201, "FACTION");
    public static final GameTag CARDTYPE = new GameTagCardType(202, "CARDTYPE");
    public static final GameTag RARITY = new GameTagRarity(203, "RARITY");
    public static final GameTag STATE = new GameTagState(204, "STATE");
    public static final GameTag SUMMONED = new GameTagBoolean(205, "SUMMONED");
    public static final GameTag FREEZE = new GameTagBoolean(208, "FREEZE");
    public static final GameTag ENRAGED = new GameTagBoolean(212, "ENRAGED");
    public static final GameTag RECALL = new GameTag(215, "RECALL");
    public static final GameTag LOYALTY = new GameTag(216, "LOYALTY");
    public static final GameTag DEATHRATTLE = new GameTagBoolean(217, "DEATHRATTLE");
    public static final GameTag BATTLECRY = new GameTagBoolean(218, "BATTLECRY");
    public static final GameTag SECRET = new GameTagBoolean(219, "SECRET");
    public static final GameTag COMBO = new GameTagBoolean(220, "COMBO");
    public static final GameTag CANT_HEAL = new GameTagBoolean(221, "CANT_HEAL");
    public static final GameTag CANT_DAMAGE = new GameTagBoolean(222, "CANT_DAMAGE");
    public static final GameTag CANT_SET_ASIDE = new GameTagBoolean(223, "CANT_SET_ASIDE");
    public static final GameTag CANT_REMOVE_FROM_GAME = new GameTagBoolean(224, "CANT_REMOVE_FROM_GAME");
    public static final GameTag CANT_READY = new GameTagBoolean(225, "CANT_READY");
    public static final GameTag CANT_EXHAUST = new GameTagBoolean(226, "CANT_EXHAUST");
    public static final GameTag CANT_ATTACK = new GameTagBoolean(227, "CANT_ATTACK");
    public static final GameTag CANT_TARGET = new GameTagBoolean(228, "CANT_TARGET");
    public static final GameTag CANT_DESTROY = new GameTagBoolean(229, "CANT_DESTROY");
    public static final GameTag CANT_DISCARD = new GameTagBoolean(230, "CANT_DISCARD");
    public static final GameTag CANT_PLAY = new GameTagBoolean(231, "CANT_PLAY");
    public static final GameTag CANT_DRAW = new GameTagBoolean(232, "CANT_DRAW");
    public static final GameTag INCOMING_HEALING_MULTIPLIER = new GameTag(233, "INCOMING_HEALING_MULTIPLIER");
    public static final GameTag INCOMING_HEALING_ADJUSTMENT = new GameTag(234, "INCOMING_HEALING_ADJUSTMENT");
    public static final GameTag INCOMING_HEALING_CAP = new GameTag(235, "INCOMING_HEALING_CAP");
    public static final GameTag INCOMING_DAMAGE_MULTIPLIER = new GameTag(236, "INCOMING_DAMAGE_MULTIPLIER");
    public static final GameTag INCOMING_DAMAGE_ADJUSTMENT = new GameTag(237, "INCOMING_DAMAGE_ADJUSTMENT");
    public static final GameTag INCOMING_DAMAGE_CAP = new GameTag(238, "INCOMING_DAMAGE_CAP");
    public static final GameTag CANT_BE_HEALED = new GameTagBoolean(239, "CANT_BE_HEALED");
    public static final GameTag CANT_BE_DAMAGED = new GameTagBoolean(240, "CANT_BE_DAMAGED");
    public static final GameTag CANT_BE_SET_ASIDE = new GameTagBoolean(241, "CANT_BE_SET_ASIDE");
    public static final GameTag CANT_BE_REMOVED_FROM_GAME = new GameTagBoolean(242, "CANT_BE_REMOVED_FROM_GAME");
    public static final GameTag CANT_BE_READIED = new GameTagBoolean(243, "CANT_BE_READIED");
    public static final GameTag CANT_BE_EXHAUSTED = new GameTagBoolean(244, "CANT_BE_EXHAUSTED");
    public static final GameTag CANT_BE_ATTACKED = new GameTagBoolean(245, "CANT_BE_ATTACKED");
    public static final GameTag CANT_BE_TARGETED = new GameTagBoolean(246, "CANT_BE_TARGETED");
    public static final GameTag CANT_BE_DESTROYED = new GameTagBoolean(247, "CANT_BE_DESTROYED");
    public static final GameTag CANT_BE_SUMMONING_SICK = new GameTagBoolean(253, "CANT_BE_SUMMONING_SICK");
    public static final GameTag FROZEN = new GameTagBoolean(260, "FROZEN");
    public static final GameTag JUST_PLAYED = new GameTagBoolean(261, "JUST_PLAYED");
    public static final GameTag LINKEDCARD = new GameTag(262, "LINKEDCARD");
    public static final GameTag ZONE_POSITION = new GameTag(263, "ZONE_POSITION");
    public static final GameTag CANT_BE_FROZEN = new GameTagBoolean(264, "CANT_BE_FROZEN");
    public static final GameTag COMBO_ACTIVE = new GameTagBoolean(266, "COMBO_ACTIVE");
    public static final GameTag CARD_TARGET = new GameTag(267, "CARD_TARGET");
    public static final GameTag NUM_CARDS_PLAYED_THIS_TURN = new GameTag(269, "NUM_CARDS_PLAYED_THIS_TURN");
    public static final GameTag CANT_BE_TARGETED_BY_OPPONENTS = new GameTagBoolean(270, "CANT_BE_TARGETED_BY_OPPONENTS");
    public static final GameTag NUM_TURNS_IN_PLAY = new GameTag(271, "NUM_TURNS_IN_PLAY");
    public static final GameTag NUM_TURNS_LEFT = new GameTag(272, "NUM_TURNS_LEFT");
    public static final GameTag OUTGOING_DAMAGE_CAP = new GameTag(273, "OUTGOING_DAMAGE_CAP");
    public static final GameTag OUTGOING_DAMAGE_ADJUSTMENT = new GameTag(274, "OUTGOING_DAMAGE_ADJUSTMENT");
    public static final GameTag OUTGOING_DAMAGE_MULTIPLIER = new GameTag(275, "OUTGOING_DAMAGE_MULTIPLIER");
    public static final GameTag OUTGOING_HEALING_CAP = new GameTag(276, "OUTGOING_HEALING_CAP");
    public static final GameTag OUTGOING_HEALING_ADJUSTMENT = new GameTag(277, "OUTGOING_HEALING_ADJUSTMENT");
    public static final GameTag OUTGOING_HEALING_MULTIPLIER = new GameTag(278, "OUTGOING_HEALING_MULTIPLIER");
    public static final GameTag INCOMING_ABILITY_DAMAGE_ADJUSTMENT = new GameTag(279, "INCOMING_ABILITY_DAMAGE_ADJUSTMENT");
    public static final GameTag INCOMING_COMBAT_DAMAGE_ADJUSTMENT = new GameTag(280, "INCOMING_COMBAT_DAMAGE_ADJUSTMENT");
    public static final GameTag OUTGOING_ABILITY_DAMAGE_ADJUSTMENT = new GameTag(281, "OUTGOING_ABILITY_DAMAGE_ADJUSTMENT");
    public static final GameTag OUTGOING_COMBAT_DAMAGE_ADJUSTMENT = new GameTag(282, "OUTGOING_COMBAT_DAMAGE_ADJUSTMENT");
    public static final GameTag OUTGOING_ABILITY_DAMAGE_MULTIPLIER = new GameTag(283, "OUTGOING_ABILITY_DAMAGE_MULTIPLIER");
    public static final GameTag OUTGOING_ABILITY_DAMAGE_CAP = new GameTag(284, "OUTGOING_ABILITY_DAMAGE_CAP");
    public static final GameTag INCOMING_ABILITY_DAMAGE_MULTIPLIER = new GameTag(285, "INCOMING_ABILITY_DAMAGE_MULTIPLIER");
    public static final GameTag INCOMING_ABILITY_DAMAGE_CAP = new GameTag(286, "INCOMING_ABILITY_DAMAGE_CAP");
    public static final GameTag OUTGOING_COMBAT_DAMAGE_MULTIPLIER = new GameTag(287, "OUTGOING_COMBAT_DAMAGE_MULTIPLIER");
    public static final GameTag OUTGOING_COMBAT_DAMAGE_CAP = new GameTag(288, "OUTGOING_COMBAT_DAMAGE_CAP");
    public static final GameTag INCOMING_COMBAT_DAMAGE_MULTIPLIER = new GameTag(289, "INCOMING_COMBAT_DAMAGE_MULTIPLIER");
    public static final GameTag INCOMING_COMBAT_DAMAGE_CAP = new GameTag(290, "INCOMING_COMBAT_DAMAGE_CAP");
    public static final GameTag CURRENT_SPELLPOWER = new GameTag(291, "CURRENT_SPELLPOWER");
    public static final GameTag ARMOR = new GameTag(292, "ARMOR");
    public static final GameTag MORPH = new GameTagBoolean(293, "MORPH");
    public static final GameTag IS_MORPHED = new GameTagBoolean(294, "IS_MORPHED");
    public static final GameTag TEMP_RESOURCES = new GameTag(295, "TEMP_RESOURCES");
    public static final GameTag RECALL_OWED = new GameTagBoolean(296, "RECALL_OWED");
    public static final GameTag NUM_ATTACKS_THIS_TURN = new GameTag(297, "NUM_ATTACKS_THIS_TURN");
    public static final GameTag NEXT_ALLY_BUFF = new GameTag(302, "NEXT_ALLY_BUFF");
    public static final GameTag MAGNET = new GameTag(303, "MAGNET");
    public static final GameTag FIRST_CARD_PLAYED_THIS_TURN = new GameTagBoolean(304, "FIRST_CARD_PLAYED_THIS_TURN");
    public static final GameTag MULLIGAN_STATE = new GameTagMulliganState(305, "MULLIGAN_STATE");
    public static final GameTag TAUNT_READY = new GameTagBoolean(306, "TAUNT_READY");
    public static final GameTag STEALTH_READY = new GameTagBoolean(307, "STEALTH_READY");
    public static final GameTag CHARGE_READY = new GameTagBoolean(308, "CHARGE_READY");
    public static final GameTag CANT_BE_TARGETED_BY_ABILITIES = new GameTagBoolean(311, "CANT_BE_TARGETED_BY_ABILITIES");
    public static final GameTag SHOULDEXITCOMBAT = new GameTagBoolean(312, "SHOULDEXITCOMBAT");
    public static final GameTag CREATOR = new GameTag(313, "CREATOR");
    public static final GameTag CANT_BE_DISPELLED = new GameTagBoolean(314, "CANT_BE_DISPELLED");
    public static final GameTag PARENT_CARD = new GameTag(316, "PARENT_CARD");
    public static final GameTag NUM_MINIONS_PLAYED_THIS_TURN = new GameTag(317, "NUM_MINIONS_PLAYED_THIS_TURN");
    public static final GameTag PREDAMAGE = new GameTag(318, "PREDAMAGE");
    public static final GameTag TARGETING_ARROW_TEXT = new GameTag(325, "TARGETING_ARROW_TEXT");
    public static final GameTag ENCHANTMENT_BIRTH_VISUAL = new GameTag(330, "ENCHANTMENT_BIRTH_VISUAL");
    public static final GameTag ENCHANTMENT_IDLE_VISUAL = new GameTag(331, "ENCHANTMENT_IDLE_VISUAL");
    public static final GameTag CANT_BE_TARGETED_BY_HERO_POWERS = new GameTagBoolean(332, "CANT_BE_TARGETED_BY_HERO_POWERS");
    public static final GameTag HEALTH_MINIMUM = new GameTag(337, "HEALTH_MINIMUM");
    public static final GameTag SILENCE = new GameTagBoolean(339, "SILENCE");
    public static final GameTag COUNTER = new GameTag(340, "COUNTER");
    public static final GameTag ARTISTNAME = new GameTag(342, "ARTISTNAME");
    public static final GameTag HAND_REVEALED = new GameTagBoolean(348, "HAND_REVEALED");
    public static final GameTag ADJACENT_BUFF = new GameTag(350, "ADJACENT_BUFF");
    public static final GameTag FLAVORTEXT = new GameTag(351, "FLAVORTEXT");
    public static final GameTag FORCED_PLAY = new GameTagBoolean(352, "FORCED_PLAY");
    public static final GameTag LOW_HEALTH_THRESHOLD = new GameTag(353, "LOW_HEALTH_THRESHOLD");
    public static final GameTag IGNORE_DAMAGE_OFF = new GameTagBoolean(354, "IGNORE_DAMAGE_OFF");
    public static final GameTag SPELLPOWER_DOUBLE = new GameTag(356, "SPELLPOWER_DOUBLE");
    public static final GameTag HEALING_DOUBLE = new GameTag(357, "HEALING_DOUBLE");
    public static final GameTag NUM_OPTIONS_PLAYED_THIS_TURN = new GameTag(358, "NUM_OPTIONS_PLAYED_THIS_TURN");
    public static final GameTag NUM_OPTIONS = new GameTag(359, "NUM_OPTIONS");
    public static final GameTag TO_BE_DESTROYED = new GameTagBoolean(360, "TO_BE_DESTROYED");
    public static final GameTag AURA = new GameTag(362, "AURA");
    public static final GameTag POISONOUS = new GameTagBoolean(363, "POISONOUS");
    public static final GameTag HOW_TO_EARN = new GameTag(364, "HOW_TO_EARN");
    public static final GameTag HOW_TO_EARN_GOLDEN = new GameTag(365, "HOW_TO_EARN_GOLDEN");
    public static final GameTag TAG_HERO_POWER_DOUBLE = new GameTag(366, "TAG_HERO_POWER_DOUBLE");
    public static final GameTag TAG_AI_MUST_PLAY = new GameTagBoolean(367, "TAG_AI_MUST_PLAY");
    public static final GameTag NUM_MINIONS_PLAYER_KILLED_THIS_TURN = new GameTag(368, "NUM_MINIONS_PLAYER_KILLED_THIS_TURN");
    public static final GameTag NUM_MINIONS_KILLED_THIS_TURN = new GameTag(369, "NUM_MINIONS_KILLED_THIS_TURN");
    public static final GameTag AFFECTED_BY_SPELL_POWER = new GameTagBoolean(370, "AFFECTED_BY_SPELL_POWER");
    public static final GameTag EXTRA_DEATHRATTLES = new GameTagBoolean(371, "EXTRA_DEATHRATTLES");
    public static final GameTag START_WITH_1_HEALTH = new GameTagBoolean(372, "START_WITH_1_HEALTH");
    public static final GameTag IMMUNE_WHILE_ATTACKING = new GameTagBoolean(373, "IMMUNE_WHILE_ATTACKING");
    public static final GameTag MULTIPLY_HERO_DAMAGE = new GameTag(374, "MULTIPLY_HERO_DAMAGE");
    public static final GameTag MULTIPLY_BUFF_VALUE = new GameTag(375, "MULTIPLY_BUFF_VALUE");
    public static final GameTag CUSTOM_KEYWORD_EFFECT = new GameTag(376, "CUSTOM_KEYWORD_EFFECT");
    public static final GameTag TOPDECK = new GameTag(377, "TOPDECK");
    public static final GameTag CANT_BE_TARGETED_BY_BATTLECRIES = new GameTagBoolean(379, "CANT_BE_TARGETED_BY_BATTLECRIES");
    public static final GameTag SHOWN_HERO_POWER = new GameTag(380, "SHOWN_HERO_POWER");
    public static final GameTag DEATHRATTLE_SENDS_BACK_TO_DECK = new GameTagBoolean(382, "DEATHRATTLE_SENDS_BACK_TO_DECK");
    public static final GameTag STEADY_SHOT_CAN_TARGET = new GameTagBoolean(383, "STEADY_SHOT_CAN_TARGET");
    public static final GameTag DISPLAYED_CREATOR = new GameTag(385, "DISPLAYED_CREATOR");
    public static final GameTag POWERED_UP = new GameTagBoolean(386, "POWERED_UP");
    public static final GameTag SPARE_PART = new GameTagBoolean(388, "SPARE_PART");
    public static final GameTag FORGETFUL = new GameTagBoolean(389, "FORGETFUL");
    public static final GameTag CAN_SUMMON_MAXPLUSONE_MINION = new GameTagBoolean(390, "CAN_SUMMON_MAXPLUSONE_MINION");
    public static final GameTag OBFUSCATED = new GameTagBoolean(391, "OBFUSCATED");
    public static final GameTag BURNING = new GameTagBoolean(392, "BURNING");
    public static final GameTag OVERLOAD_LOCKED = new GameTag(393, "OVERLOAD_LOCKED");
    public static final GameTag NUM_TIMES_HERO_POWER_USED_THIS_GAME = new GameTag(394, "NUM_TIMES_HERO_POWER_USED_THIS_GAME");
    public static final GameTag CURRENT_HEROPOWER_DAMAGE_BONUS = new GameTag(395, "CURRENT_HEROPOWER_DAMAGE_BONUS");
    public static final GameTag HEROPOWER_DAMAGE = new GameTag(396, "HEROPOWER_DAMAGE");
    public static final GameTag LAST_CARD_PLAYED = new GameTag(397, "LAST_CARD_PLAYED");
    public static final GameTag NUM_FRIENDLY_MINIONS_THAT_DIED_THIS_TURN = new GameTag(398, "NUM_FRIENDLY_MINIONS_THAT_DIED_THIS_TURN");
    public static final GameTag NUM_CARDS_DRAWN_THIS_TURN = new GameTag(399, "NUM_CARDS_DRAWN_THIS_TURN");
    public static final GameTag AI_ONE_SHOT_KILL = new GameTagBoolean(400, "AI_ONE_SHOT_KILL");
    public static final GameTag EVIL_GLOW = new GameTagBoolean(401, "EVIL_GLOW");
    public static final GameTag HIDE_COST = new GameTagBoolean(402, "HIDE_COST");

    public final int id;
    private final String name;

    public GameTag(int id, String name) {
        this.id = id;
        this.name = name;

        byId.put(id, this);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue(int value) {
        return value;
    }

    public static GameTag byId(int id) {
        return byId.get(id);
    }

}
