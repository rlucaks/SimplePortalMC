package me.aeriformality.com.portalsmc.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import me.aeriformality.com.portalsmc.PortalsMC;
import org.bukkit.entity.Player;

public class SetDestinationCMD extends BaseCommand {
    @CommandAlias("setdistination")
    @CommandPermission("portals.setdistination")

    public void onCommand(Player player) {
        PortalsMC instance = PortalsMC.getInstance();

        if (instance.getCreatingPortal().containsKey(player)) {

            instance.getPortals().put(instance.getCreatingPortal().get(player), player.getLocation().getBlock());
            instance.getCreatingPortal().remove(player);

            player.sendMessage("Destination set!");
        } else {
            player.sendMessage("You are not creating a portal!");
        }
    }
}
