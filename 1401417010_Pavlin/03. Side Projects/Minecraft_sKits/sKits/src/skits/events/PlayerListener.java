package skits.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

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
}
