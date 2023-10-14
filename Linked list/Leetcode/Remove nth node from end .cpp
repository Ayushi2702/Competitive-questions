struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* start = (struct ListNode*)malloc(sizeof(struct ListNode));
    start->next = head;
    struct ListNode* fast = start;
    struct ListNode* slow = start;

    // Move fast pointer n nodes ahead
    for(int i = 0; i < n; ++i) {
        fast = fast->next;
    }

    // Move both pointers until fast reaches the end of the list
    while(fast->next != NULL) {
        fast = fast->next;
        slow = slow->next;
    }

    // Remove the Nth node by updating the next pointer of the node before it
    struct ListNode* temp = slow->next;
    slow->next = slow->next->next;
    free(temp);

    // Get the updated head of the list (start->next points to the actual head)
    struct ListNode* newHead = start->next;

    // Free the dummy node
    free(start);

    return newHead;
}
