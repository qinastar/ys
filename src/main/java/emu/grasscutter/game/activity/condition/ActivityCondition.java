package emu.grasscutter.game.activity.condition;

import emu.grasscutter.data.excels.ActivityCondExcelConfigData;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * This annotation marks condition types for NewActivityCondExcelConfigData.json ({@link ActivityCondExcelConfigData}). To use it you should mark
 * class that extends ActivityConditionBaseHandler, and it will be automatically picked during activity manager initiation.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityCondition {
    ActivityConditions value();
}
