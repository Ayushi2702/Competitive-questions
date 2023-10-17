class Solution {
public:
    int lengthofLinkedList(ListNode* head) {
        int length = 0;
        ListNode* temp = head;
        while (temp != NULL) {
            temp = temp->next;
            length++;
        }
        return length;
    }

    ListNode* reverseKGroup(ListNode* head, int k) {
        int length = lengthofLinkedList(head);
        // base case
        if (length < k) {
            return head;
        }

        int count = 0;
        ListNode* prev = NULL, *nex = NULL, *curr = head;

        while (count < k && curr != NULL) {
            nex = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nex;
            count++;
        }

        if (nex != NULL) {
            head->next = reverseKGroup(nex, k);
        }

        return prev;
    }
};
