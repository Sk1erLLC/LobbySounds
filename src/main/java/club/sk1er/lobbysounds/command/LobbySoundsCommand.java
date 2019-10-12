package club.sk1er.lobbysounds.command;

import club.sk1er.lobbysounds.gui.LobbySoundsGui;
import club.sk1er.lobbysounds.util.TickScheduler;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class LobbySoundsCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "lobbysounds";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/lobbysounds";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        TickScheduler.INSTANCE.schedule(0, () -> Minecraft.getMinecraft().displayGuiScreen(new LobbySoundsGui()));
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
