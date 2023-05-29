package script.theme_park.scorekeeper_dungeon;

import script.library.instance;
import script.menu_info;
import script.menu_info_types;
import script.obj_id;
import script.string_id;

public class beast_cave_enter extends script.base_script
{
    public beast_cave_enter()
    {
    }
    public int OnObjectMenuRequest(obj_id self, obj_id player, menu_info item) throws InterruptedException
    {
        item.addRootMenu(menu_info_types.ITEM_USE, new string_id("building_name", "beast_cave_enter"));
        return SCRIPT_CONTINUE;
    }
    public int OnObjectMenuSelect(obj_id self, obj_id player, int item) throws InterruptedException
    {
        if (item == menu_info_types.ITEM_USE)
        {
            if (getDistance(player, self) > 6.0f)
            {
                CustomerServiceLog("beast_cave", "Player successfully used the door but server placed them " + getDistance(player, self) + "m away");
            }
            instance.requestInstanceMovement(player, "beast_cave");
            return SCRIPT_CONTINUE;
        }
        return SCRIPT_CONTINUE;
    }
}
