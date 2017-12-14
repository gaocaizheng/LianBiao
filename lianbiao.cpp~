#include <iostream>
#include <stdlib.h>
using namespace std ;
int a []  = {0,1,8,9,10,2,6,13,22};
int m  = 4 , n = 4 ;
typedef struct LNode
{
	int data ;
	struct LNode *next ;
}LNode;

/*
 * n代表从数组第几个元素开始
 * m代表总共插入的元素数目
 * */
void WeiChaCreateNode(struct LNode *&C,  int a[] ,int n,int m ){

	LNode *s,*r ;
	int i ;
	C = (LNode *)malloc(sizeof(LNode));//C指针的初始化
	C->next = NULL;
	r = C ;//r指针的初始化

	for(i =n ; i <m+n;i++){
		s = (LNode *)malloc(sizeof(LNode));
		s->data = a[i];
		r->next = s;
		r= r->next ;

	}
	r->next = NULL ;

}

void TouChaCreateLNode(struct LNode *&C , int b[] , int n ,int m ){

	LNode *s ;
	int i ;
	C = (LNode*)malloc(sizeof(LNode));
	C->next = NULL ;
	for(i= n ; i<m+n;i++){
		s= (LNode*)malloc(sizeof(LNode));
		s->data = b[i];
		s->next = C->next ;
		C->next = s ;
	}
}
void WeiChaMerge(struct LNode*&A , LNode *&B,LNode *&C){
	LNode *p = A->next ;
	LNode *q = B->next ;
	LNode *r  ;
	C = A ;
	C->next = NULL ;
	free(B);
	r = C  ;
	while(p!=NULL&&q!=NULL){
		if( p->data<=q->data){
			r->next = p ;
			p = p->next ;
			r = r->next ;
		}else{
			r->next = q ;
			q = q->next ;
			r = r->next ;
		}
	}
	r->next = NULL ;
	if(p!=NULL) r->next = p  ;
	if(q!=NULL) r->next = q ;
}
/*链表插入算法*/
void Insert(int A[], int m , int n )
{
		int i , j ;
		int temp ;

}










int main() {
	LNode *A ,*B,*C,*P;
	cout<<"链表A中内容"<<endl;

	WeiChaCreateNode(A,a,1,m);
	P = A->next ;
	for(int i =0 ; i<4;i++){
		cout<<P->data<<"  ";
		P=P->next ;
	}
	cout<<" "<<endl;
	cout<<"链表B中内容"<<endl;
	WeiChaCreateNode(B,a,m+1,n);
	P = B->next ;
	for(int i =0 ; i<4;i++){
		cout<<P->data<<"  ";
		P=P->next ;
	}
	cout<<" "<<endl;
	cout<<"链表C中内容"<<endl;
	WeiChaMerge(A,B,C);
	P = C->next ;
	for(int i =0 ; i<8;i++){
		cout<<P->data<<"  ";
		P=P->next ;
	}

    return 0;
}

