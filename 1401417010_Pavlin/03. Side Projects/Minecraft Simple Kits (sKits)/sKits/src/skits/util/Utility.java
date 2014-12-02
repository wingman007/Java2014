package skits.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Utility {
    
    public static Location spawn = new Location(Bukkit.getWorld("world"), 0, 65, 0);

    public static ChatColor getColour(Player player) {
        
        if(player.getName().equals("FEarBG")) {
            
            return ChatColor.DARK_RED;
        }
        
        if(player.isOp()) {
            return ChatColor.RED;
        }
        
        return ChatColor.GRAY;
    }
    
    public static boolean isCloseToSpawn(Location loc) {
        
        return isCloseToSpawn(loc, 5);
    }
    
    public static boolean isCloseToSpawn(Location loc, int radius) {
            
        if (loc == null) {
            return false;
        }
        
        int x = Math.abs(loc.getBlockX() - spawn.getBlockX());
        int z = Math.abs(loc.getBlockZ() - spawn.getBlockZ());
        
        return (x < radius) && (z < radius);
    }
        
        
}
