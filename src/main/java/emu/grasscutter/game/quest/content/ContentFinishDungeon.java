package emu.grasscutter.game.quest.content;

import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.data.excels.QuestData.QuestCondition;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_CONTENT_FINISH_DUNGEON)
public class ContentFinishDungeon extends QuestBaseHandler {

    // params[0] dungeon ID, params[1] unknown
    @Override
    public boolean execute(GameQuest quest, QuestCondition condition, String paramStr, int... params) {
        return condition.getParam()[0] == params[0];
    }

}
