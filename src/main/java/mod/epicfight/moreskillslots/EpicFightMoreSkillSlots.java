package mod.epicfight.moreskillslots;

import net.minecraftforge.fml.common.Mod;
import yesman.epicfight.skill.SkillSlot;

@Mod(EpicFightMoreSkillSlots.MOD_ID)
public class EpicFightMoreSkillSlots {
    public static final String MOD_ID = "epicfight_moreskillslots";

    public EpicFightMoreSkillSlots() {
        SkillSlot.ENUM_MANAGER.registerEnumCls(MOD_ID, MoreSkillSlots.class);
    }
}
