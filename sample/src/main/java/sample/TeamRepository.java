package sample;

import sample.dao.TeamDao;

import java.util.List;

public interface TeamRepository {
    public List<TeamDao> findAll();
}
