package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandBanIp;
import net.minecraft.server.MinecraftServer;

public class LSECommandBanIp extends CommandBanIp {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}
