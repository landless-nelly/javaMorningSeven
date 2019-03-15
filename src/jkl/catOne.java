package jkl;

public class catOne {
    String name, hostel;
    Integer adm, age;

    public catOne(String name, String hostel, Integer adm, Integer age) {
        this.name = name;
        this.hostel = hostel;
        this.adm = adm;
        this.age = age;
    }
    public  String tostring (){
        return name+" "+ hostel+" " +adm +" "+age +"\n \n";

    }

}