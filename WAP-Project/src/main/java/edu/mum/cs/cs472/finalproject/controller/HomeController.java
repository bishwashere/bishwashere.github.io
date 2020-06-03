package edu.mum.cs.cs472.finalproject.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

@WebServlet(
        description = "LoginController",
        urlPatterns = {
                "/home"
        })
public class HomeController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int [] debitData= new int[12];
        int [] creditData=  new int[12];

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        cal.clear();
        cal.set(Calendar.YEAR, year);

        for (int currentMonth = 0; currentMonth < 12; currentMonth++) {

            cal.set(Calendar.MONTH, currentMonth);

            //first day :
            cal.set(Calendar.DAY_OF_MONTH, 1);
            Date firstDay = cal.getTime();

            //last day
            cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
            Date lastDay = cal.getTime();

            debitData[currentMonth]=currentMonth;
            creditData[currentMonth]=12-currentMonth;
        }

        request.setAttribute("debitData", debitData);
        request.setAttribute("creditData", creditData);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float billPaymentPerc = (12 * 100.0f) / 50;
        billPaymentPerc = Float.valueOf(decimalFormat.format(billPaymentPerc));

        float fundTransferPerc = (18* 100.0f) / 50;
        fundTransferPerc = Float.valueOf(decimalFormat.format(fundTransferPerc));

        float otherSpendingPerc = (20 * 100.0f) / 50;
        otherSpendingPerc = Float.valueOf(decimalFormat.format(otherSpendingPerc));

        float [] pieChartData= {fundTransferPerc, billPaymentPerc ,otherSpendingPerc};

        System.out.println("pieChartData =>"+pieChartData.toString());
        request.setAttribute("pieChartData",pieChartData);

        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
    }
}
