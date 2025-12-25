module zoo.animal.talks {
    exports zoo.animal.talks.content; //explain ?
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;
    requires zoo.animal.feeding;
    requires zoo.animal.care;

    //for snippet 13

//    exports zoo.animal.talks.content to zoo.staff; //make sure to comment other
}