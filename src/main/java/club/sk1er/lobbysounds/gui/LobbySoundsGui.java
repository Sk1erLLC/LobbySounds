package club.sk1er.lobbysounds.gui;

import club.sk1er.lobbysounds.config.Sounds;
import club.sk1er.lobbysounds.gui.helper.AbstractScreen;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumChatFormatting;

public class LobbySoundsGui extends AbstractScreen {

    @Override
    public void initGui() {
        createButton(0, 155, 1, getSuffix(Sounds.DISABLE_DRAGON_SOUNDS, "Dragon Sounds"));
        createButton(1, 5, 1, getSuffix(Sounds.DISABLE_EXPERIENCE_SOUNDS, "Experience Sounds"));
        createButton(2, 155, 2, getSuffix(Sounds.DISABLE_ITEM_PICKUP_SOUNDS, "Item Pickup Sounds"));
        createButton(3, 5, 2, getSuffix(Sounds.DISABLE_SLIME_SOUNDS, "Slime Sounds"));
        createButton(4, 155, 3, getSuffix(Sounds.DISABLE_WITHER_SOUNDS, "Wither Sounds"));
        createButton(5, 5, 3, getSuffix(Sounds.DISABLE_TNT_PRIME_SOUNDS, "Tnt Prime Sounds"));
        createButton(6, 155, 4, getSuffix(Sounds.DISABLE_EXPLOSION_SOUNDS, "Explosion Sounds"));
        createButton(7, 5, 4, getSuffix(Sounds.DISABLE_DELIVERY_MAN_SOUNDS, "Delivery Man Sounds"));
        createButton(8, 155, 5, getSuffix(Sounds.DISABLE_NOTE_SOUNDS, "Note Sounds"));
        createButton(9, 5, 5, getSuffix(Sounds.DISABLE_FIREWORKS_SOUNDS, "Fireworks Sounds"));
        createButton(10, 155, 6, getSuffix(Sounds.DISABLE_LEVELUP_SOUNDS, "Levelup Sounds"));
        createButton(11, 5, 6, getSuffix(Sounds.DISABLE_STEP_SOUNDS, "Step Sounds"));
        createButton(12, 155, 7, getSuffix(Sounds.DISABLE_ARROW_SOUNDS, "Arrow Sounds"));
        createButton(13, 5, 7, getSuffix(Sounds.DISABLE_BAT_SOUNDS, "Bat Sounds"));
        createButton(14, 155, 8, getSuffix(Sounds.DISABLE_FIRE_SOUNDS, "Fire Sounds"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        switch (button.id) {
            case 0:
                Sounds.DISABLE_DRAGON_SOUNDS = !Sounds.DISABLE_DRAGON_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_DRAGON_SOUNDS, "Dragon Sounds");
                break;
            case 1:
                Sounds.DISABLE_EXPERIENCE_SOUNDS = !Sounds.DISABLE_EXPERIENCE_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_EXPERIENCE_SOUNDS, "Experience Sounds");
                break;
            case 2:
                Sounds.DISABLE_ITEM_PICKUP_SOUNDS = !Sounds.DISABLE_ITEM_PICKUP_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_ITEM_PICKUP_SOUNDS, "Item Pickup Sounds");
                break;
            case 3:
                Sounds.DISABLE_SLIME_SOUNDS = !Sounds.DISABLE_SLIME_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_SLIME_SOUNDS, "Slime Sounds");
                break;
            case 4:
                Sounds.DISABLE_WITHER_SOUNDS = !Sounds.DISABLE_WITHER_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_WITHER_SOUNDS, "Wither Sounds");
                break;
            case 5:
                Sounds.DISABLE_TNT_PRIME_SOUNDS = !Sounds.DISABLE_TNT_PRIME_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_TNT_PRIME_SOUNDS, "Tnt Prime Sounds");
                break;
            case 6:
                Sounds.DISABLE_EXPLOSION_SOUNDS = !Sounds.DISABLE_EXPLOSION_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_EXPLOSION_SOUNDS, "Explosion Sounds");
                break;
            case 7:
                Sounds.DISABLE_DELIVERY_MAN_SOUNDS = !Sounds.DISABLE_DELIVERY_MAN_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_DELIVERY_MAN_SOUNDS, "Delivery Man Sounds");
                break;
            case 8:
                Sounds.DISABLE_NOTE_SOUNDS = !Sounds.DISABLE_NOTE_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_NOTE_SOUNDS, "Note Sounds");
                break;
            case 9:
                Sounds.DISABLE_FIREWORKS_SOUNDS = !Sounds.DISABLE_FIREWORKS_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_FIREWORKS_SOUNDS, "Fireworks Sounds");
                break;
            case 10:
                Sounds.DISABLE_LEVELUP_SOUNDS = !Sounds.DISABLE_LEVELUP_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_LEVELUP_SOUNDS, "Levelup Sounds");
                break;
            case 11:
                Sounds.DISABLE_STEP_SOUNDS = !Sounds.DISABLE_STEP_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_STEP_SOUNDS, "Step Sounds");
                break;
            case 12:
                Sounds.DISABLE_ARROW_SOUNDS = !Sounds.DISABLE_ARROW_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_ARROW_SOUNDS, "Arrow Sounds");
                break;
            case 13:
                Sounds.DISABLE_BAT_SOUNDS = !Sounds.DISABLE_BAT_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_BAT_SOUNDS, "Bat Sounds");
                break;
            case 14:
                Sounds.DISABLE_FIRE_SOUNDS = !Sounds.DISABLE_FIRE_SOUNDS;
                button.displayString = getSuffix(Sounds.DISABLE_FIRE_SOUNDS, "Fire Sounds");
                break;
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        GlStateManager.pushMatrix();
        GlStateManager.scale(2, 2, 0);
        drawCenteredString(mc.fontRendererObj, EnumChatFormatting.YELLOW + "Lobby Sounds", getCenter() / 2 + 5, getRowPos(-2), -1);
        GlStateManager.popMatrix();
        drawCenteredString(mc.fontRendererObj, EnumChatFormatting.GREEN + "Green means the sound is enabled, "
                + EnumChatFormatting.RED + "red means the sound is disabled.", width / 2, getRowPos(0), -1);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    private void createButton(int id, int width, int rowPos, String label) {
        if (width == 155) {
            buttonList.add(new GuiButton(id, getCenter() - width, getRowPos(rowPos), 150, 20, label));
        } else {
            buttonList.add(new GuiButton(id, getCenter() + width, getRowPos(rowPos), 150, 20, label));
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void onGuiClosed() {
        Sounds.saveConfig();
    }
}
