package array_basic.program1;
class Program1{
    public static void main(String[] args) {
        int[] a = { 10, 20, 15, 30, 24, 28};
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("===============");
        for(int n: a){
            System.out.println(n);
        }

    }
}