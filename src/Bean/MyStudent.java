/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class MyStudent{ //introspector class
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException  {
        BeanInfo bInfo= Introspector.getBeanInfo(Student.class);
        PropertyDescriptor propertyDescriptor[]=bInfo.getPropertyDescriptors();
        System.out.println("Properties: ");
        for(int i=0; i<propertyDescriptor.length; i++)
            System.out.println("\t"+propertyDescriptor[i].getName());    
    }
    
}
