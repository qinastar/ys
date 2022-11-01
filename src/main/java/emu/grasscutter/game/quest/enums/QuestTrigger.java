package emu.grasscutter.game.quest.enums;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum QuestTrigger {
	QUEST_COND_NONE (0),
	QUEST_COND_STATE_EQUAL (1),
	QUEST_COND_STATE_NOT_EQUAL (2),
	QUEST_COND_PACK_HAVE_ITEM (3),
	QUEST_COND_AVATAR_ELEMENT_EQUAL (4), // missing, currently unused
	QUEST_COND_AVATAR_ELEMENT_NOT_EQUAL (5), // missing, only NPC groups
	QUEST_COND_AVATAR_CAN_CHANGE_ELEMENT (6), // missing, only NPC groups
	QUEST_COND_CITY_LEVEL_EQUAL_GREATER (7), // missing, currently unused
	QUEST_COND_ITEM_NUM_LESS_THAN (8),
	QUEST_COND_DAILY_TASK_START (9), // missing
	QUEST_COND_OPEN_STATE_EQUAL (10), // missing
	QUEST_COND_DAILY_TASK_OPEN (11), // missing, only NPC groups
	QUEST_COND_DAILY_TASK_REWARD_CAN_GET (12), // missing, only NPC groups/talks
	QUEST_COND_DAILY_TASK_REWARD_RECEIVED (13), // missing, only NPC groups/talks
	QUEST_COND_PLAYER_LEVEL_REWARD_CAN_GET (14), // missing, only NPC groups/talks
	QUEST_COND_EXPLORATION_REWARD_CAN_GET (15), // missing, only NPC groups/talks
	QUEST_COND_IS_WORLD_OWNER (16), // missing, only NPC groups/talks
	QUEST_COND_PLAYER_LEVEL_EQUAL_GREATER (17),
	QUEST_COND_SCENE_AREA_UNLOCKED (18), // missing, only NPC groups/talks
	QUEST_COND_ITEM_GIVING_ACTIVED (19), // missing
	QUEST_COND_ITEM_GIVING_FINISHED (20), // missing
	QUEST_COND_IS_DAYTIME (21), // missing, only NPC groups
	QUEST_COND_CURRENT_AVATAR (22), // missing
	QUEST_COND_CURRENT_AREA (23), // missing
	QUEST_COND_QUEST_VAR_EQUAL (24),
	QUEST_COND_QUEST_VAR_GREATER (25),
	QUEST_COND_QUEST_VAR_LESS (26),
	QUEST_COND_FORGE_HAVE_FINISH (27), // missing, only NPC groups
	QUEST_COND_DAILY_TASK_IN_PROGRESS (28), // missing
	QUEST_COND_DAILY_TASK_FINISHED (29), // missing, currently unused
	QUEST_COND_ACTIVITY_COND (30),
	QUEST_COND_ACTIVITY_OPEN (31),
	QUEST_COND_DAILY_TASK_VAR_GT (32), // missing
	QUEST_COND_DAILY_TASK_VAR_EQ (33), // missing
	QUEST_COND_DAILY_TASK_VAR_LT (34), // missing
	QUEST_COND_BARGAIN_ITEM_GT (35), // missing, currently unused
	QUEST_COND_BARGAIN_ITEM_EQ (36), // missing, currently unused
	QUEST_COND_BARGAIN_ITEM_LT (37), // missing, currently unused
	QUEST_COND_COMPLETE_TALK (38),
	QUEST_COND_NOT_HAVE_BLOSSOM_TALK (39), // missing, only NPC groups
	QUEST_COND_IS_CUR_BLOSSOM_TALK (40), // missing, only Blossom groups
	QUEST_COND_QUEST_NOT_RECEIVE (41), // missing
	QUEST_COND_QUEST_SERVER_COND_VALID (42), // missing, only NPC groups
	QUEST_COND_ACTIVITY_CLIENT_COND (43), // missing, only NPC and Activity groups
	QUEST_COND_QUEST_GLOBAL_VAR_EQUAL (44),
	QUEST_COND_QUEST_GLOBAL_VAR_GREATER (45),
	QUEST_COND_QUEST_GLOBAL_VAR_LESS (46),
	QUEST_COND_PERSONAL_LINE_UNLOCK (47), // missing
	QUEST_COND_CITY_REPUTATION_REQUEST (48), // missing
	QUEST_COND_MAIN_COOP_START (49), // missing
	QUEST_COND_MAIN_COOP_ENTER_SAVE_POINT (50), // missing
	QUEST_COND_CITY_REPUTATION_LEVEL (51), // missing, only NPC groups
	QUEST_COND_CITY_REPUTATION_UNLOCK (52), // missing, currently unused
	QUEST_COND_LUA_NOTIFY (53),
	QUEST_COND_CUR_CLIMATE (54),
	QUEST_COND_ACTIVITY_END (55),
	QUEST_COND_COOP_POINT_RUNNING (56), // missing, currently unused
	QUEST_COND_GADGET_TALK_STATE_EQUAL (57), // missing, only Gadget groups
	QUEST_COND_AVATAR_FETTER_GT (58), // missing, only NPC groups/talks
	QUEST_COND_AVATAR_FETTER_EQ (59), // missing, only talks
	QUEST_COND_AVATAR_FETTER_LT (60), // missing, only talks
	QUEST_COND_NEW_HOMEWORLD_MOUDLE_UNLOCK (61), // missing, only Gadget groups
	QUEST_COND_NEW_HOMEWORLD_LEVEL_REWARD (62), // missing, only Gadget groups
	QUEST_COND_NEW_HOMEWORLD_MAKE_FINISH (63), // missing, only Gadget groups
	QUEST_COND_HOMEWORLD_NPC_EVENT (64), // missing, only NPC groups
	QUEST_COND_TIME_VAR_GT_EQ (65), // missing, currently unused
	QUEST_COND_TIME_VAR_PASS_DAY (66), // missing
	QUEST_COND_HOMEWORLD_NPC_NEW_TALK (67), // missing, only NPC groups
	QUEST_COND_PLAYER_CHOOSE_MALE (68), // missing, only talks
	QUEST_COND_HISTORY_GOT_ANY_ITEM (69), // missing
	QUEST_COND_LEARNED_RECIPE (70), // missing, currently unused
	QUEST_COND_LUNARITE_REGION_UNLOCKED (71), // missing, only NPC groups
	QUEST_COND_LUNARITE_HAS_REGION_HINT_COUNT (72), // missing, only NPC groups
	QUEST_COND_LUNARITE_COLLECT_FINISH (73), // missing, only NPC groups
	QUEST_COND_LUNARITE_MARK_ALL_FINISH (74), // missing, only NPC groups
	QUEST_COND_NEW_HOMEWORLD_SHOP_ITEM (75), // missing, only Gadget groups
	QUEST_COND_SCENE_POINT_UNLOCK (76), // missing, only NPC groups
	QUEST_COND_SCENE_LEVEL_TAG_EQ (77), // missing
	QUEST_COND_UNKNOWN (9999), // missing

	QUEST_CONTENT_NONE (0),
	QUEST_CONTENT_KILL_MONSTER (1), // currently unused
	QUEST_CONTENT_COMPLETE_TALK (2),
	QUEST_CONTENT_MONSTER_DIE (3),
	QUEST_CONTENT_FINISH_PLOT (4),
	QUEST_CONTENT_OBTAIN_ITEM (5),
	QUEST_CONTENT_TRIGGER_FIRE (6),
	QUEST_CONTENT_CLEAR_GROUP_MONSTER (7), // missing, finish
	QUEST_CONTENT_NOT_FINISH_PLOT (8), // missing triggers, fail
	QUEST_CONTENT_ENTER_DUNGEON (9),
	QUEST_CONTENT_ENTER_MY_WORLD (10),
	QUEST_CONTENT_FINISH_DUNGEON (11),
	QUEST_CONTENT_DESTROY_GADGET (12),
	QUEST_CONTENT_OBTAIN_MATERIAL_WITH_SUBTYPE (13), // missing, finish
	QUEST_CONTENT_NICK_NAME (14), // missing, currently unused
	QUEST_CONTENT_WORKTOP_SELECT (15), // currently unused
	QUEST_CONTENT_SEAL_BATTLE_RESULT (16), // missing, currently unused
	QUEST_CONTENT_ENTER_ROOM (17),
	QUEST_CONTENT_GAME_TIME_TICK (18),
	QUEST_CONTENT_FAIL_DUNGEON (19),
	QUEST_CONTENT_LUA_NOTIFY (20),
	QUEST_CONTENT_TEAM_DEAD (21), // missing, fail
	QUEST_CONTENT_COMPLETE_ANY_TALK (22),
	QUEST_CONTENT_UNLOCK_TRANS_POINT (23),
	QUEST_CONTENT_ADD_QUEST_PROGRESS (24),
	QUEST_CONTENT_INTERACT_GADGET (25),
	QUEST_CONTENT_DAILY_TASK_COMP_FINISH (26), // missing, currently unused
	QUEST_CONTENT_FINISH_ITEM_GIVING (27), // missing, finish
	QUEST_CONTENT_SKILL (107),
	QUEST_CONTENT_CITY_LEVEL_UP (109), // missing, finish
	QUEST_CONTENT_PATTERN_GROUP_CLEAR_MONSTER (110), // missing, finish, for random quests
	QUEST_CONTENT_ITEM_LESS_THAN (111),
	QUEST_CONTENT_PLAYER_LEVEL_UP (112),
	QUEST_CONTENT_DUNGEON_OPEN_STATUE (113), // missing, currently unused
	QUEST_CONTENT_UNLOCK_AREA (114), // currently unused
	QUEST_CONTENT_OPEN_CHEST_WITH_GADGET_ID (115), // missing, currently unused
	QUEST_CONTENT_UNLOCK_TRANS_POINT_WITH_TYPE (116), // missing, currently unused
	QUEST_CONTENT_FINISH_DAILY_DUNGEON (117), // missing, currently unused
	QUEST_CONTENT_FINISH_WEEKLY_DUNGEON (118), // missing, currently unused
	QUEST_CONTENT_QUEST_VAR_EQUAL (119),
	QUEST_CONTENT_QUEST_VAR_GREATER (120),
	QUEST_CONTENT_QUEST_VAR_LESS (121),
	QUEST_CONTENT_OBTAIN_VARIOUS_ITEM (122), // missing, finish
	QUEST_CONTENT_FINISH_TOWER_LEVEL (123), // missing, currently unused
	QUEST_CONTENT_BARGAIN_SUCC (124), // missing, finish
	QUEST_CONTENT_BARGAIN_FAIL (125),// missing, fail
	QUEST_CONTENT_ITEM_LESS_THAN_BARGAIN (126),// missing, fail
	QUEST_CONTENT_ACTIVITY_TRIGGER_FAILED (127),// missing, fail
	QUEST_CONTENT_MAIN_COOP_ENTER_SAVE_POINT (128),// missing, finish
	QUEST_CONTENT_ANY_MANUAL_TRANSPORT (129),
	QUEST_CONTENT_USE_ITEM (130),
	QUEST_CONTENT_MAIN_COOP_ENTER_ANY_SAVE_POINT (131),// missing, finish and fail
	QUEST_CONTENT_ENTER_MY_HOME_WORLD (132),// missing, finish and fail
	QUEST_CONTENT_ENTER_MY_WORLD_SCENE (133),// missing, finish
	QUEST_CONTENT_TIME_VAR_GT_EQ (134),// missing, finish
	QUEST_CONTENT_TIME_VAR_PASS_DAY (135),// missing, finish
	QUEST_CONTENT_QUEST_STATE_EQUAL (136),
	QUEST_CONTENT_QUEST_STATE_NOT_EQUAL (137),
	QUEST_CONTENT_UNLOCKED_RECIPE (138),// missing, finish
	QUEST_CONTENT_NOT_UNLOCKED_RECIPE (139),// missing, finish
	QUEST_CONTENT_FISHING_SUCC (140),// missing, finish
	QUEST_CONTENT_ENTER_ROGUE_DUNGEON (141),// missing, finish
	QUEST_CONTENT_USE_WIDGET (142),// missing, finish, only in unreleased quest
	QUEST_CONTENT_CAPTURE_SUCC (143),// missing, currently unused
	QUEST_CONTENT_CAPTURE_USE_CAPTURETAG_LIST (144),// missing, currently unused
	QUEST_CONTENT_CAPTURE_USE_MATERIAL_LIST (145),// missing, finish
	QUEST_CONTENT_ENTER_VEHICLE (147),
	QUEST_CONTENT_SCENE_LEVEL_TAG_EQ (148),// missing, finish
	QUEST_CONTENT_LEAVE_SCENE (149),
	QUEST_CONTENT_LEAVE_SCENE_RANGE (150),// missing, fail
	QUEST_CONTENT_IRODORI_FINISH_FLOWER_COMBINATION (151),// missing, finish
	QUEST_CONTENT_IRODORI_POETRY_REACH_MIN_PROGRESS (152),// missing, finish
	QUEST_CONTENT_IRODORI_POETRY_FINISH_FILL_POETRY (153),// missing, finish

	QUEST_EXEC_NONE (0),
	QUEST_EXEC_DEL_PACK_ITEM (1),
	QUEST_EXEC_UNLOCK_POINT (2),
	QUEST_EXEC_UNLOCK_AREA (3),
	QUEST_EXEC_UNLOCK_FORCE (4), // missing, currently unused
	QUEST_EXEC_LOCK_FORCE (5), // missing, currently unused
	QUEST_EXEC_CHANGE_AVATAR_ELEMET (6), // missing
	QUEST_EXEC_REFRESH_GROUP_MONSTER (7), // missing
	QUEST_EXEC_SET_IS_FLYABLE (8), // missing, maybe gives glider
	QUEST_EXEC_SET_IS_WEATHER_LOCKED (9), // missing
	QUEST_EXEC_SET_IS_GAME_TIME_LOCKED (10), // missing
	QUEST_EXEC_SET_IS_TRANSFERABLE (11), // missing, currently unused
	QUEST_EXEC_GRANT_TRIAL_AVATAR (12), // missing
	QUEST_EXEC_OPEN_BORED (13), // missing, currently unused
	QUEST_EXEC_ROLLBACK_QUEST (14), // missing
	QUEST_EXEC_NOTIFY_GROUP_LUA (15),
	QUEST_EXEC_SET_OPEN_STATE (16), // missing
	QUEST_EXEC_LOCK_POINT (17), // missing
	QUEST_EXEC_DEL_PACK_ITEM_BATCH (18),
	QUEST_EXEC_REFRESH_GROUP_SUITE (19),
	QUEST_EXEC_REMOVE_TRIAL_AVATAR (20), // missing
	QUEST_EXEC_SET_GAME_TIME (21), // missing
	QUEST_EXEC_SET_WEATHER_GADGET (22), // missing
	QUEST_EXEC_ADD_QUEST_PROGRESS (23),
	QUEST_EXEC_NOTIFY_DAILY_TASK (24), // missing
	QUEST_EXEC_CREATE_PATTERN_GROUP (25), // missing, used for random quests
	QUEST_EXEC_REMOVE_PATTERN_GROUP (26), // missing, used for random quests
	QUEST_EXEC_REFRESH_GROUP_SUITE_RANDOM (27), // missing
	QUEST_EXEC_ACTIVE_ITEM_GIVING (28), // missing
	QUEST_EXEC_DEL_ALL_SPECIFIC_PACK_ITEM (29), // missing
	QUEST_EXEC_ROLLBACK_PARENT_QUEST (30), // missing
	QUEST_EXEC_LOCK_AVATAR_TEAM (31), // missing
	QUEST_EXEC_UNLOCK_AVATAR_TEAM (32), // missing
	QUEST_EXEC_UPDATE_PARENT_QUEST_REWARD_INDEX (33), // missing
	QUEST_EXEC_SET_DAILY_TASK_VAR (34), // missing
	QUEST_EXEC_INC_DAILY_TASK_VAR (35), // missing
	QUEST_EXEC_DEC_DAILY_TASK_VAR (36), // missing, currently unused
	QUEST_EXEC_ACTIVE_ACTIVITY_COND_STATE (37), // missing
	QUEST_EXEC_INACTIVE_ACTIVITY_COND_STATE (38), // missing
	QUEST_EXEC_ADD_CUR_AVATAR_ENERGY (39), // missing
	QUEST_EXEC_START_BARGAIN (41), // missing
	QUEST_EXEC_STOP_BARGAIN (42), // missing
	QUEST_EXEC_SET_QUEST_GLOBAL_VAR (43),
	QUEST_EXEC_INC_QUEST_GLOBAL_VAR (44),
	QUEST_EXEC_DEC_QUEST_GLOBAL_VAR (45),
	QUEST_EXEC_REGISTER_DYNAMIC_GROUP (46), // missing
	QUEST_EXEC_UNREGISTER_DYNAMIC_GROUP (47), // missing
	QUEST_EXEC_SET_QUEST_VAR (48),
	QUEST_EXEC_INC_QUEST_VAR (49),
	QUEST_EXEC_DEC_QUEST_VAR (50),
	QUEST_EXEC_RANDOM_QUEST_VAR (51), // missing
	QUEST_EXEC_ACTIVATE_SCANNING_PIC (52), // missing, currently unused
	QUEST_EXEC_RELOAD_SCENE_TAG (53), // missing
	QUEST_EXEC_REGISTER_DYNAMIC_GROUP_ONLY (54), // missing
	QUEST_EXEC_CHANGE_SKILL_DEPOT (55), // missing
	QUEST_EXEC_ADD_SCENE_TAG (56), // missing
	QUEST_EXEC_DEL_SCENE_TAG (57), // missing
	QUEST_EXEC_INIT_TIME_VAR (58), // missing
	QUEST_EXEC_CLEAR_TIME_VAR (59), // missing
	QUEST_EXEC_MODIFY_CLIMATE_AREA (60), // missing
	QUEST_EXEC_GRANT_TRIAL_AVATAR_AND_LOCK_TEAM (61), // missing
	QUEST_EXEC_CHANGE_MAP_AREA_STATE (62), // missing
	QUEST_EXEC_DEACTIVE_ITEM_GIVING (63), // missing
	QUEST_EXEC_CHANGE_SCENE_LEVEL_TAG (64), // missing
	QUEST_EXEC_UNLOCK_PLAYER_WORLD_SCENE (65), // missing
	QUEST_EXEC_LOCK_PLAYER_WORLD_SCENE (66), // missing
	QUEST_EXEC_FAIL_MAINCOOP (67), // missing
	QUEST_EXEC_MODIFY_WEATHER_AREA (68); // missing

	private final int value;

	QuestTrigger(int id) {
		this.value = id;
	}

	public int getValue() {
		return value;
	}

    private static final Int2ObjectMap<QuestTrigger> contentMap = new Int2ObjectOpenHashMap<>();
    private static final Map<String, QuestTrigger> contentStringMap = new HashMap<>();

    static {
        Stream.of(values())
            .filter(e -> e.name().startsWith("QUEST_CONTENT_"))
            .forEach(e -> {
            contentMap.put(e.getValue(), e);
            contentStringMap.put(e.name(), e);
        });
    }

    public static QuestTrigger getContentTriggerByValue(int value) {
        return contentMap.getOrDefault(value, QUEST_CONTENT_NONE);
    }

    public static QuestTrigger getContentTriggerByName(String name) {
        return contentStringMap.getOrDefault(name, QUEST_CONTENT_NONE);
    }
}
