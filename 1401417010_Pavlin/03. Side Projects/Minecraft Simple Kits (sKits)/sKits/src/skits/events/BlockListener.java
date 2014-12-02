package skits.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import skits.util.Utility;

public class BlockListener implements Listener {
    
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        
        if(event.getPlayer().isOp()) {
            
            return;
        }
        
        if(Utility.isCloseToSpawn(event.getBlock().getLocation(), 10)) {
            
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.DARK_RED + "You cannot break blocks!");
        }
    }
    
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        
        if(event.getPlayer().isOp()) {
            
            return;
        }
        
        if(Utility.isCloseToSpawn(event.getBlock().getLocation(), 10)) {
            
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.DARK_RED + "You cannot place blocks!");
        }
    }
}
