package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonIp;
import net.minecraft.entity.player.EntityPlayer;


public class LSECommandPardonIp extends CommandPardonIp {
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_)
    {
        return p_71519_1_.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
