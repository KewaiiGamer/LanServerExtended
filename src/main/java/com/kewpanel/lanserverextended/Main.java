package com.kewpanel.lanserverextended;

import com.kewpanel.lanserverextended.commands.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, acceptableRemoteVersions="*")
public class Main {

    public static final String MODID = "lse";
    public static final String MODNAME = "LanServerExtended";
    public static final String VERSION = "1.2.0";

    @Mod.Instance(MODID)
    public static Main Instance = new Main();

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent e) {
        e.registerServerCommand(new LSECommandOP());
        e.registerServerCommand(new LSECommandStop());
        e.registerServerCommand(new LSECommandSaveAll());
        e.registerServerCommand(new LSECommandSaveOff());
        e.registerServerCommand(new LSECommandSaveOn());
        e.registerServerCommand(new LSECommandBanIp());
        e.registerServerCommand(new LSECommandPardonIp());
        e.registerServerCommand(new LSECommandBanPlayer());
        e.registerServerCommand(new LSECommandListBans());
        e.registerServerCommand(new LSECommandPardonPlayer());
        e.registerServerCommand(new LSECommandServerKick());
        e.registerServerCommand(new LSECommandListPlayers());
        e.registerServerCommand(new LSECommandWhitelist());
    }
}
