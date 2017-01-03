package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandBanPlayer;
import net.minecraft.entity.player.EntityPlayer;

public class LSECommandBanPlayer extends CommandBanPlayer {

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_)
    {
        return p_71519_1_.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }


}
