package com.kewpanel.lanserverextended.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandPardonIp;
import net.minecraft.server.MinecraftServer;

public class LSECommandPardonIp extends CommandPardonIp {

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return sender.canUseCommand(this.getRequiredPermissionLevel(), this.getName());
    }
}
