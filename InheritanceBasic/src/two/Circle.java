package two;

public class Circle {

//	int x = 0;
//	int y = 0;
	
	Point point = new Point();
	int r = 0;	//반지름	//연결을 시켜놔서 따라올 수 있다. 콩나물 시루같은 느낌이기 때문에 어렵다. 현업에선 잘 안씀.
						//상속을 더 씀. 얘는 나중에 대체됨(디펜던시 관계로)
						//커뮤니티에서 이거 쓸 거냐 말 거냐로 전쟁했는데 안쓰기로 했대.
	
}

//	클래스 간의 관계 - 포함(composite) 관계
	
//상속 관계: ~은 ~이다.(is a)
//포함 관계: ~은 ~을 가지고 있다.(has a)
//
//ex:
//원은 도형이다
//점은 원이다
//원은 도형을 가지고 있다
//원은 점을 가지고 있다
//
//음소거 TV는 TV이다