package ru.imv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

public class HelloServlet extends HttpServlet
{
    /*
    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
    {
        //обновление страницы раз в секунду
        resp.setIntHeader( "Refresh", 1 );
        //генерация html-контента
        resp.getWriter( ).print( PageGenerator.getPageHtmlMarkup( ) );
        //отдача сервером статики
        //resp.sendRedirect( "index.html" );
    }
     */

    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
    {
        resp.setCharacterEncoding( "UTF-8" );
        resp.setLocale( Locale.forLanguageTag( "ru_RU" ) );
        //генерация html-контента
        resp.getWriter( ).print( PageFormGenerator.getPageHtmlMarkup( ) );
    }
}
