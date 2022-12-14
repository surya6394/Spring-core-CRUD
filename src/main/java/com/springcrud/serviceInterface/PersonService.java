package com.springcrud.serviceInterface;

import java.util.List;

import com.springcrud.bean.Person;

public interface PersonService {

	public void addPerson(Person person);
	 
    public void editPerson(Person person, int personId);
 
    public void deletePerson(int personId);
 
    public Person find(int personId);
 
    public List < Person > findAll();
	
}
