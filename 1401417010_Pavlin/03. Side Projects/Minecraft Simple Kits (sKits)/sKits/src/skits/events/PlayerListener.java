package skits.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import skits.util.Utility;

public class PlayerListener implements Listener {
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        
        Player player = event.getPlayer();
        
        event.setJoinMessage(null);
        
        player.sendMessage(ChatColor.DARK_GREEN + "Hi, " + player.getName() + "! Welcome to sKits!");
    }
    
    @EventHandler
    public void onPlayerKick(PlayerKickEvent event) {
        
        event.setLeaveMessage(null);
    }
    
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        
        event.setQuitMessage(null);
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        
        String msg = event.getDeathMessage();
        msg = ChatColor.GOLD + msg;
        
        if(event.getEntity().getKiller() instanceof Player) {
            
            event.setDeathMessage("[PVP] " + msg);
        }
        
        else {
            
            event.setDeathMessage("[PVE] " + msg);
        }
    }
    
    @EventHandler
    public void onHunger(FoodLevelChangeEvent event) {
        event.setCancelled(true);  
    }
    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        
        Player player = event.getPlayer();
        ChatColor colour = Utility.getColour(player);
        event.setFormat(colour + "%1$s" + ChatColor.WHITE + ": %2$s");
        
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        
        Player player = event.getPlayer();
        
        Location from = event.getFrom();
        Location to = event.getTo();
        
        if(Utility.isCloseToSpawn(from) && !Utility.isCloseToSpawn(to)) {
            
            player.sendMessage(ChatColor.DARK_RED + "You are now in a PvP-Zone!"); 
        } 
    }
}