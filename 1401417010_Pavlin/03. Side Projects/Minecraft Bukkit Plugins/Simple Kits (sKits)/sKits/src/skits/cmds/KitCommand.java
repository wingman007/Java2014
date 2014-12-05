package skits.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import skits.util.Utility;

public class KitCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if(!(sender instanceof Player)) {
            return false;
        }
        
        final Player player = (Player)sender;
        
        if(args.length > 0) {

            if(Utility.kits.contains(args[0].toLowerCase())) {

                Utility.kitPlayer(player, args[0]);

                player.sendMessage(ChatColor.DARK_GREEN + "You have been given the '" + args[0] + "' kit!");

                return true;
            }
        }
        
        if (args.length == 0) {
            player.sendMessage(ChatColor.GRAY + "Type 'pve' or 'pvp' after /kit!");
            return false; 
        }
        
        player.sendMessage(ChatColor.GRAY + "The kit '" + args[0] + "' does not exist!");
        return false; 
    }
}