package ru.imv;

public class PageFormGenerator
{
    public static String getPageHtmlMarkup( )
    {
        StringBuilder htmlText = new StringBuilder( "<!DOCTYPE html>" );

        htmlText.append( "<html lang=\"ru\">\n"
                         + "<head>\n"
                         + "    <meta charset=\"UTF-8\">\n"
                         + "    <title>Form Post</title>\n"
                         + "</head>\n"
                         + "<body>\n"
                       );
        htmlText.append( PageFormGenerator.formHtml( ) );

        htmlText.append( "</body>\n"
                         + "</html>"
                       );

        return htmlText.toString( );
    }

    private static String formHtml( )
    {
        StringBuilder html = new StringBuilder( );
        html.append( "    <form method=\"post\" "
                     + " action=\"./process\">\n"
                     + "        <div>\n"
                     + "            <label>session-id:<input type=\"number\"></input></label>\n"
                     + "        </div>\n"
                     + "        <br/>\n"
                     + "        <div>\n"
                     + "            <input type=\"submit\" value=\"Отправить\"/>\n"
                     + "        </div>\n"
                     + "    </form>\n"
                   );
        return html.toString( );
    }
}
