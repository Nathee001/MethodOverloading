class A {
   static void b(int x){
        System.out.println("Arguments = "+ 5);
    }
    static void b(int y,int z){
        System.out.println("Arguments = "+y+" and "+z);
    }

    public static void main(String[] args) {

        b(5,8);
        b(5);
    }
}
