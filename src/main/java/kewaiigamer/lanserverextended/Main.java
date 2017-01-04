package kewaiigamer.lanserverextended;

import kewaiigamer.lanserverextended.commands.*;
import net.minecraft.command.CommandServerKick;
import net.minecraft.command.server.CommandDeOp;
import net.minecraft.command.server.CommandOp;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, acceptedMinecraftVersions = "[1.10,1.11.2]")
public class Main
{
    public static final String MODID = "lse";
    public static final String MODNAME = "LanServerExtended";
    public static final String VERSION = "1.0";
    public static final String COMMON_PROXY_CLASS = "kewaiigamer.lanserverextended.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "kewaiigamer.lanserverextended.ClientProxy";

    @Mod.Instance(MODID)
    public static Main Instance = new Main();

    @SidedProxy(serverSide = COMMON_PROXY_CLASS, clientSide = CLIENT_PROXY_CLASS)
    public static CommonProxy proxy = new CommonProxy();



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        Main.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        Main.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        Main.proxy.postInit(e);

    }
    @EventHandler
    public void serverLoad(FMLServerStartingEvent e) {

        e.registerServerCommand(new CommandOp());
        e.registerServerCommand(new CommandDeOp());
        e.registerServerCommand(new CommandServerKick());
        e.registerServerCommand(new LSECommandListPlayers());
        e.registerServerCommand(new LSECommandListBans());
        e.registerServerCommand(new LSECommandBanPlayer());
        e.registerServerCommand(new LSECommandBanIp());
        e.registerServerCommand(new LSECommandPardonPlayer());
        e.registerServerCommand(new LSECommandPardonIp());
        e.registerServerCommand(new LSECommandWhitelist());
        e.registerServerCommand(new LSECommandMessage());
        e.registerServerCommand(new LSECommandBroadcast());
    }
}
