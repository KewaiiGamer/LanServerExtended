package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandWhitelist;
import net.minecraft.server.MinecraftServer;

public class LSECommandWhitelist extends CommandWhitelist {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
