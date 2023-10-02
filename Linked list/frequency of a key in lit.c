#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
}*first = NULL;

void create(int A[], int n) {
    int i;
    struct Node *last, *t;
    first = (struct Node *)malloc(sizeof(struct Node));
    first->data = A[0];
    first->next = NULL;
    last = first;
    for (i = 1; i < n; i++) {
        t = (struct Node *)malloc(sizeof(struct Node));
        t->data = A[i];
        t->next = NULL;
        last->next = t;
        last = t;
    }
}

int freq(struct Node *p, int key) {
    int f = 0;
    while (p != NULL) {
        if (p->data == key) {
            f++;
        }
        p = p->next;
    }
    return f;
}

void freeMemory(struct Node *p) {
    struct Node *temp;
    while (p != NULL) {
        temp = p;
        p = p->next;
        free(temp);
    }
}

void display(struct Node *p) {
    while (p != NULL) {
        printf("%d -> ", p->data);
        p = p->next;
    }
    printf("NULL\n");
}

int main() {
    int A[] = {3, 5, 5, 5, 5};
    create(A, 5);
    printf("Original Linked List: ");
    display(first);
    int key = 5;
    printf("Frequency of %d: %d\n", key, freq(first, key));
    freeMemory(first); // Free the allocated memory
    return 0;
}
