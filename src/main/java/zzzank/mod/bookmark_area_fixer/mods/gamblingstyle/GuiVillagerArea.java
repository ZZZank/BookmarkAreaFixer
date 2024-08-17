package zzzank.mod.bookmark_area_fixer.mods.gamblingstyle;

import com.fuzs.gamblingstyle.client.gui.GuiVillager;
import mezz.jei.api.gui.IAdvancedGuiHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.awt.*;
import java.util.Collections;
import java.util.List;

/**
 * @author ZZZank
 */
public class GuiVillagerArea implements IAdvancedGuiHandler<GuiVillager> {

    @Override
    @Nonnull
    public Class<GuiVillager> getGuiContainerClass() {
        return GuiVillager.class;
    }

    @Nullable
    @Override
    public List<Rectangle> getGuiExtraAreas(@Nonnull GuiVillager gui) {
        var book = ((GuiVillagerAccessor) gui).get$tradingBookGui();
        var access = ((GuiTradingBookAccessor) book);
        return Collections.singletonList(
            new Rectangle(access.get$guiLeft(), access.get$guiTop(), access.get$xSize(), access.get$ySize())
        );
    }
}
