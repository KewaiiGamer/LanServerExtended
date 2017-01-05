package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonPlayer;

public class LSECommandPardonPlayer extends CommandPardonPlayer {

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
