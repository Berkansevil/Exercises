package LeetCode;



public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){


    }

    public static void main(String[] args) {
        ListNode l1=new ListNode();
        ListNode l2=new ListNode();
        ListNode l3=new ListNode();


        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        ListNode print=l1;
        while(print !=null){
            System.out.println(print.val);
            print=print.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode returnNode=new ListNode();
        ListNode headNode=returnNode;
        while(list1 != null && list2 !=null){
            if(list1.val<= list2.val){
                returnNode.next=list1;
            }else{
                returnNode.next=list2;
                list2=list2.next;
            }
            returnNode =returnNode.next;
        }
        if(list1==null){
            returnNode.next=list2;
        } else if (list2==null) {
            returnNode.next=list1;
        }
        return headNode.next;
    }
}
