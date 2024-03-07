package org.Ncc.Mar.t05.abstractEx;

public class Log extends Profile{
    Person[] arr;
    int n;
    int cnt=0;

    Log(int n) {
        arr = new Person[n];
        this.n = n;
    }

    public Person getArr(int i) {
        return arr[i];
    }

    @Override
    void add(String name, String id) {
        arr[cnt] = new Person(name,id);
        cnt++;
    }

    @Override
    String check(String id) {

        for (int i=0; i<n; i++){
            System.out.println("sibal");
            if (id.compareTo(arr[i].getId())==0){

                return arr[i].getName();
            }
            System.out.println(arr[i].getName());
        }
        return "missing id";
    }
}
