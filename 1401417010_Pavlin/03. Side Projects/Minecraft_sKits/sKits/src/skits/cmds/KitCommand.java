package skits.cmds;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class KitCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if(!(sender instanceof Player)) {
            return false;
        }
        
        final Player player = (Player)sender;
        
        //if(args[0].equalsIgnoreCase("pvp")) {
            
            //clearInventory(player.getInventory());
            
            player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET, 1));
            player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE, 1));
            player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS, 1));
            player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
            player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
                    
            player.sendMessage(ChatColor.DARK_GREEN + "You have been given the basic kit!");
            
            return true;   
        //}
        //return true;
    }
    
    public void clearInventory(PlayerInventory inv) {
        
        inv.clear();
        inv.setHelmet(null);
        inv.setChestplate(null);
        inv.setLeggings(null);
        inv.setBoots(null);
    } 
}

