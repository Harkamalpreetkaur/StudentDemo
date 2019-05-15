/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareclass_02;

/**
 *
 * @author kamal
 */
public class SoftwareClasss {
     public static void main(String[] args) {
         SoftwareClass s1 = new SoftwareClass();
         s1.setName("sivagama");
         //System.out.println(s1.getName());
         SoftwareClass s2 = new SoftwareClass("Daniel");
         SoftwareClass s3 = new SoftwareClass("Arsh");
         SoftwareClass[] list = new SoftwareClass[3];//array of objects
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        System.out.println(list[i].getName());
                 
     }
    
}
