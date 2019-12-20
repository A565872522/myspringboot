package service;

import entity.Computer;

public interface ComputerService {
    int deleteByPrimaryKey(Integer cId);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}
