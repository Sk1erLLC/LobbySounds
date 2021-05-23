package club.sk1er.lobbysounds.command;

import club.sk1er.lobbysounds.LobbySounds;
import gg.essential.api.commands.Command;
import gg.essential.api.commands.DefaultHandler;
import gg.essential.api.utils.GuiUtil;

import java.util.Objects;

public class LobbySoundsCommand extends Command {

    public LobbySoundsCommand() {
        super("lobbysounds");
    }

    @DefaultHandler
    public void handle() {
        GuiUtil.open(Objects.requireNonNull(LobbySounds.instance.getSounds().gui()));
    }
}
