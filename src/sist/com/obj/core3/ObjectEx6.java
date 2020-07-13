package sist.com.obj.core3;

import java.util.Calendar;
import java.util.StringTokenizer;

public class ObjectEx6 {
	static String[][] people = new String[4][3];
	static String[] ddi = {"쥐      ", "소      ", "호랑이", "토끼   ", "용      ", "뱀      ", "말      ", "양      ", "원숭이", "닭      ", "개      ", "돼지   "};
	static int birthYear;
	static Person[] p = new Person[4];
	Calendar cal = Calendar.getInstance();
	

	public String strmaker1() {
		String s1 = "A";
		int i = 10;
		double d = 85.9;
		return s1 + "#" + i + "#" + d;
	}


	public void strMaker2() {
		String[] data = {"김선규#981210-1010547#02)567-1234", 
				"김동현#581010-1110547#031)967-5234",
				"채승호#950713-1900547#032)867-5234", 
				"김지나#990513-2101015#064)875-1254"};

		for (int i = 0; i < data.length; i++) {
			StringTokenizer st = new StringTokenizer(data[i], "#");
			for (int j = 0; j < 3; j++) {
				people[i][j] = st.nextToken();
			}
		}
	}
	
	public String getDdi(int i) {
		return ddi[(p[i].getBirthYear()+8)%12];
	}
	
	public String getSex(int i) {
		if(p[i].getBirthYear()<2000) {
			if(p[i].getPersonalNum().substring(7,8).equals("1")) return "남성";
			else return "여성";
		}else if(p[i].getPersonalNum().substring(7,8).equals("3")) return "남성";
		else return "여성";
	}
	
	public String getLocal(int i) {
		int j = Integer.parseInt(p[i].getPersonalNum().substring(8, 10));
		if(j>=0 && j<=8) return "서울";
		else if(j<=12) return "부산";
		else if(j<=15) return "인천";
		else if(j<=25) return "경기";
		else if(j<=34) return "강원";
		else if(j<=39) return "충북";
		else if(j==40) return "대전";
		else if(j<=47) {
			if(j==44)return "세종";
			else return "충남";
		}
		else if(j<=54) return "전북";
		else if(j<=64) return "전남";
		
		else if(j<=66) return "광주";
		else if(j>=67 && j<=69) return "대구";
		else if(j<=81) {
			if(j==76) return "대구";
			else return "경북";
		}
		else if(j<=93) {
			if(j==85) return "울산";
			else return "경남";
		}
		else if(j<=95) return "제주";
		else if(j==96) return "세종";
		else return "오류";
	}
	public String isTodayBirthday(int i) {
		String temp = cal.get(Calendar.MONTH)+1<=9?"0".concat(String.valueOf(cal.get(Calendar.MONTH)+1)):String.valueOf(cal.get(Calendar.MONTH)+1); //1월의 경우 0 이므로 +1 해주어야함
		String temp2 = cal.get(Calendar.DATE)<=9?"0".concat(String.valueOf(cal.get(Calendar.DATE))):String.valueOf(cal.get(Calendar.DATE));
		if(p[i].getBirthDay().equals(temp.concat(temp2))) return "맞다   ";
		else return "아니다";
	}
	
	// 이름, 나이, 오늘생일, 띠, 성별, 지역, 전화번호
	public static void main(String[] args) {
		ObjectEx6 o = new ObjectEx6();
		o.strMaker2();
		for(int i = 0; i<people.length; i++) {
			p[i] = new Person(people[i]);
		}
		
		for(int i = 0; i<people.length; i++) {
			System.out.println("이름 : "+p[i].getName()+" || 나이 : "+p[i].getAge()+" || 오늘생일 : "+ o.isTodayBirthday(i)+" || 띠 :"+o.getDdi(i)+" || 성별 : "+o.getSex(i)+" || 지역 : "+o.getLocal(i)+" || 전화번호 : "+p[i].getTel());
		}
		
	}
}


class Person{
	String name;
	int birthYear;
	String birthDay;
	int age;
	String personalNum;
	String tel;
	
	Calendar cal = Calendar.getInstance();
	
	Person(String[] people){
		name =  people[0];
		birthYear = (Integer.parseInt(people[1].substring(0, 2))>20?Integer.parseInt(people[1].substring(0, 2))+1900:Integer.parseInt(people[1].substring(0, 2))+2000);
		age = cal.get(Calendar.YEAR)-birthYear+1;
		birthDay = people[1].substring(2,6);
		personalNum = people[1];
		tel = people[2];
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPersonalNum() {
		return personalNum;
	}

	public void setPersonalNum(String personalNum) {
		this.personalNum = personalNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
