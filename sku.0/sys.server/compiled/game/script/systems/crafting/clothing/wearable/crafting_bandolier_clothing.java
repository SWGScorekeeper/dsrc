package script.systems.crafting.clothing.wearable;

import script.draft_schematic;
import script.library.craftinglib;
import script.obj_id;
import script.resource_weight;

public class crafting_bandolier_clothing extends script.systems.crafting.clothing.crafting_base_clothing
{
    public crafting_bandolier_clothing()
    {
    }
    public static final String VERSION = "v0.00.00";
    public static final String[] REQUIRED_SKILLS = 
    {
        "crafting_tailor_novice"
    };
    public static final String[] ASSEMBLY_SKILL_MODS = 
    {
        "clothing_assembly"
    };
    public static final String[] EXPERIMENT_SKILL_MODS = 
    {
        "clothing_experimentation",
        "clothing_complexity"
    };
    public static final String[] CUSTOMIZATION_SKILL_MODS = 
    {
        "clothing_customization"
    };
    public static final String[] APPEARANCES = 
    {
        "object/tangible/wearables/bandolier/shared_bandolier_s01.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s02.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s03.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s04.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s05.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s06.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s07.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_s08.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_tusken_raider_s01.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_tusken_raider_s02.iff",
        "object/tangible/wearables/bandolier/shared_bandolier_tusken_raider_s03.iff"
    };
    public static final resource_weight[] OBJ_ASSEMBLY_ATTRIBUTE_RESOURCES = 
    {
        new resource_weight("hitPoints", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_CONDUCTIVITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_COLD_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_DECAY_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_HEAT_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_TOUGHNESS, 1)
        })
    };
    public static final resource_weight[] OBJ_MAX_ATTRIBUTE_RESOURCES = 
    {
        new resource_weight("hitPoints", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_CONDUCTIVITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_COLD_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_DECAY_RESIST, 4),
            new resource_weight.weight(craftinglib.RESOURCE_HEAT_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1),
            new resource_weight.weight(craftinglib.RESOURCE_TOUGHNESS, 1)
        })
    };
    public String[] getRequiredSkills() throws InterruptedException
    {
        return REQUIRED_SKILLS;
    }
    public String[] getAssemblySkillMods() throws InterruptedException
    {
        return ASSEMBLY_SKILL_MODS;
    }
    public String[] getExperimentSkillMods() throws InterruptedException
    {
        return EXPERIMENT_SKILL_MODS;
    }
    public String[] getCustomizationSkillMods() throws InterruptedException
    {
        return CUSTOMIZATION_SKILL_MODS;
    }
    public String[] getAppearances(obj_id player, draft_schematic.slot[] slots) throws InterruptedException
    {
        return APPEARANCES;
    }
    public draft_schematic.custom[] getCustomizations(obj_id player, draft_schematic.custom[] customizations) throws InterruptedException
    {
        LOG("customization", "New customization code activated");
        if (customizations == null || customizations.length == 0)
        {
            return null;
        }
        return craftinglib.standardCustomizationProcedure(player, customizations, CUSTOMIZATION_SKILL_MODS);
    }
    public resource_weight[] getResourceMaxResourceWeights() throws InterruptedException
    {
        return OBJ_MAX_ATTRIBUTE_RESOURCES;
    }
    public resource_weight[] getAssemblyResourceWeights() throws InterruptedException
    {
        return OBJ_ASSEMBLY_ATTRIBUTE_RESOURCES;
    }
}
