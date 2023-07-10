package events
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
class PlayerJoin : Listener {
    @EventHandler
    fun playerJoin(event: PlayerJoinEvent) { //TODO: ask the player to select class
    }
}
