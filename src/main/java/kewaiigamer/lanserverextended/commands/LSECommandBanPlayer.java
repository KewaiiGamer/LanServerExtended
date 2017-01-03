package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandBanPlayer;
import net.minecraft.entity.player.EntityPlayer;

public class LSECommandBanPlayer extends CommandBanPlayer {

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender)
    {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }


}
