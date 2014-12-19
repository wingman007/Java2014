package skits.cmds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import skits.main.SimpleKitsMain;

public class SoupCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if(!(sender instanceof Player)) {
            return false;
        }
        
        final Player player = (Player)sender;
        
        player.sendMessage(ChatColor.DARK_GREEN + "You have been cursed!");
        
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 120, 255));
        player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 120, 255));
        player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 255));
        
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(SimpleKitsMain.inst, () -> {
            player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
            
            player.sendMessage(ChatColor.DARK_GREEN + "You have been given a soup!");
        }, 100L);
        return true;
    } 
}
