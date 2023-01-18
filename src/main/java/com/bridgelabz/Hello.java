package com.bridgelabz;

public class Hello {
    public static void main(String[] args){
        int i, s=0, c=0;
        for(i=0;i<args.length;i++){
            try{
                s+=Integer.parseInt(args[i]);
            }
            catch(NumberFormatException ex){
                c++;
            }
        }
        System.out.println("sum of command line arguments is "+s);
        System.out.println("Number of invalid integers are "+c);
    }
}

//.gitignore

