package script.systems.crafting.munition.specific_item;

import script.library.craftinglib;
import script.resource_weight;

public class crafting_component_munition extends script.systems.crafting.munition.crafting_base_component_munition
{
    public crafting_component_munition()
    {
    }
    public static final String VERSION = "v0.00.00";
    public static final String[] REQUIRED_SKILLS = 
    {
        "crafting_weaponsmith_novice"
    };
    public static final String[] ASSEMBLY_SKILL_MODS = 
    {
        "weapon_assembly"
    };
    public static final String[] EXPERIMENT_SKILL_MODS = 
    {
        "weapon_experimentation"
    };
    public static final resource_weight[] OBJ_ASSEMBLY_ATTRIBUTE_RESOURCES = 
    {
        new resource_weight("minDamage", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("maxDamage", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("attackSpeed", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("minRange", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("maxRange", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("woundChance", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("hitPoints", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("accuracy", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("attackCost", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("blindDuration", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("blindChance", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("slowDuration", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("slowIntensity", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("burnDuration", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("burnIntensity", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        })
    };
    public static final resource_weight[] OBJ_MAX_ATTRIBUTE_RESOURCES = 
    {
        new resource_weight("minDamage", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("maxDamage", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("attackSpeed", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("minRange", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("maxRange", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("woundChance", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("hitPoints", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("accuracy", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("attackCost", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("blindDuration", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("blindChance", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("slowDuration", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("slowIntensity", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("burnDuration", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
        }),
        new resource_weight("burnIntensity", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 1),
            new resource_weight.weight(craftinglib.RESOURCE_SHOCK_RESIST, 1)
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
    public resource_weight[] getResourceMaxResourceWeights() throws InterruptedException
    {
        return OBJ_MAX_ATTRIBUTE_RESOURCES;
    }
    public resource_weight[] getAssemblyResourceWeights() throws InterruptedException
    {
        return OBJ_ASSEMBLY_ATTRIBUTE_RESOURCES;
    }
}
