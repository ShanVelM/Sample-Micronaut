package sample;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.DefaultApplicationContext;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import sample.dao.TeamDao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.util.List;

@Validated
@Controller("/team")
public class TeamController {


   protected final TeamRepository teamRepo;

   public TeamController(TeamRepository teamRepo) {
       this.teamRepo = teamRepo;
   }


    @Get("/data")
    String getData() {

        String s = null;

            List<TeamDao> teamList = teamRepo.findAll();




            //s = dataSource.getConnection().getSchema();
            /*Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from team");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3));
                s = resultSet.getString(2);
            }
            connection.close();*/



        return ((TeamDao)teamList.get(0)).getName();
    }

}
