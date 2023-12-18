package com.arnob.stds;

import java.util.Scanner;

public class student {
    private String name;
    private String id;

    public student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void PrintCourses(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name= sc.nextLine();
        this.setName(name);
        System.out.println("ID: ");
        String id = sc.nextLine();
        this.setId(id);
        System.out.println("Number of Course: ");
        int noc = sc.nextInt();
        course[] cr = new course[noc];
        for (int i = 0; i<noc; i++){
            Scanner sc2 = new Scanner(System.in);
            cr[i] = new course();
            System.out.print("Couse Code: ");
            String cid= sc2.nextLine();
            cr[i].setId(cid);
            System.out.println("Title: ");
            String title= sc2.nextLine();
            cr[i].setTitle(title);
            System.out.println("Credit: ");
            String cred= sc2.nextLine();
            cr[i].setCredit(cred);
        }
        System.out.println("Index ---- Course id ---- Title ---- Credit");
        for (int i = 0; i< noc; i++){
            System.out.println(i+"           "+cr [i].getId() +"           "+cr[i] .getTitle()+"              "+cr [i].getCredit());
        }
    }


}
