package easymounts;

import java.util.Set;

import easymounts.easymountsListener;
import easymounts.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class easymountsListener implements Listener {
	// Create a reference to the main class
	public static main plugin;

	public easymountsListener(main plugin) {
		easymountsListener.plugin = plugin;
	}
	
	// placeholder listener for later
	@EventHandler
	public void joinListen(PlayerJoinEvent event) {
		Player p = event.getPlayer();
	}
}
