package com.kewpanel.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandMessage;
import net.minecraft.server.MinecraftServer;

public class LSECommandMessage extends CommandMessage {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return sender.canUseCommand(this.getRequiredPermissionLevel(), this.getName());
    }
}
