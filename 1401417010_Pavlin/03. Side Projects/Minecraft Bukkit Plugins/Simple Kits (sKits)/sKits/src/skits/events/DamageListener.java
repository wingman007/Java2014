package skits.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityShootBowEvent;

import skits.util.Utility;

public class DamageListener implements Listener {
    
    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        
        if(event.getEntity() instanceof Player) {
            
            Player player = (Player)event.getEntity();
            
            if(Utility.isCloseToSpawn(player.getLocation())) {
                
                event.setCancelled(true);
                player.sendMessage(ChatColor.DARK_RED + "You cannot attack from within spawn!");
            }   
        } 
    }
    
    @EventHandler
    public void onBow(EntityShootBowEvent event) {
        
        if(event.getEntity() instanceof Player) {
            
            Player shooter = (Player)event.getEntity();
            
            if(Utility.isCloseToSpawn(shooter.getLocation())) {

                event.setCancelled(true);
                shooter.sendMessage(ChatColor.DARK_RED + "You cannot shoot from within spawn!");
            }  
        }
    }
}
