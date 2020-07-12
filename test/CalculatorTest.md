## JUnit
### JUnit 노테이션
* @Test  
테스트 메소드에 Test 애노테이션을 추가한다.애
* @Before  
테스트 메소드에 대한 초기화 작업을 수행한다. 추후 @RunWith, @Rule과 같은 애노테이션을 사용해 기능을 확장할때 @Before 안이어야만 두 애노테이션에서 초기화 된 객체가 접근할 수 있다는 제약사항이 있다. 따라서 초기작업은 @Before 애노테이션을 사용해 구성하는것을 JUnit에서 권장한다.
* @After  
테스트 메소드의 실행이 끝난 후 처리작업을 수행한다.

### JUnit 메소드
* assertEquals(기대하는값, 프로덕션코)  
결과값과 실제 실행값이 일치하는지 체크해준다.