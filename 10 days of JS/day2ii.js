function vowelsAndConsonants(s) {
    for(let i=0;i<s.length;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            console.log(s.charAt(i));
        }else{
            continue;
        }
    }
    for(let i=0;i<s.length;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            continue;
        }else{
            console.log(s.charAt(i));
        }
    }
}