package Object_oriented_Programming;

class Calculator {

    int left, right;

    public void setOperands(int left,int right){
        this.left= left;
        this.right= left;
    }

    public void sum(){
        System.out.println(left+right);
    }


    public void avg(){
        System.out.println((left+right)/2);
    }
}

