package me.creonc.selectcore
import me.creonc.selectcore.events.*
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor


@Suppress("UNUSED")
class Plugin : JavaPlugin(){
    companion object : CommandExecutor {
        var instance: Plugin? = null
            private set;
    }
    override fun onEnable() { //TODO: Register commands
        server.pluginManager.registerEvents(PlayerJoin(), this)
        getCommand("SelectClass").executor = onCommand

        Bukkit.getLogger().info("Plugin Enabled!")
    }
}