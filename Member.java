package g;

public class Member {
	private String id;
	private int number;
	// + private 변수는 getter setter 가 필요함
	
	//기본 생성자 생성
	public Member() {
		//그냥 둬도 이 값들이 들어가지만, 의도를 명시함으로써 신뢰성 확보
		id = null;
		number = 0;
	}
	
	public Member(String id, int number) {
		this.id = id;
		this.number = number;
	}
	
	//getter setter 주의할 사항
	//과연 필요한가?
	//생성자와의 유기성이 있나?
	//getter setter에 추가적으로 넣어줘야 할 사항이 있나?
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	

	@Override
	public boolean equals(Object obj)
	//Object
	//equals는 모든 클래스의 상위 클래스인 Object의 메소드이다.
	//Member 끼리만 아닌, 개 소 말 닭 등 여러가지와 비교하기 위함 
	{
		if(obj instanceof Member) //obj가 member의 인스턴스인가?
		{
			Member mem = (Member) obj;// member로 캐스팅
			
			if((id.equals(mem.id))&&(number == mem.number)) 
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		String str;
		str = "id :"+this.id+", num = "+this.number;
		return str;
	}
	
}
