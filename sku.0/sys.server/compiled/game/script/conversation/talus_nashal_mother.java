package script.conversation;

import script.library.ai_lib;
import script.library.chat;
import script.library.groundquests;
import script.library.utils;
import script.*;

public class talus_nashal_mother extends script.base_script
{
    public talus_nashal_mother()
    {
    }
    public static String c_stringFile = "conversation/talus_nashal_mother";
    public boolean talus_nashal_mother_condition__defaultCondition(obj_id player, obj_id npc) throws InterruptedException
    {
        return true;
    }
    public boolean talus_nashal_mother_condition_onTalkMother(obj_id player, obj_id npc) throws InterruptedException
    {
        return groundquests.isTaskActive(player, "talus_nashal_goto_mother", "selonian_talk_mother");
    }
    public boolean talus_nashal_mother_condition_completeTalkMother(obj_id player, obj_id npc) throws InterruptedException
    {
        return groundquests.hasCompletedQuest(player, "talus_nashal_goto_mother");
    }
    public void talus_nashal_mother_action_signalTalkMother(obj_id player, obj_id npc) throws InterruptedException
    {
        groundquests.sendSignal(player, "selonian_talk_mother");
    }
    public void talus_nashal_mother_action_grant_handoff_41(obj_id player, obj_id npc) throws InterruptedException
    {
        groundquests.grantQuest(player, "talus_dearic_goto_dathnaeya");
    }
    public int talus_nashal_mother_handleBranch2(obj_id player, obj_id npc, string_id response) throws InterruptedException
    {
        if (response.equals("s_8"))
        {
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                string_id message = new string_id(c_stringFile, "s_9");
                int numberOfResponses = 0;
                boolean hasResponse = false;
                boolean hasResponse0 = false;
                if (talus_nashal_mother_condition__defaultCondition(player, npc))
                {
                    ++numberOfResponses;
                    hasResponse = true;
                    hasResponse0 = true;
                }
                if (hasResponse)
                {
                    int responseIndex = 0;
                    string_id responses[] = new string_id[numberOfResponses];
                    if (hasResponse0)
                    {
                        responses[responseIndex++] = new string_id(c_stringFile, "s_14");
                    }
                    utils.setScriptVar(player, "conversation.talus_nashal_mother.branchId", 3);
                    npcSpeak(player, message);
                    npcSetConversationResponses(player, responses);
                }
                else 
                {
                    utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
                    npcEndConversationWithMessage(player, message);
                }
                return SCRIPT_CONTINUE;
            }
        }
        return SCRIPT_DEFAULT;
    }
    public int talus_nashal_mother_handleBranch3(obj_id player, obj_id npc, string_id response) throws InterruptedException
    {
        if (response.equals("s_14"))
        {
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                string_id message = new string_id(c_stringFile, "s_15");
                int numberOfResponses = 0;
                boolean hasResponse = false;
                boolean hasResponse0 = false;
                if (talus_nashal_mother_condition__defaultCondition(player, npc))
                {
                    ++numberOfResponses;
                    hasResponse = true;
                    hasResponse0 = true;
                }
                boolean hasResponse1 = false;
                if (talus_nashal_mother_condition__defaultCondition(player, npc))
                {
                    ++numberOfResponses;
                    hasResponse = true;
                    hasResponse1 = true;
                }
                if (hasResponse)
                {
                    int responseIndex = 0;
                    string_id responses[] = new string_id[numberOfResponses];
                    if (hasResponse0)
                    {
                        responses[responseIndex++] = new string_id(c_stringFile, "s_20");
                    }
                    if (hasResponse1)
                    {
                        responses[responseIndex++] = new string_id(c_stringFile, "s_21");
                    }
                    utils.setScriptVar(player, "conversation.talus_nashal_mother.branchId", 4);
                    npcSpeak(player, message);
                    npcSetConversationResponses(player, responses);
                }
                else 
                {
                    utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
                    npcEndConversationWithMessage(player, message);
                }
                return SCRIPT_CONTINUE;
            }
        }
        return SCRIPT_DEFAULT;
    }
    public int talus_nashal_mother_handleBranch4(obj_id player, obj_id npc, string_id response) throws InterruptedException
    {
        if (response.equals("s_20"))
        {
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                talus_nashal_mother_action_signalTalkMother(player, npc);
                string_id message = new string_id(c_stringFile, "s_22");
                int numberOfResponses = 0;
                boolean hasResponse = false;
                boolean hasResponse0 = false;
                if (talus_nashal_mother_condition__defaultCondition(player, npc))
                {
                    ++numberOfResponses;
                    hasResponse = true;
                    hasResponse0 = true;
                }
                if (hasResponse)
                {
                    int responseIndex = 0;
                    string_id responses[] = new string_id[numberOfResponses];
                    if (hasResponse0)
                    {
                        responses[responseIndex++] = new string_id(c_stringFile, "s_27");
                    }
                    utils.setScriptVar(player, "conversation.talus_nashal_mother.branchId", 5);
                    npcSpeak(player, message);
                    npcSetConversationResponses(player, responses);
                }
                else 
                {
                    utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
                    npcEndConversationWithMessage(player, message);
                }
                return SCRIPT_CONTINUE;
            }
        }
        if (response.equals("s_21"))
        {
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                string_id message = new string_id(c_stringFile, "s_23");
                int numberOfResponses = 0;
                boolean hasResponse = false;
                boolean hasResponse0 = false;
                if (talus_nashal_mother_condition__defaultCondition(player, npc))
                {
                    ++numberOfResponses;
                    hasResponse = true;
                    hasResponse0 = true;
                }
                if (hasResponse)
                {
                    int responseIndex = 0;
                    string_id responses[] = new string_id[numberOfResponses];
                    if (hasResponse0)
                    {
                        responses[responseIndex++] = new string_id(c_stringFile, "s_26");
                    }
                    utils.setScriptVar(player, "conversation.talus_nashal_mother.branchId", 7);
                    npcSpeak(player, message);
                    npcSetConversationResponses(player, responses);
                }
                else 
                {
                    utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
                    npcEndConversationWithMessage(player, message);
                }
                return SCRIPT_CONTINUE;
            }
        }
        return SCRIPT_DEFAULT;
    }
    public int talus_nashal_mother_handleBranch5(obj_id player, obj_id npc, string_id response) throws InterruptedException
    {
        if (response.equals("s_27"))
        {
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                talus_nashal_mother_action_grant_handoff_41(player, npc);
                string_id message = new string_id(c_stringFile, "s_28");
                utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
                npcEndConversationWithMessage(player, message);
                return SCRIPT_CONTINUE;
            }
        }
        return SCRIPT_DEFAULT;
    }
    public int talus_nashal_mother_handleBranch7(obj_id player, obj_id npc, string_id response) throws InterruptedException
    {
        if (response.equals("s_26"))
        {
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                talus_nashal_mother_action_signalTalkMother(player, npc);
                string_id message = new string_id(c_stringFile, "s_22");
                int numberOfResponses = 0;
                boolean hasResponse = false;
                boolean hasResponse0 = false;
                if (talus_nashal_mother_condition__defaultCondition(player, npc))
                {
                    ++numberOfResponses;
                    hasResponse = true;
                    hasResponse0 = true;
                }
                if (hasResponse)
                {
                    int responseIndex = 0;
                    string_id responses[] = new string_id[numberOfResponses];
                    if (hasResponse0)
                    {
                        responses[responseIndex++] = new string_id(c_stringFile, "s_27");
                    }
                    utils.setScriptVar(player, "conversation.talus_nashal_mother.branchId", 5);
                    npcSpeak(player, message);
                    npcSetConversationResponses(player, responses);
                }
                else 
                {
                    utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
                    npcEndConversationWithMessage(player, message);
                }
                return SCRIPT_CONTINUE;
            }
        }
        return SCRIPT_DEFAULT;
    }
    public int OnInitialize(obj_id self) throws InterruptedException
    {
        if ((!isTangible(self)) || (isPlayer(self)))
        {
            detachScript(self, "conversation.talus_nashal_mother");
        }
        setCondition(self, CONDITION_CONVERSABLE);
        setCondition(self, CONDITION_INTERESTING);
        setInvulnerable(self, true);
        return SCRIPT_CONTINUE;
    }
    public int OnAttach(obj_id self) throws InterruptedException
    {
        setCondition(self, CONDITION_CONVERSABLE);
        setCondition(self, CONDITION_INTERESTING);
        setInvulnerable(self, true);
        return SCRIPT_CONTINUE;
    }
    public int OnObjectMenuRequest(obj_id self, obj_id player, menu_info menuInfo) throws InterruptedException
    {
        int menu = menuInfo.addRootMenu(menu_info_types.CONVERSE_START, null);
        menu_info_data menuInfoData = menuInfo.getMenuItemById(menu);
        menuInfoData.setServerNotify(false);
        setCondition(self, CONDITION_CONVERSABLE);
        faceTo(self, player);
        return SCRIPT_CONTINUE;
    }
    public int OnIncapacitated(obj_id self, obj_id killer) throws InterruptedException
    {
        clearCondition(self, CONDITION_CONVERSABLE);
        detachScript(self, "conversation.talus_nashal_mother");
        return SCRIPT_CONTINUE;
    }
    public boolean npcStartConversation(obj_id player, obj_id npc, String convoName, string_id greetingId, prose_package greetingProse, string_id[] responses) throws InterruptedException
    {
        Object[] objects = new Object[responses.length];
        System.arraycopy(responses, 0, objects, 0, responses.length);
        return npcStartConversation(player, npc, convoName, greetingId, greetingProse, objects);
    }
    public int OnStartNpcConversation(obj_id self, obj_id player) throws InterruptedException
    {
        obj_id npc = self;
        if (ai_lib.isInCombat(npc) || ai_lib.isInCombat(player))
        {
            return SCRIPT_OVERRIDE;
        }
        if (talus_nashal_mother_condition_completeTalkMother(player, npc))
        {
            talus_nashal_mother_action_grant_handoff_41(player, npc);
            string_id message = new string_id(c_stringFile, "s_25");
            chat.chat(npc, player, message);
            return SCRIPT_CONTINUE;
        }
        if (talus_nashal_mother_condition_onTalkMother(player, npc))
        {
            string_id message = new string_id(c_stringFile, "s_5");
            int numberOfResponses = 0;
            boolean hasResponse = false;
            boolean hasResponse0 = false;
            if (talus_nashal_mother_condition__defaultCondition(player, npc))
            {
                ++numberOfResponses;
                hasResponse = true;
                hasResponse0 = true;
            }
            if (hasResponse)
            {
                int responseIndex = 0;
                string_id responses[] = new string_id[numberOfResponses];
                if (hasResponse0)
                {
                    responses[responseIndex++] = new string_id(c_stringFile, "s_8");
                }
                utils.setScriptVar(player, "conversation.talus_nashal_mother.branchId", 2);
                npcStartConversation(player, npc, "talus_nashal_mother", message, responses);
            }
            else 
            {
                chat.chat(npc, player, message);
            }
            return SCRIPT_CONTINUE;
        }
        if (talus_nashal_mother_condition__defaultCondition(player, npc))
        {
            string_id message = new string_id(c_stringFile, "s_30");
            chat.chat(npc, player, message);
            return SCRIPT_CONTINUE;
        }
        chat.chat(npc, "Error:  All conditions for OnStartNpcConversation were false.");
        return SCRIPT_CONTINUE;
    }
    public int OnNpcConversationResponse(obj_id self, String conversationId, obj_id player, string_id response) throws InterruptedException
    {
        if (!conversationId.equals("talus_nashal_mother"))
        {
            return SCRIPT_CONTINUE;
        }
        obj_id npc = self;
        int branchId = utils.getIntScriptVar(player, "conversation.talus_nashal_mother.branchId");
        if (branchId == 2 && talus_nashal_mother_handleBranch2(player, npc, response) == SCRIPT_CONTINUE)
        {
            return SCRIPT_CONTINUE;
        }
        if (branchId == 3 && talus_nashal_mother_handleBranch3(player, npc, response) == SCRIPT_CONTINUE)
        {
            return SCRIPT_CONTINUE;
        }
        if (branchId == 4 && talus_nashal_mother_handleBranch4(player, npc, response) == SCRIPT_CONTINUE)
        {
            return SCRIPT_CONTINUE;
        }
        if (branchId == 5 && talus_nashal_mother_handleBranch5(player, npc, response) == SCRIPT_CONTINUE)
        {
            return SCRIPT_CONTINUE;
        }
        if (branchId == 7 && talus_nashal_mother_handleBranch7(player, npc, response) == SCRIPT_CONTINUE)
        {
            return SCRIPT_CONTINUE;
        }
        chat.chat(npc, "Error:  Fell through all branches and responses for OnNpcConversationResponse.");
        utils.removeScriptVar(player, "conversation.talus_nashal_mother.branchId");
        return SCRIPT_CONTINUE;
    }
}
