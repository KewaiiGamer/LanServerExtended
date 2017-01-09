package kewaiigamer.lanserverextended.commands;

import net.minecraft.command.CommandClearInventory;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class LSECommandClearInventory extends CommandClearInventory {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender commandSender) {
        return commandSender.canCommandSenderUseCommand(this.getRequiredPermissionLevel(), this.getCommandName());
    }
}