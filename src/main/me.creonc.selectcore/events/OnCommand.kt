package events
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class OnCommand : Listener {
    @EventHandler
    fun OnCommandSelect(sender: CommandSender?, command: Command, Label:String, args: Array<out String>?){
        (sender as? Player)?.chat("Why a printline is hard")
    }
}