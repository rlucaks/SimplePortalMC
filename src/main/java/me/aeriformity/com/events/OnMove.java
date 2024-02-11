package me.aeriformity.com.events;

import me.aeriformity.com.portalsmc.PortalsMC;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.HashMap;

public class OnMove implements Listener {

    @EventHandler
    public void PlayerMoveEvent(PlayerMoveEvent e) {
        HashMap<Block, Block> portals = PortalsMC.getInstance().getPortals();
        Player player = e.getPlayer();

        if (portals.containsKey(player.getLocation().getBlock())) {
            player.teleport(portals.get(player.getLocation().getBlock()).getLocation());
        }

    }

}