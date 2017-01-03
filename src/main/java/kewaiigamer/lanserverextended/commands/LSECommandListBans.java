package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandListBans;
import net.minecraft.entity.player.EntityPlayer;


public class LSECommandListBans extends CommandListBans {


    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender)
    {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
