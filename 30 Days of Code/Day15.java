 static Node root,temp;
    public static  Node insert(Node head,int data) {
        if(root==null){
            root = temp = new Node(data);    
        }else{
            temp = temp.next = new Node(data);
        }
        return root;
    }