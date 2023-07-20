package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mapper.PhonebookMapper;
import vo.PhonebookVO;

@Repository
public class PhonebookDAO implements PhonebookDAOInter{

	@Autowired
	PhonebookMapper mapper;
	
	@Override
	public int insert(PhonebookVO pb) {
		return mapper.insert(pb);
	}

	@Override
	public List<PhonebookVO> getList() {
		return mapper.getList();
	}

	@Override
	public List<PhonebookVO> find(String search) {
		return mapper.find(search);
	}

	@Override
	public PhonebookVO findOne(int idx) {
		return mapper.findOne(idx);
	}

	@Override
	public int update(PhonebookVO pb) {
		return mapper.update(pb);
	}

	@Override
	public int delete(int idx) {
		return mapper.delete(idx);
	}

}
