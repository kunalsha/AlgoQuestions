package com.practice.ds.theory;

import java.time.Instant;
import java.util.*;

public class MultiCriteriaSorting {

    public static void main(String[] args) {
        MultiCriteriaSorting app = new MultiCriteriaSorting();

        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", Date.from(Instant.now()), new Employee.Address("AAA")),
                new Employee(2, "B", Date.from(Instant.now()), new Employee.Address("BBB")),
                new Employee(3, "C", Date.from(Instant.now()), new Employee.Address("CCC")),
                new Employee(4, "D", Date.from(Instant.now()), new Employee.Address("DDD")),
                new Employee(5, "E", Date.from(Instant.now()), new Employee.Address("EEE"))
                );

        app.multiSorting(employees);

        employees.forEach(System.out::println);
    }

    public void multiSorting(List<Employee> emps) {
        Collections.sort(emps, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if(e1 == null || e2 == null)
                    return -1;
//
//                if(e1.getId() != e2.getId()){
//                    if(e1.getId() - e2.getId() > 0)
//                        return -1;
//                    else
//                        return 1;
//                }else {
//                    if(!e1.getName().equalsIgnoreCase(e2.getName())){
//                        if(e1.getName().compareTo(e2.getName()) > 0){
//                            return -1;
//                        }else {
//                            return 1;
//                        }
//                    }else {
//                        if(!e1.getName().equalsIgnoreCase(e2.getName())) {
//                            if (e1.getDob().compareTo(e2.getDob()) > 0) {
//                                return -1;
//                            } else {
//                                return 1;
//                            }
//                        }else {
//                            if(e1.getAddress()!= e2.getAddress()) {
//                                if (e1.getAddress().getAddress().compareTo(e2.getAddress().getAddress()) > 0) {
//                                    return -1;
//                                } else {
//                                    return 1;
//                                }
//                            }else {
//                                return 1;
//                            }
//                        }
//                    }
//
//                }
            return 0;
            }
        });
    }
}

class Employee {
    private int id;
    private String name;
    private Date dob;
    public Address address;

    public static class Address {
        private String add;

        public Address(String add) {
            this.add = add;
        }

        public String getAddress(){
            return add;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "add='" + add + '\'' +
                    '}';
        }
    }

    public Employee(int id, String name, Date dob, Address add) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(dob, employee.dob) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dob, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
