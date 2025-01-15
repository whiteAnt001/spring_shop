package dao;

import java.util.List;

import model.Notice;
import model.StartEnd;

public interface NoticeDao {
	List<Notice> getNoticeList(StartEnd se); //공지글 전체를 글번호 순서대로 조회하는 메서드
}
