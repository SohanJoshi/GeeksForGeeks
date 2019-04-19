package com.hello.examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private LocalDate dob;
    private List<Subject> subjects;
    
    Student(String name, LocalDate dob, List<Subject> subjects) {
        this.setName(name);
        this.setDob(LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDayOfMonth()));
        this.setSubjects(new ArrayList<>());
        for(Subject subject : subjects)
            this.getSubjects().add(new Subject(subject.getName(), subject.getTextBooks()));
    }
    
    public final String getName() {return this.name;}
    public final  LocalDate getDob() {return LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDayOfMonth());}
    public  final List<Subject> getSubjects() {
        List<Subject> newSubjects = new ArrayList<>();
        for(Subject subject : subjects)
            newSubjects.add(new Subject(subject.getName(), subject.getTextBooks()));
         return newSubjects;
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}

class CustomStudent extends Student{

    CustomStudent (String name, LocalDate dob, List<Subject> subjects) {
        super(name, dob, subjects);
        this.setName(name);
        this.setDob(LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDayOfMonth()));
        this.setSubjects(new ArrayList<>());
        for(Subject subject : subjects)
            this.getSubjects().add(new Subject(subject.getName(), subject.getTextBooks()));
    }

}
class Subject {
    private String name;
    private List<String> textBooks;

    Subject(String name, List<String> textBooks) {
        this.name = name;
        this.textBooks = new ArrayList<String>();
        for(String textBook : textBooks)
            this.textBooks.add(textBook);
    }
    
    public String getName() {return this.name;}
    public List<String> getTextBooks() {return new ArrayList<>(this.textBooks);} 

}
