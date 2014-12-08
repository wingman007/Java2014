package skits.util;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Utility {
    
    public static World world = Bukkit.getWorld("world");
    public static Location spawn = new Location(Bukkit.getWorld("world"), 0, 65, 0);
    
    public static List<String> kits = new ArrayList<>();
    
    public static void Initialize() {
        
        world.setSpawnLocation(0, 65, 0);
        
        kits.add("pve");
        kits.add("pvp");
    }
    
    public static void kitPlayer(Player player, String kit) {
        
        if(kit.equals("pve")) {
            
            player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
            player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE, 1));
            player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS, 1));
            player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_PICKAXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_SPADE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_HOE, 1));
            player.getInventory().addItem(new ItemStack(Material.BOW, 1));
            player.getInventory().addItem(new ItemStack(Material.ARROW, 64));
        } 
        
        if(kit.equals("pvp")) {
            
            player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET, 1));
            player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE, 1));
            player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS, 1));
            player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_SPADE, 1));
            player.getInventory().addItem(new ItemStack(Material.IRON_HOE, 1));
            player.getInventory().addItem(new ItemStack(Material.BOW, 1));
            player.getInventory().addItem(new ItemStack(Material.ARROW, 64));
        } 
    }
    
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