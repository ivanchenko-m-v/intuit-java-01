package ru.imv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

public class ProcessorServlet extends HttpServlet
{
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        resp.setCharacterEncoding( "UTF-8" );
        resp.setLocale( Locale.forLanguageTag( "ru_RU" ) );
        //генерация html-контента
        resp.getWriter( ).print( "ProcessorServlet" );
        //super.doPost( req, resp );
    }
}//public class ProcessorServlet
