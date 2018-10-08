package com.kewpanel.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandSaveAll;
import net.minecraft.server.MinecraftServer;

public class LSECommandSaveAll extends CommandSaveAll {
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return sender.canUseCommand(this.getRequiredPermissionLevel(), this.getName());
    }
}
