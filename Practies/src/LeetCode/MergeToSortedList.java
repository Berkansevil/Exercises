package LeetCode;

public class MergeToSortedList {

    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        if(list1 == null && list2==null) return  null;
        if(list1==null ) return list2;
        if(list2==null ) return list1;
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(list1 != null && list2!=null){
            if(list1.val==list2.val){
                temp.next=list1;
                list1=list1.next;
            } else if (list1.val< list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null  && list2!=null){

        }
        return  dummy.next;
    }
}
