package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonPlayer;
import net.minecraft.entity.player.EntityPlayer;


public class LSECommandPardonPlayer extends CommandPardonPlayer {
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender)
    {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
