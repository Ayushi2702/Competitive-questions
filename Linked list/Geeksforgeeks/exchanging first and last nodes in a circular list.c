#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
}*head=NULL;

void create(int A[],int n)
{
    int i;
    struct node *last,*t;
    head=(struct node *)malloc(sizeof(struct node));
    head->data=A[0];
    head->next=head;
    last=head;
    for(i=1;i<n;i++)
    {
        t=(struct node *)malloc(sizeof(struct node));
        t->data=A[i];
        t->next=last->next;
        last->next=t;
        last=t;
        
    }
}

void exchange(struct node *p)
{
    while(p->next->next!=head)
    {
        p=p->next;
    }
    int temp=p->next->data;
    p->next->data=head->data;
    head->data=temp;
}

void display(struct node *p)
{
    do{
        printf(" %d\t",p->data);
        p=p->next;
        
    }while(p!=head);
}



int main()
{
    int A[]={1,2,3,4,5};
    create(A,5);
    display(head);
    exchange(head);
    printf("\nThe list after swapping the first and last nodes is :");
    display(head);
    return 0;
}