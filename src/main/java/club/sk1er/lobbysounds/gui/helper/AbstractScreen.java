package club.sk1er.lobbysounds.gui.helper;

import net.minecraft.client.gui.GuiScreen;

public class AbstractScreen extends GuiScreen implements ScreenHelper {
    protected int getCenter() {
        return width / 2;
    }
}
