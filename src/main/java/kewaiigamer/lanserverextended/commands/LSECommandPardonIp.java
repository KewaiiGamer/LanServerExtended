package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonIp;
import net.minecraft.server.MinecraftServer;


public class LSECommandPardonIp extends CommandPardonIp {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender commandSender)    {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
