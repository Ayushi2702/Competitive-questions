class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if(!head){return head;}

        ListNode* dummy =new ListNode(0);
        dummy->next=head;
        ListNode* ptr=dummy;
        while(ptr->next && ptr->next->next)
        {
            if(ptr->next->val==ptr->next->next->val)
            {
                int variable=ptr->next->val;
                while(ptr->next!=NULL && ptr->next->val==variable)
                {
                    ptr->next=ptr->next->next;
                }

            }
            else{
                ptr=ptr->next;
            }
        }
return dummy->next;



    }
    };

