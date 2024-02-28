package org.example.Ncc.Feb.B27;

class XY{
    int x, y;

    void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    void show(){
        System.out.println(this.x+ "," + this.y);
    }
}
class XYZ extends XY{
    String name;

    void setName(String name) {
        this.name = name;
    }

    void pr(){
        show();
        System.out.println(name);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        XY x = new XY();
        x.set(4,8);
        x.show();

        XYZ xyz = new XYZ();
        xyz.set(3,5);
        xyz.setName("창호");
        xyz.pr();
    }
}
