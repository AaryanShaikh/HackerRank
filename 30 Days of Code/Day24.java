public static Node removeDuplicates(Node head) {
        Node temp = head, first = null;
        while(temp.next!=null){
            if((temp.data==temp.next.data)&&(first==null)){
               first = temp; 
            }else if((temp.data!=temp.next.data)&&(first!=null)){
               first.next = temp.next;
               first = null; 
            }
            temp = temp.next;
        }
        if(first!=null){
            first.next = null;
        }
        return head;
    }