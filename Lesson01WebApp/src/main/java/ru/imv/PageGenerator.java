package ru.imv;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PageGenerator
{
    private static Integer generation = 0;

    public static String getPageHtmlMarkup( )
    {
        StringBuffer htmlText = new StringBuffer( "<html>" );

        htmlText.append( "<body>" );
        htmlText.append( "<p> page generation: <strong>" + ++generation + "</strong></p>"  );
        Long rnd = Double.valueOf(Math.random( ) * 1000000000000.0).longValue( );
        htmlText.append( "<p> random number: <strong>" + rnd + "</strong></p>"  );
        htmlText.append( "<p> current time is: <strong>" + LocalDateTime.now().format( DateTimeFormatter.ofPattern( "HH:mm:ss" ) ) + "</strong></p>" );
        htmlText.append( "</body>" );

        htmlText.append( "</html>" );

        return htmlText.toString( );
    }
}
