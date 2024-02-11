package me.aeriformity.com.portalsmc;

import co.aikar.commands.PaperCommandManager;
import lombok.Getter;
import me.aeriformity.com.commands.SetDestinationCMD;
import me.aeriformity.com.commands.SetPortalCMD;
import me.aeriformity.com.events.OnMove;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.logging.Level;

@Getter
public final class PortalsMC extends JavaPlugin {

    @Getter
    private static PortalsMC instance;

    private final HashMap<Block, Block> portals = new HashMap<>();
    private final HashMap<Player, Block> creatingPortal = new HashMap<>();


    @Override
    public void onEnable() {
        getLogger().log(Level.INFO, "PortalsMC is initialising...");

        instance = this;

        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    private void registerCommands() {
        PaperCommandManager manager = new PaperCommandManager(this);

        manager.registerCommand(new SetPortalCMD());
        manager.registerCommand(new SetDestinationCMD());
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new OnMove(), this);
    }
}
