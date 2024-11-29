## 기능 목록

- 한 번만 실행

- GameResultType
- [ ] : 결과 이름, 횟수를 관리하는 객체

- GameResults
- [ ] : Ball, Strike, Nothing 을 List 로 관리하는 객체

- GameInitializer
- [ ] : GameResultType 생성, GameResults 초기화

- 계속 실행

- NumberGenerator
- [ ] : 1 ~ 9 사이 서로 다른 랜덤 3개 추출

- NumberService
- [ ] : NumberGenerator 로 컴퓨터 숫자 생성
- [ ] : 입력값으로 사용자 숫자 생성

- MatchService
- [ ] : 컴퓨터 숫자와 입력된 숫자 비교
- [ ] : 비교 결과에 맞는 로직 실행

- RestartService
- [ ] : 재시작 / 종료를 구분

- 입/출력

- BaseBallBusinessValidator
- [ ] : 컴퓨터 숫자가 3자리인지 확인
- [ ] : 컴퓨터 숫자가 1 ~ 9 숫자인지 확인
- [ ] : 컴퓨터 숫자가 서로 다른 숫자인지 확인
- [ ] : 재시작 / 종료 숫자가 1 / 2인지 확인

- BaseBallInputView
- [ ] : 숫자를 입력 받음

- BaseBallFormatValidator
- [ ] : 입력값이 존재하는지 확인
- [ ] : 숫자인지 확인