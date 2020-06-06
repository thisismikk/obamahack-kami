package me.zeroeightsix.kami.module.modules.hidden;

import me.zeroeightsix.kami.module.Module;

/**
 * Created by 086 on 11/10/2018.
 */
@Module.Info(name = "SafeWalk", category = Module.Category.HIDDEN, description = "Keeps you from walking off edges")
public class SafeWalk extends Module {

    private static SafeWalk INSTANCE;

    public SafeWalk() {
        INSTANCE = this;
    }

    public static boolean shouldSafewalk() {
        return INSTANCE.isEnabled();
    }

}
