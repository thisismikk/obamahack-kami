package me.zeroeightsix.kami.module.modules.hidden;

import me.zeroeightsix.kami.module.Module;

/**
 * @author 086
 * @see me.zeroeightsix.kami.mixin.client.MixinNetworkManager
 */
@Module.Info(name = "NoPacketKick", category = Module.Category.HIDDEN, description = "Prevent large packets from kicking you")
public class NoPacketKick {
    private static NoPacketKick INSTANCE;

    public NoPacketKick() {
        INSTANCE = this;
    }

    public static boolean isEnabled() {
        return INSTANCE.isEnabled();
    }

}
