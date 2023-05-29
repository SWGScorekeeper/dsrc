package script.theme_park.scorekeeper_dungeon;

import script.library.instance;
import script.menu_info;
import script.menu_info_types;
import script.obj_id;
import script.string_id;

public class heroic_avatar_hardmode_enter extends script.base_script
{
    public heroic_avatar_hardmode_enter()
    {
    }
    public int OnObjectMenuRequest(obj_id self, obj_id player, menu_info item) throws InterruptedException
    {
        item.addRootMenu(menu_info_types.ITEM_USE, new string_id("building_name", "heroic_avatar_hardmode"));
        return SCRIPT_CONTINUE;
    }
    public int OnObjectMenuSelect(obj_id self, obj_id player, int item) throws InterruptedException
    {
        if (item == menu_info_types.ITEM_USE)
        {
            if (getDistance(player, self) > 6.0f)
            {
                CustomerServiceLog("heroic_avatar_hardmode", "Player successfully used the door but server placed them " + getDistance(player, self) + "m away");
            }
            instance.requestInstanceMovement(player, "heroic_avatar_hardmode");
            return SCRIPT_CONTINUE;
        }
        return SCRIPT_CONTINUE;
    }
}
