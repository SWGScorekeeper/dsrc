package script.ai.world_boss;

import script.*;
import script.library.*;
import script.obj_id;

public class grand_horn extends script.base_script
{
    public int OnAttach(obj_id self) throws InterruptedException
    {
	//setName(self, "World Boss Grand Horn");
        trial.setHp(self, trial.HP_WORLD_BOSS_GRAND_HORN);
	sendSystemMessagePlanetTestingOnly("ATTENTION TATOOINE CIVILIANS: The World Boss Grand Horn has been located due North of the Krayt Graveyard! Please proceed with extreme caution.");

	buff.applyBuff(self, "world_boss_creature_1");
	buff.applyBuff(self, "world_boss_creature_2");
	buff.applyBuff(self, "world_boss_creature_3");



	return SCRIPT_CONTINUE;
     } 

    public int OnIncapacitated(obj_id self, obj_id killer)
    {
      sendSystemMessagePlanetTestingOnly("ATTENTION TATOOINE CIVILIANS: The World Boss Grand Horn has been slain by " + getName(killer));
      return SCRIPT_CONTINUE;
    }
	public int OnTriggerVolumeEntered(obj_id self, String volumeName, obj_id breacher) throws InterruptedException
    {
        if (hasObjVar(breacher, "gm"))
        {
            return SCRIPT_CONTINUE;
        }
        if (ai_lib.isInCombat(self))
        {
            return SCRIPT_CONTINUE;
        }
        if (breacher == self)
        {
            return SCRIPT_CONTINUE;
        }
        if (isIncapacitated(self))
        {
            return SCRIPT_CONTINUE;
        }
        if (!isMob(breacher))
        {
            return SCRIPT_CONTINUE;
        }
        if (ai_lib.isMonster(breacher))
        {
            return SCRIPT_CONTINUE;
        }
        if (isPlayer(breacher))
        {
            return SCRIPT_CONTINUE;
        }
        if (volumeName.equals(ai_lib.AGGRO_VOLUME_NAME))
        {
            int reaction = factions.getFactionReaction(self, breacher);
            if (hasAttributeAttained(breacher, attrib.VICTIM))
            {
                reaction = factions.REACTION_NEGATIVE;
            }
            else if (reaction != factions.REACTION_NEGATIVE)
            {
                reaction = factions.REACTION_LIKE;
            }
            switch (reaction)
            {
                case factions.REACTION_NEGATIVE:
                
                {
                    ai_lib.barkString(self, "hi_mean");
                    return SCRIPT_OVERRIDE;
                }
                case factions.REACTION_POSITIVE:
                case factions.REACTION_LIKE:
                
                {
                    ai_lib.barkString(self, "hi_nice");
                }
                break;
                default:
                
                {
                }
                break;
            }
        }
        return SCRIPT_CONTINUE;
    }
    public int OnTriggerVolumeExited(obj_id self, String volumeName, obj_id breacher) throws InterruptedException
    {
        if (ai_lib.isInCombat(self))
        {
            return SCRIPT_CONTINUE;
        }
        if (isPlayer(breacher))
        {
            return SCRIPT_CONTINUE;
        }
        if (volumeName.equals(ai_lib.AGGRO_VOLUME_NAME))
        {
            if (isMob(breacher) && !ai_lib.isMonster(breacher))
            {
                int reaction = factions.getFactionReaction(self, breacher);
                if (hasAttributeAttained(breacher, attrib.VICTIM))
                {
                    reaction = factions.REACTION_NEGATIVE;
                }
                else if (reaction != factions.REACTION_NEGATIVE)
                {
                    reaction = factions.REACTION_LIKE;
                }
                switch (reaction)
                {
                    case factions.REACTION_NEGATIVE:
                    
                    {
                        ai_lib.barkString(self, "bye_mean");
                        if (rand(1, 2) == 1)
                        {

                            return SCRIPT_OVERRIDE;
                        }
                    }
                    case factions.REACTION_POSITIVE:
                    case factions.REACTION_LIKE:
                    
                    {
                        ai_lib.barkString(self, "bye_nice");
                    }
                    break;
                    default:
                    
                    {
                        ai_lib.barkString(self, "bye_mean");
                    }
                    break;
                }
            }
        }
        return SCRIPT_CONTINUE;
    }
    public int OnBehaviorChange(obj_id self, int newBehavior, int oldBehavior, int[] changeFlags) throws InterruptedException
    {
        if (isIncapacitated(self))
        {
            return SCRIPT_CONTINUE;
        }
        if (ai_lib.isInCombat(self))
        {
            return SCRIPT_OVERRIDE;
        }
        if (newBehavior > oldBehavior)
        {
            if (newBehavior >= BEHAVIOR_THREATEN && newBehavior < BEHAVIOR_ATTACK)
            {
                doAgitateBehavior(self, newBehavior);
                return SCRIPT_OVERRIDE;
            }
            return SCRIPT_CONTINUE;
        }
        else if (newBehavior == BEHAVIOR_CALM)
        {
            ai_lib.barkString(self, "calm");
            return SCRIPT_CONTINUE;
        }
        return SCRIPT_CONTINUE;
    }
    public void doAgitateBehavior(obj_id npc, int behavior) throws InterruptedException
    {
        if (isInvulnerable(npc))
        {
            return;
        }
    }
}
