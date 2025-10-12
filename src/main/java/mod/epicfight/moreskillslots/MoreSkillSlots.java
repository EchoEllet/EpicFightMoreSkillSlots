package mod.epicfight.moreskillslots;

import yesman.epicfight.skill.SkillCategories;
import yesman.epicfight.skill.SkillCategory;
import yesman.epicfight.skill.SkillSlot;

public enum MoreSkillSlots implements SkillSlot {
    Passive4(SkillCategories.PASSIVE),
    Passive5(SkillCategories.PASSIVE),
    Identity2(SkillCategories.IDENTITY),
    ;

    final SkillCategory category;
    final int id;

    MoreSkillSlots(SkillCategory category) {
        this.category = category;
        id = SkillSlot.ENUM_MANAGER.assign(this);
    }

    @Override
    public SkillCategory category() {
        return category;
    }

    @Override
    public int universalOrdinal() {
        return this.id;
    }
}
