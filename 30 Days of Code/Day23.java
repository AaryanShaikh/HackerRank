static void levelOrder(Node root){
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()){
          Node temp = q.remove();
          System.out.print(temp.data+" ");
          if(temp.left!=null){q.add(temp.left);}
          if(temp.right!=null){q.add(temp.right);}
      }
    }