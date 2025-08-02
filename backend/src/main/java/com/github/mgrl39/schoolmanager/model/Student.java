// This is where is the class, inside the package "model".
// "model" contains the classes that represents the data of the application
package com.github.mgrl39.schoolmanager.model;

// easy way to define immutable data.
// Record generates automatically:
// - Constructor, getters, methods: equals(), hashode(), toString()
//

// Meterle el CourseId
public record Student(long id, String firstName, String lastName, String email, String dni, String phoneNumber) {
    // the body of a record is empty, we don´t need more thins
    // the compiler will create constructors, getters, equals, hashocde, tostring...
}
