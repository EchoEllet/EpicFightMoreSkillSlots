package mod.epicfight.moreskillslots;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import yesman.epicfight.skill.SkillSlot;

@Mod(EpicFightMoreSkillSlots.MOD_ID)
public class EpicFightMoreSkillSlots {
    public static final String MOD_ID = "epicfight_moreskillslots";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EpicFightMoreSkillSlots(IEventBus modEventBus, ModContainer modContainer) {
        SkillSlot.ENUM_MANAGER.registerEnumCls(MOD_ID, MoreSkillSlots.class);
    }
}
