public class Calcula {
    public void m1(int a,int b,int c){

        System.out.println("Addition of "+a+","+b+" and "+c+" =" + (a+b+c));

    }

    public static void main(String[] args){
        Calcula calcula = new Calcula();
        calcula.m1(242,353,726);
    }
}

