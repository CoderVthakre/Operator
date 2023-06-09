package OperatorAssign;

public class Maxmin {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d,e,f,g;
        d=a+(b*c);
        e=a+(a/b);
        f=a%(b+c);
        g=a*(b+c);
        if(d>e || d>f ||d>g){
            System.out.println("max"+d);

        }
        else if(d<e || d<f || d<g ){
            System.out.println("min"+d);
        }
    }
}
