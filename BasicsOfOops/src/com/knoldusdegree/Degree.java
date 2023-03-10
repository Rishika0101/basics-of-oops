package com.knoldusdegree;

public class Degree {
    public void getDegree(){
        System.out.println("I got a degree.");
    }
}
class Undergraduate extends Degree{
    public void getDegree(){
        System.out.println("I am an Undergraduate.");
    }

}
class Postgraduate extends Degree{
    public void getDegree(){
        System.out.println("I am an Postgraduate.");
    }

}
class Main{
    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getDegree();

        Undergraduate undergraduateDegree = new Undergraduate();
        undergraduateDegree.getDegree();

        Postgraduate postgraduateDegree = new Postgraduate();
        postgraduateDegree.getDegree();
    }
}
