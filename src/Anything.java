class Anything {
   static void any(){
        int a=4;
        int b=7;
        int c=a+b;
       System.out.println(c);
    }
  static   int any(int x){
        x=3+5+7+8;
        return x;
    }
   static void any(int y,String z){
        y=13;
        z="Millions";
       System.out.println(y +z);
    }

    public static void main(String[] args) {
        any();
        any(6,"call");
        System.out.println(any(2));
    }
}
