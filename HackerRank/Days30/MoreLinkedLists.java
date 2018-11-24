package HackerRank.Days30;

import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.io.*;
import java.util.*;

/**
 * Day 24: More Linked Lists
 *
 * Task
 A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

 A removeDuplicates function is declared in your editor, which takes a pointer to the  node of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.

 Note: The  pointer may be null, indicating that the list is empty. Be sure to reset your  pointer when performing deletions to avoid breaking the list.
 */
class LLNode{
    int data;
    LLNode next;
    LLNode(int d){
        data=d;
        next=null;
    }

}

class MoreLinkedLists
{

    public static LLNode removeDuplicates(LLNode head) {
        //Write your code here

        //remove empty head
        if(head == null){
            return head;
        }

        //동일 객체
        LLNode current = head;

        //동일 data 비교 위한 hashmap
        //Map<Integer, LLNode> alldata = new HashMap<>();
        //hashmap에 전체 data 넣기
        //array로 사용
        List<Integer> alllist = new ArrayList<>();

        //새로운 linked list = uniq
        //head.data -> uniq
        LLNode uniq = new LLNode(head.data);
        //head.data -> hashmap or array
        alllist.add(head.data);

        while (current.next != null){
            //contains 비교를 위해 current 첫번째 link 버리기
            current = current.next;
            //c와 hashmap contains 비교
            if (!alllist.contains(current.data)) {
                insert(uniq, current.data);
                alllist.add(current.data);
            }
        }

        return uniq;

    }

    /** Editorial version
     *
     * @param head
     * @return
     */
    public static LLNode removeDuplicates2(LLNode head) {

        // if head is null or list only has 1 element
        if( head == null || head.next == null){
            return head;
        }

        // if list is more than 2 elements
        LLNode current = head;
        while( current.next != null ){
            // If current is a duplicate of previous
            if( current.data == current.next.data ){
                // set previous' next pointer to skip over current node
                current.next = current.next.next;
            }
            else{ // node is not duplicate of previous
                current = current.next;
            }
        }
        return head;
    }

    public static  LLNode insert(LLNode head,int data)
    {
        LLNode p = new LLNode(data);

        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            LLNode start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(LLNode head)
    {
        LLNode start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LLNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        //head=removeDuplicates(head);
        //display(head);
        System.out.println();
        System.out.println("------------------------------------");
        head=removeDuplicates2(head);
        display(head);

    }
}