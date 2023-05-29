package script.item;

import script.*;
import script.library.buff;

public class buffer extends script.base_script {

    public buffer() {
    }

    public int OnObjectMenuRequest(obj_id self, obj_id player, menu_info mi) throws InterruptedException {
        mi.addRootMenu(menu_info_types.ITEM_USE, new string_id("sui", "use"));
        return SCRIPT_CONTINUE;
    }

    public int OnObjectMenuSelect(obj_id self, obj_id player, int item) throws InterruptedException {

        if(item == menu_info_types.ITEM_USE) {
            buff.applyBuff(player, "me_buff_health_2");
        }
        return SCRIPT_CONTINUE;
    }
}
