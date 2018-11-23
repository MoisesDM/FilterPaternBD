/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Filter.Concrete;

import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.Filter.Criteria.Criterial;

/**
 *
 * @author moy-c
 */
public class CriteriaNombre implements Criterial{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> nomPersons = new ArrayList<Person>();
        for (Person person : persons){
            if(person.getGenero().equalsIgnoreCase("Nombre")){
                nomPersons.add(person);
            }
        }
        return nomPersons;
    }
    
        
    }
    
}
