package sample;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.DefaultApplicationContext;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;

@Controller("/team")
public class TeamController {

    @Inject
    DataSource dataSource;


    @Get("/data")
    String getData() {

        String s = null;
        try {
            s = dataSource.getConnection().getSchema();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return s;
    }

}
