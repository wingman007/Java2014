package skits.main;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import skits.cmds.KitCommand;
import skits.events.PlayerListener;

public class SKitMain extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(new PlayerListener(), this);
        getCommand("kit").setExecutor(new KitCommand());
        
        System.out.println("sKits edabled!");
    }
    
    @Override
    public void onDisable() {

        System.out.println("sKits disabled!");
    }
}
