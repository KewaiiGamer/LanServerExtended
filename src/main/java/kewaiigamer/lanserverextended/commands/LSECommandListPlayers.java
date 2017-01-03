package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandListPlayers;
import net.minecraft.entity.player.EntityPlayer;

public class LSECommandListPlayers extends CommandListPlayers {
    @Override
    public int getRequiredPermissionLevel() {
        return 4;
    }
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender playerSender) {
        return playerSender instanceof EntityPlayer;
    }
}
