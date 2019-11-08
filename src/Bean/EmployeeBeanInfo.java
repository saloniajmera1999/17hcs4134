/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author c3
 */
public class EmployeeBeanInfo extends SimpleBeanInfo{
    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try {
            PropertyDescriptor pd1=new PropertyDescriptor("empId", Employee.class);
            PropertyDescriptor pd2=new PropertyDescriptor("name", Employee.class);
            PropertyDescriptor pd3=new PropertyDescriptor("age", Employee.class);
            PropertyDescriptor[] pd={pd1,pd2,pd3};
            return pd;
            } catch (IntrospectionException ex) {
            System.out.println("Exception: "+ex);
        }
        return null;
    }
    
}
