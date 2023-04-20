package com.srkit.dao;

import com.srkit.entity.Person;

public interface PersonDAO 
{
   void savePerson(Person person);
   
   Person fetchPerson(Integer personId);
   
   void removePerson(Integer personId);
}
