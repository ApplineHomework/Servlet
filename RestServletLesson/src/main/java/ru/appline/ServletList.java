package ru.appline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.appline.logic.Model;
import ru.appline.logic.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(urlPatterns = "/get")
public class ServletList extends HttpServlet {

    Model model = Model.getInstance();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));

        if (id == 0) {
            pw.print(gson.toJson(model.getFromList()));

            //если ID больше 0, то мы мы проводим проверку
        } else if (id > 0) {
            //если ID больше размера мапы, то "такого пользователя нет"
            if (id > model.getFromList().size()) {
                pw.print("Пользователь не найден");

            //если нет, то выводим данные данного пользователя
            } else {
                pw.println(gson.toJson(model.getFromList().get(id).getName()));
                pw.println(gson.toJson(model.getFromList().get(id).getSurname()));
                pw.println(gson.toJson(model.getFromList().get(id).getSalary()));
            }

            //если мы выводим отрицательное значение, то выводим ошибку
        } else {
            pw.print("Введите положительное число");
        }
    }


}
