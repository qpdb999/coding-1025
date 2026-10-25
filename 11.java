
class Student {
    String name;
    int age;
    int score;

    // 생성자 오버로딩 1: 이름만 받기
    public Student(String name) {
        this.name = name;
        this.age = 17;
        this.score = 0;
    }

    // 생성자 오버로딩 2: 이름과 나이 받기
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.score = 0;
    }

    // 생성자 오버로딩 3: 이름, 나이, 점수 받기
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 메서드 오버로딩 1: 정보 출력
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("점수: " + score);
    }

    // 메서드 오버로딩 2: 인사말 출력
    public void introduce(String greeting) {
        System.out.println(greeting + ", 저는 " + name + "입니다.");
    }

    // 메서드 오버로딩 3: 인사말과 추가 내용 출력
    public void introduce(String greeting, String message) {
        System.out.println(greeting + ", 저는 " + name + "입니다.");
        System.out.println(message);
    }

    // 메서드 오버로딩 4: 점수 비교
    public void showScore(int bonus) {
        System.out.println("보너스 점수 포함: " + (score + bonus));
    }

    public void showScore(int bonus, int penalty) {
        System.out.println("보너스와 감점 적용: " 
                + (score + bonus - penalty));
    }
}

public class OverloadingExample {
    public static void main(String[] args) {

        // 생성자 오버로딩 사용
        Student student1 = new Student("민수");
        Student student2 = new Student("지우", 16);
        Student student3 = new Student("현우", 17, 85);

        System.out.println("=== 학생 1 ===");
        student1.showInfo();

        System.out.println("\n=== 학생 2 ===");
        student2.showInfo();

        System.out.println("\n=== 학생 3 ===");
        student3.showInfo();

        // 메서드 오버로딩 사용
        System.out.println("\n=== 인사말 ===");
        student3.introduce("안녕하세요");
        student3.introduce("반갑습니다", "자바를 공부하고 있습니다.");

        System.out.println("\n=== 점수 계산 ===");
        student3.showScore(5);
        student3.showScore(10, 3);
    }
}


/*

    오늘 배운 내용


1. 오버로딩(Overloading)
같은 클래스에서 이름이 같은 생성자나 메서드를
매개변수의 개수 또는 자료형을 다르게 정의하는 것이다.

2. 생성자 오버로딩
같은 클래스에서 매개변수가 다른 생성자를 여러 개 만드는 것이다.
객체를 생성할 때 전달하는 값에 따라 알맞은 생성자가 실행된다.

예:
new Student("민수");
new Student("지우", 16);
new Student("현우", 17, 85);

3. 메서드 오버로딩
같은 이름의 메서드를 매개변수 구성을 다르게 만들어
필요한 기능을 선택해서 사용할 수 있게 하는 것이다.

예:
introduce("안녕하세요");
introduce("반갑습니다", "자바를 공부하고 있습니다.");

4. 매개변수
메서드나 생성자를 실행할 때 전달받는 값을 저장하는 변수이다.

5. this
현재 객체의 필드나 메서드를 가리킬 때 사용한다.
예: this.name = name;



   
    생성자 오버로딩과 메서드 오버로딩의 차이


생성자 오버로딩
- 목적: 객체를 생성할 때 초기화하는 방법을 다양하게 제공한다.
- 이름: 클래스 이름과 같다.
- 반환 자료형: 작성하지 않는다.
- 호출: new를 사용해 객체를 생성할 때 실행된다.

메서드 오버로딩
- 목적: 비슷한 기능을 매개변수에 따라 다르게 사용할 수 있게 한다.
- 이름: 같은 이름으로 여러 개 정의한다.
- 반환 자료형: 작성한다. 예: void, int
- 호출: 객체나 클래스에서 메서드를 사용할 때 실행된다.



    복습하면서 알게 된 점


생성자 오버로딩은 객체마다 필요한 정보가 다를 때 유용하다.
이름만 전달하거나 이름과 나이, 점수를 모두 전달하는 방식으로
객체를 만들 수 있다.

메서드 오버로딩은 같은 기능을 입력값에 따라 다르게 실행할 때
사용할 수 있다.

중요한 점은 매개변수의 개수나 자료형 등이 달라야 한다는 것이다.
매개변수만 다르면 되고, 반환 자료형만 다르게 작성하는 것으로는
메서드 오버로딩을 할 수 없다.



    AI 활용 복습 문제


문제 1. 오버로딩의 특징으로 알맞은 것은?
1) 이름이 다른 메서드만 사용할 수 있다.
2) 같은 이름을 매개변수 구성을 다르게 하여 여러 개 정의한다.
3) 모든 메서드에 반복문을 넣어야 한다.
4) 객체를 만들 수 없게 한다.

정답: 2번


문제 2. 생성자의 특징으로 알맞은 것은?
1) 반드시 void를 작성한다.
2) 클래스 이름과 같고 반환 자료형을 작성하지 않는다.
3) 반드시 int를 반환한다.
4) 메서드 이름과 항상 달라야 한다.

정답: 2번


문제 3. 다음 코드에서 실행되는 생성자는?
Student student = new Student("민수");

1) 매개변수가 없는 생성자
2) Student(String name)
3) Student(String name, int age)
4) Student(String name, int age, int score)

정답: 2번


문제 4. 다음 두 메서드는 오버로딩일까?
void print(int num)
void print(String text)

1) 오버로딩이다.
2) 오버로딩이 아니다.
3) 생성자 오버로딩이다.
4) 실행할 수 없는 코드이다.

정답: 1번


문제 5. 다음 중 메서드 오버로딩이 불가능한 경우는?
1) 매개변수 개수가 다르다.
2) 매개변수 자료형이 다르다.
3) 매개변수 순서에 따라 자료형 구성이 다르다.
4) 반환 자료형만 다르고 매개변수는 같다.

정답: 4번


문제 6. 생성자 오버로딩을 사용하는 이유는?
1) 객체를 다양한 값으로 초기화하기 위해
2) 반복문을 제거하기 위해
3) 모든 필드를 삭제하기 위해
4) 메서드 호출을 금지하기 위해

정답: 1번


문제 7. this.name = name;의 의미는?
1) 객체의 name 필드에 매개변수 name의 값을 저장한다.
2) 새로운 클래스를 만든다.
3) 생성자를 삭제한다.
4) name을 화면에 출력한다.

정답: 1번


문제 8. 다음 중 생성자 오버로딩에 해당하는 것은?
1) void show()
   void print()

2) Student(String name)
   Student(String name, int age)

3) int add(int a, int b)
   double add(int a, int b)

4) void show(int a)
   void show(int a)

정답: 2번
*/
