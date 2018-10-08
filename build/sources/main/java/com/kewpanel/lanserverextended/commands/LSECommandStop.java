package com.kewpanel.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandStop;
import net.minecraft.server.MinecraftServer;

public class LSECommandStop extends CommandStop {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return sender.canUseCommand(this.getRequiredPermissionLevel(), this.getName());
    }
}
