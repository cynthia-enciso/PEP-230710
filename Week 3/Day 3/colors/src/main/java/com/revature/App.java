package com.revature;

import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Attribute.*;

import com.diogonunes.jcolor.Ansi;
/**
 * Hello world!
 *
 */
public class App 
{
    // ANSI escape sequences are cods used to control various settings for terminals
    // https://en.wikipedia.org/wiki/ANSI_escape_code#Colors
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main( String[] args )
    {
        System.out.println( ANSI_PURPLE + "Hello World!" + ANSI_RESET);

        System.out.println(Ansi.colorize("This text will be yellow on magenta", YELLOW_TEXT(), MAGENTA_BACK()));
    }
}
