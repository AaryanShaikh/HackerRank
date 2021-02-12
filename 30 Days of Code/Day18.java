static Stack<Character> sc = new Stack<Character>();
    static Queue<Character> qc = new LinkedList<Character>();
    static void pushCharacter(char c){
        sc.push(c);
    }
    static char popCharacter(){
        return sc.pop();
    }
    static void enqueueCharacter(char c){
        qc.add(c);
    }
    static char dequeueCharacter(){
        return qc.remove();
    }