package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandMessage;

public class LSECommandMessage extends CommandMessage {

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender)
    {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
