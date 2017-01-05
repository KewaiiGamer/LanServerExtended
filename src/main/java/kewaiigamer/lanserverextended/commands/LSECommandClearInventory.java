package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.CommandClearInventory;
import net.minecraft.command.ICommandSender;

public class LSECommandClearInventory extends CommandClearInventory {

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
