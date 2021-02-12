Difference(int elements[]){
        this.elements = elements;
    }
    void computeDifference(){
        maximumDifference = Math.abs(Arrays.stream(elements).min().getAsInt()-Arrays.stream(elements).max().getAsInt());
    }