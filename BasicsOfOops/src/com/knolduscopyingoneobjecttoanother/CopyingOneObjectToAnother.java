package com.knolduscopyingoneobjecttoanother;
public class CopyingOneObjectToAnother {

    int id;
    String name;
    CopyingOneObjectToAnother(int id,String name){
        this.id = id;
        this.name = name;
    }
    CopyingOneObjectToAnother(CopyingOneObjectToAnother oneObjectToAnother) {
        this.id = oneObjectToAnother.id;
        this.name = oneObjectToAnother.name;
    }
    public static void main(String[] args) {

        CopyingOneObjectToAnother oneObjectToAnotherFirst =  new CopyingOneObjectToAnother(1852,"Rishika");
        System.out.println("oneObjectToAnotherFirst id is: "+oneObjectToAnotherFirst.id);
        System.out.println("oneObjectToAnotherFirst name is: "+oneObjectToAnotherFirst.name);

        CopyingOneObjectToAnother oneObjectToAnotherSecond =  new CopyingOneObjectToAnother(oneObjectToAnotherFirst);
        System.out.println("oneObjectToAnotherSecond id is: "+oneObjectToAnotherSecond.id);
        System.out.println("oneObjectToAnotherSecond name is: "+oneObjectToAnotherSecond.name);

    }

}
