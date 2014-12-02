package skits.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import skits.cmds.KitCommand;
import skits.cmds.SoupCommand;
import skits.cmds.SpawnCommand;
import skits.events.InventoryListener;
import skits.events.PlayerListener;

public class SimpleKitsMain extends JavaPlugin {
    
    public static SimpleKitsMain inst;
    
    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        
        inst = this;
        
        pm.registerEvents(new InventoryListener(), this);
        pm.registerEvents(new PlayerListener(), this);
        
        getCommand("kit").setExecutor(new KitCommand());
        getCommand("soup").setExecutor(new SoupCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        
        System.out.println("sKits edabled!");
    }
    
    @Override
    public void onDisable() {

        System.out.println("sKits disabled!");
    }
}
