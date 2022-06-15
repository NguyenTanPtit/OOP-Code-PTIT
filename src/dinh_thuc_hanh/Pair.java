package dinh_thuc_hanh;

public class Pair <I,N extends Number>{
    private  int n;
    private int n1;

    public Pair(int n, int n1) {
        this.n = n;
        this.n1 = n1;
    }
    private boolean prime(int k){
        if(k<2) return false;
        for(int i=2;i<=Math.sqrt(k);i++){
            if(k%i==0)
                return false;
        }
        return true;
    }
    public boolean isPrime(){
        return prime(n) && prime(n1);
    }

    @Override
    public String toString() {
        return n+" "+n1;
    }
}
