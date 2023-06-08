package org.example;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullname;


    @Override
    public int compareTo(Student o) {

        return fullname.compareTo(o.fullname);
    }
}












