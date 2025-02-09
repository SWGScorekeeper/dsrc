package script.systems.crafting.space.engine;

import script.library.craftinglib;
import script.resource_weight;

public class crafting_engine_limiter extends script.systems.crafting.space.engine.crafting_base_engine_component
{
    public crafting_engine_limiter()
    {
    }
    public static final String VERSION = "v0.00.00";
    public static final String[] REQUIRED_SKILLS = 
    {
        "crafting_shipwright_novice"
    };
    public static final String[] ASSEMBLY_SKILL_MODS = 
    {
        "engine_assembly"
    };
    public static final String[] EXPERIMENT_SKILL_MODS = 
    {
        "engine_experimentation"
    };
    public static final resource_weight[] OBJ_ASSEMBLY_ATTRIBUTE_RESOURCES = 
    {
        new resource_weight("engine_speed", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_CONDUCTIVITY, 2),
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 3)
        }),
        new resource_weight("energy_maintenance", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_CONDUCTIVITY, 2),
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 3)
        })
    };
    public static final resource_weight[] OBJ_MAX_ATTRIBUTE_RESOURCES = 
    {
        new resource_weight("engine_speed", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_CONDUCTIVITY, 2),
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 3)
        }),
        new resource_weight("energy_maintenance", new resource_weight.weight[]
        {
            new resource_weight.weight(craftinglib.RESOURCE_CONDUCTIVITY, 2),
            new resource_weight.weight(craftinglib.RESOURCE_QUALITY, 3)
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
