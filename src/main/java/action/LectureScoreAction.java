package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.StudentListService;
import vo.ActionForward;
import vo.StudentBean;

public class LectureScoreAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		int option = Integer.parseInt(request.getParameter("type"));
        String searchWord = request.getParameter("searchWord");
		
        ActionForward forward = null;
        
        forward = new ActionForward();
        StudentListService scoreSearchService = new StudentListService();
        ArrayList<StudentBean> studentSearchResult = scoreSearchService.getSearchList(option,searchWord);
        
        request.setAttribute("studentSearchList", studentSearchResult);
        forward.setPath("./서치후띄울페이지경로");
        
		return forward;
	}
}
