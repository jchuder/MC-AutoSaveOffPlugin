package Plugin.AutoSaveoff;

import static org.bukkit.ChatColor.RED;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

	public Commands(Main main) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("example")) {
			sender.sendMessage(RED + "關閉世界自動儲存功能");
			return true;
		}
		return false;
	}
}
