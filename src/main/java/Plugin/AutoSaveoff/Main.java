package Plugin.AutoSaveoff;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	static boolean flag = true;

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	public void onDisable() {

	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		String player = event.getPlayer().getName();
		if (flag) {
			flag = false;
			List<String> opList = new ArrayList<String>();
			opList.add("CodingBarOP1");
			opList.add("CodingBarOP2");
			opList.add("CodingBarOP3");
			opList.add("CodingBarOP4");
			opList.add("Prophet_EM");

			for (String op : opList) {
				if (player.equals(op)) {
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "save-off");
					System.out.println("----AutoSaveoffPlugin has been executed.----");
				}
			}
		}
	}
}
