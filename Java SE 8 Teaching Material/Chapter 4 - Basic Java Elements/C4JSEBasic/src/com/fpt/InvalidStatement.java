//THIS IS FOR SECTION 4.4 - AFTER THE INITALIZER KNOWLEDGE
package com.fpt;

public class InvalidStatement {
    /*
     * We can't have any statements that doesn't belong to any
     * mentioned categories
     * */

    String id = ""; //this is a valid statement since it declares a instance variable

    id ="ddd";
    /*
     * This is an invalid statement since this is not
     * resides in any initializer block, constructor block
     * methods. Also, this isn't declaration statement*/
    {
        id = "ddd";
        /*
        * this is ok since this resides in a instance
        * initializer and not directly within a class*/
    }






    //This is single line comment

    /*
    * this is a multiline comment*/

    /*
    * this is a multiline comment
    *
    * //this is another single line comment within a multiline comment*/

    //JavaDoc Comments
    /**
     * - Observe the start of the comment, it starts with
     * 2 "*" instead of 1 "*" in normal comment format
     * - Each line start with a "*" (NOTE: Somehow
     * in inteliJ, the normal comment line also start
     * with a "*" at the beginning, other IDE such as
     * NetBean doesn't start with a "*")
     * - <h3>You can write HTML tags here</h3>
     * - Description about each parameter starts with @param
     * - Desription about return value starts with @return
     * - @see tag is used to add hyperlink to description of
     * another class
     * - @param name: the location of the image, relative to the url argument
     * - @return: the image at the specified URL
     * - @see: SomeOtherClassName*/




}
