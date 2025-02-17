package com.zuabir.oop.objectClass;

public class ObjectClass {
    int n ;
    public ObjectClass(int num){
        this.n = num;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
public static void main(String[] args) {
    ObjectClass number = new ObjectClass(34);
//    System.out.println(number.hashCode());
    System.out.println(number.getClass());
}
}
