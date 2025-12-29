module zoo.animal.care {
    exports zoo.animal.care.medical;
    requires zoo.animal.feeding;

    //for snippet 14

//    requires transitive zoo.animal.feeding;

    //for snippet 33 - disable other, this is for demo only

//    exports zoo.animal.care.medical to zoo.staff;
//    requires transitive zoo.animal.feeding;
}