package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.UserMiniBoardService;
import vo.ActionForward;
import vo.BoardBean;

public class AdminUserLayoutAction implements Action {
	
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		ActionForward forward = new ActionForward();
		
		UserMiniBoardService userBoard = new UserMiniBoardService();
		ArrayList<BoardBean> board = userBoard.getBoardList();
		request.setAttribute("board", board);
		
		forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/user/userLayout.jsp");
		return forward;
	}
}
