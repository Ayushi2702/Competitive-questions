class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* root=head;
        if(!root)return root;
        while(root->next!=NULL)
        {
            if(root->val==root->next->val)
            {
                root->next=root->next->next;
            }
            else{
                root=root->next;
            }
        }
        return head;
        
    }
};