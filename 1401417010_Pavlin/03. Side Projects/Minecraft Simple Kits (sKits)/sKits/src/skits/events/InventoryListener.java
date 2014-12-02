package skits.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryListener implements Listener {
    
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
    
        Player player = event.getPlayer();
        Material mat = player.getItemInHand().getType();
        
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(mat == Material.MUSHROOM_SOUP) {
                
                ItemStack bowl = new ItemStack(Material.BOWL, 1);
                
                double health = player.getHealth();
                
                if(health == 20) {
                    
                    int food = player.getFoodLevel();
                    
                    if(food == 20){
                        return;
                    }
                    
                    int newFood = food + 8;
                    
                    if(newFood > 20) {
                        player.setFoodLevel(20);
                    }
                    
                    else {
                        player.setFoodLevel(newFood);
                    }
                    event.setCancelled(true);
                    player.getInventory().setItem(player.getInventory().getHeldItemSlot(), bowl);
                }
                
                else {
                    
                    double newHealth = health + 8;
                    
                    if(newHealth > 20) {
                        player.setHealth(20);  
                    }
                    
                    else {
                        player.setHealth(newHealth);
                    }
                    event.setCancelled(true);
                    player.getInventory().setItem(player.getInventory().getHeldItemSlot(), bowl);
                }
            }  
        }
    }
}
