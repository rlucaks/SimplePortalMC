package me.aeriformality.com.portalsmc.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import me.aeriformality.com.portalsmc.PortalsMC;
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
