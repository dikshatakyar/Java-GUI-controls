/*Write a program that copies content of one file to another. Pass the
names of the files through command-line arguments.*/


import java.io.*;

class fileCopy{
    public static void main(String args[]){
        FileInputStream f1=null;
        FileOutputStream f2=null;
    int x;
        if(args.length!=2){
            System.out.println("File cannot be named");
        }
try{
        f1=new FileInputStream(args[0]);
    }
    catch(FileNotFoundException a){
        System.out.println("error in opening file");
    }

    try{
        f2=new FileOutputStream(args[1]);
    }
    catch(FileNotFoundException a){
        System.out.println("error in opening file");
    }

    try{
        do{
         x=f1.read();
         if(x!=-1){
             f2.write(x);
         }
    }while(x!=-1);
}
catch(IOException a){
System.out.println(a);
}

}
}