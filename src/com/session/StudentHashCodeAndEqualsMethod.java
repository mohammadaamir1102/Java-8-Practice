package com.session;

public class StudentHashCodeAndEqualsMethod {
    private  Long id;
    private String name;

    public StudentHashCodeAndEqualsMethod() {
    }

    public StudentHashCodeAndEqualsMethod(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((StudentHashCodeAndEqualsMethod) obj).id;
    }

    @Override
    public int hashCode() {
        return Math.toIntExact(this.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
