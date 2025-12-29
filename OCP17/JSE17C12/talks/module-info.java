module zoo.animal.talks {
//    exports zoo.animal.talks.content; //explain ?
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;
    requires zoo.animal.feeding;
    requires zoo.animal.care;

    //for snippet 13

    exports zoo.animal.talks.content to zoo.staff; //make sure to comment other

    //for snippet 15 - comments out ... and turn off comment for snippet 14

    //for snippet 16

//    opens zoo.animal.talks.schedule;
//    opens zoo.animal.talks.media to zoo.staff;
}

//for snippet 17

//open module zoo.animal.talks{
//        exports zoo.animal.talks.media;
//        exports zoo.animal.talks.schedule;
//        requires zoo.animal.feeding;
//        requires zoo.animal.care;
//}

//for snippet 18

//open module zoo.animal.talks{
//    opens zoo.animal.talks.content
//}