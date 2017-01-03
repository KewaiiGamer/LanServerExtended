package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandWhitelist;

public class LSECommandWhitelist extends CommandWhitelist {
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender)
    {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
