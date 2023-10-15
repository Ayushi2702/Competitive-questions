class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (!list1) return list2;
        if (!list2) return list1;
        
        ListNode* ptr1 = list1;
        ListNode* ptr2 = list2;
        ListNode* head = new ListNode(); // dummy node
        ListNode* ptr3 = head;

        while (ptr1 && ptr2) {
            if (ptr1->val < ptr2->val) {
                ptr3->next = ptr1;
                ptr1 = ptr1->next;
            } else {
                ptr3->next = ptr2;
                ptr2 = ptr2->next;
            }
            ptr3 = ptr3->next;
        }

        // If any of the input lists is not fully traversed, attach it to the merged list
        if (ptr1) {
            ptr3->next = ptr1;
        } else {
            ptr3->next = ptr2;
        }

        // The actual merged list starts from the next of the dummy node
        return head->next;
    }
};
