package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonIp;

public class LSECommandPardonIp extends CommandPardonIp {

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
