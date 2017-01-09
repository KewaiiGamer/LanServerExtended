package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandMessage;
import net.minecraft.server.MinecraftServer;

public class LSECommandMessage extends CommandMessage {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
