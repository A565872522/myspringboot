package mapper;

import entity.Computer;

public interface ComputerMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}