/*
 * 작성자 : 이준호
 * 작성일 : 2017-04-11
 * 노매드커넥션 온라인 코딩테스트 답안
 */

import java.util.Stack;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d) {
		
		// 실수형인 데이터 타입 d를 정수형 int로 캐스팅하여 정수형으로 맞춰준다.
		int i = (int) d;
		
		// 실수형으로 바꾼 데이터를 2로 나누어 return 해준다.
		
		return i / 2;
	}// end of quest1()

	static boolean quest2(String s) {
		
		// 사용할 stack 선언. 변수명은 stk로 설정했다.
		Stack<Object> stk = new Stack<Object>();

		// 스택에 넣고 빼는 반복문
		for (int i = 0; i < s.length(); i++) {

			// 넘어온 데이터 s를 substring으로 쪼개어
			// 해당 데이터가 (, {, [ 일 경우 스택에 넣는다.(push)
			if (s.substring(i, i + 1).equals("(") 
					|| s.substring(i, i + 1).equals("{")
					|| s.substring(i, i + 1).equals("[")) {
				stk.push(s.substring(i, i + 1));
			} // end of if

			// ')' 가 넘어올 경우 스택이 비어 있거나 스택에서 꺼내온(pop)값에 '('가 없을 경우
			else if (s.substring(i, i + 1).equals(")")) {
				if (stk.empty() || !stk.pop().equals("(")) {
					// false를 return 한다.
					return false;
				} // end of if
			} // end of else if

			// '}' 가 넘어올 경우 스택이 비어 있거나 스택에서 꺼내온(pop)값에 '{'가 없을 경우
			else if (s.substring(i, i + 1).equals("}")) {
				if (stk.empty() || !stk.pop().equals("{")) {
					// false를 return 한다.
					return false;
				} // end of if
			} // end of else if

			// ']' 가 넘어올 경우 스택이 비어 있거나 스택에서 꺼내온(pop)값에 '['가 없을 경우
			else if (s.substring(i, i + 1).equals("]")) {
				if (stk.empty() || !stk.pop().equals("[")) {
					// false를 return 한다.
					return false;
				} // end of if
			} // end of else if	
		}
		
		// 위의 모든 동작이 끝난 후 스택이 비어 있는 경우 true, 비어있지 않으면 false를 리턴한다.
		if (stk.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}// end of quest2()
	
}// end of class Questing