import events.PlayerJoin
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit


@Suppress("UNUSED")
class Plugin : JavaPlugin(){
    override fun onEnable() { //TODO: Register commands
        server.pluginManager.registerEvents(PlayerJoin(), this)
    }
}