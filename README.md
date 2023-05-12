## 자동차 경주 게임 구현
### 기능 요구사항
* 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
* 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

### Keep in mind
* [자동차경주 게임 피드백 pdf](https://nextstep-storage.s3.ap-northeast-2.amazonaws.com/2020-04-13T14%3A18%3A53.571%E1%84%8C%E1%85%A1%E1%84%83%E1%85%A9%E1%86%BC%E1%84%8E%E1%85%A1%20%E1%84%80%E1%85%A7%E1%86%BC%E1%84%8C%E1%85%AE%20%E1%84%80%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%B7%20%E1%84%91%E1%85%B5%E1%84%83%E1%85%B3%E1%84%87%E1%85%A2%E1%86%A8.pdf)


### 피드백 반영 Todo
* class diagram 작성하기
* MVC pattern으로 구현해보기
* 경계값을 넣어 테스트하기
* Strategy pattern 적용해보기 with @FunctionalInterface -> DI 가능케 함 -> Testable & 변경에 유현한 코드 작성
* getter를 안쓰고 대신 class를 비교해보기 Override equals
    * 값을 view에 전달해야 하는 최종 단계에서만 getter 쓰기
* Immutable object vs Mutable object. 처음부터 성능을 고려하지는 말고 우선 Immutable하게 만들어보기.
* View에서 사용할 데이터는 getter 사용 가능
* Testable한 객체를 만들기 위해 다양한 형태의 생성자를 만들기

<img src="./java-racing-car Diagram.draw.io.drawio.svg" style="width:80%">

## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
