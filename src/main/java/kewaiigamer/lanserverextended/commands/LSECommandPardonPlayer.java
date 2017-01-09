package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonPlayer;
import net.minecraft.server.MinecraftServer;

public class LSECommandPardonPlayer extends CommandPardonPlayer {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
