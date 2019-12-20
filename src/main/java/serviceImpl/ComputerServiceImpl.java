package serviceImpl;

import entity.Computer;
import mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ComputerService;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    ComputerMapper cpm;

    @Override
    public int deleteByPrimaryKey(Integer cId) {
        return cpm.deleteByPrimaryKey(cId);
    }

    @Override
    public Computer selectByPrimaryKey(Integer cId) {
        return cpm.selectByPrimaryKey(cId);
    }

    @Override
    public int updateByPrimaryKey(Computer record) {
        return cpm.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Computer record) {
        return cpm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Computer record) {
        return cpm.insertSelective(record);
    }

    @Override
    public int insert(Computer record) {
        return cpm.insertSelective(record);
    }
}
