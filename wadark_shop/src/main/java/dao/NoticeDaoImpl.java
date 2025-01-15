package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Notice;
import model.StartEnd;

@Repository
public class NoticeDaoImpl implements NoticeDao {
	@Autowired
	private SqlSession session;
	@Override
	public List<Notice> getNoticeList(StartEnd se) {
		return this.session.selectList("noticeMapper.getNoticeList", se);
	}

}
