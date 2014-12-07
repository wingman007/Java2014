package skits.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import skits.util.Utility;

public class SpawnCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if(!(sender instanceof Player)) {
            return false;
        }
        
        final Player player = (Player)sender;
        
        player.teleport(Utility.spawn);
        player.sendMessage(ChatColor.GRAY + "You have been teleported to spawn!");
        
        return true;
    } 
}
