package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.PhonebookVO;

public interface PhonebookMapper {
	public int insert(@Param("pb")PhonebookVO pb);
	public List<PhonebookVO> getList();
	public List<PhonebookVO> find(@Param("search")String search);
	public PhonebookVO findOne(@Param("idx")int idx);
	public int update(@Param("pb")PhonebookVO pb);
	public int delete(int idx);
}
