package pw.mihou.amelia.discord.commands.subcommands

import java.awt.Color
import org.javacord.api.entity.message.embed.EmbedBuilder
import org.javacord.api.util.logging.ExceptionLogger
import pw.mihou.nexus.features.command.facade.NexusCommandEvent

object RegisterHelpSubcommand {
    fun run(event: NexusCommandEvent) {
        event
            .respondNowEphemerallyWith(
                EmbedBuilder()
                    .setColor(Color.YELLOW)
                    .setTimestampToNow()
                    .setDescription(
                        "You can read all our official guides over how to use the `/register` " +
                            "command on the following links:" +
                            "\n- [**Creating Author Feeds**]" +
                            "(https://github.com/Amelia-chan/Amelia/discussions/18)" +
                            "\n- [**Creating Reading List Feeds**]" +
                            "(https://github.com/Amelia-chan/Amelia/discussions/19)",
                    ),
            ).exceptionally(ExceptionLogger.get())
    }
}
