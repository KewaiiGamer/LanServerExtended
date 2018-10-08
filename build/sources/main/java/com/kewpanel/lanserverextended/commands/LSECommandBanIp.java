package com.kewpanel.lanserverextended.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.server.CommandBanIp;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class LSECommandBanIp extends CommandBanIp {

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length >= 1) {
            if (args[0].equals(sender.getName())) {
                TextComponentString textComponentString = new TextComponentString("You cannot use this command on yourself");
                textComponentString.getStyle().setColor(TextFormatting.RED);
                sender.sendMessage(textComponentString);
            } else if (args[0].equals(server.getServerOwner())) {
                TextComponentString textComponentString = new TextComponentString("You cannot use this command on the server owner");
                textComponentString.getStyle().setColor(TextFormatting.RED);
                sender.sendMessage(textComponentString);
            } else
                super.execute(server, sender, args);
        } else {
            super.execute(server, sender, args);
        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return sender.canUseCommand(this.getRequiredPermissionLevel(), this.getName());
    }
}
