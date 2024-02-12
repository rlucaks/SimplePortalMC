package me.aeriformity.com.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import me.aeriformity.com.PortalsMC;
import org.bukkit.entity.Player;

public class SetPortalCMD extends BaseCommand {
    @CommandAlias("setportal")
    @CommandPermission("portals.setportal")

    public void onCommand(Player player) {
        PortalsMC instance = PortalsMC.getInstance();

        instance.getCreatingPortal().put(player, player.getLocation().getBlock());
        player.sendMessage("Portal entrance set!");
    }
}
