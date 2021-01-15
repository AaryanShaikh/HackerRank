import java.util.*;
class Hack14{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
        	boolean check = true;
            Stack<Character> s = new Stack<Character>();
            String str=in.next();
            for (int i=0;i<str.length() ;i++ ) {
                if (str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='<') {
                    s.push(str.charAt(i));
                }
                else if(str.charAt(i)==')'){
                    try{
                    	if (s.peek()=='(') {
                        s.pop();
	                    }else{
	                        check = false;
	                        break;
	                    }
                    }catch(Exception e){
                    	check = false;
                    	break;
                    }
                }
                else if(str.charAt(i)=='}'){
                    try{
                    	if (s.peek()=='{') {
                        s.pop();
	                    }else{
	                        check = false;
	                        break;
	                    }
                    }catch(Exception e){
                    	check = false;
                    	break;
                    }
                }else if(str.charAt(i)==']'){
                    try{
                    	if (s.peek()=='[') {
                        s.pop();
	                    }else{
	                        check = false;
	                        break;
	                    }
                    }catch(Exception e){
                    	check = false;
                    	break;
                    }
                }
            }
            if (s.isEmpty()&&check) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}