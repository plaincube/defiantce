package bastion.defiantce.module.render;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import de.Hero.settings.Setting;
import bastion.defiantce.Defiant;
import bastion.defiantce.module.Category;
import bastion.defiantce.module.Module;

public class ClickGui extends Module{

        public ClickGui() {
        super("ClickGui", Keyboard.KEY_M, Category.RENDER);
    }

    @Override
    public void setup() {
        ArrayList<String> options = new ArrayList<String>();
        options.add("New");
        options.add("JellyLike");
        Defiant.instance.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Defiant.instance.settingsManager.rSetting(new Setting("Sound", this, false));
        Defiant.instance.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Defiant.instance.settingsManager.rSetting(new Setting("GuiGreen", this, 26, 0, 255, true));
        Defiant.instance.settingsManager.rSetting(new Setting("GuiBlue", this, 42, 0, 255, true));
    }

    @Override
    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Defiant.instance.clickGUI);
        toggle();
    }
}