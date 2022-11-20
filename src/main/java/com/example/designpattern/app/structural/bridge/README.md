## 브릿지 패턴 (Bridge Pattern)

구현부에서 추상층을 분리하여 각자 독립적으로 변형이 가능하고 확장이 가능하도록 합니다.
즉 기능과 구현에 대해서 두 개를 별도의 클래스로 구현을 합니다.

- **Implementor**
    - abstract 기능을 구현하기 위한 인터페이스 정의

- **ConcreateImplementor**
    - 실제 기능 구현

- **Abstract**
    - 기능 계층의 최상위 클래스
    - 구현 부분에 해당하는 클래스를 인스턴스를 가지고 구현부 메서드를 호출한다

- **RefinedAbstract**
    - 기능 계층에서 새로운 부분을 확장한 클래스

### 브릿지 패턴의 장점

추상적인 부분과 구체적인 부분을 분리하여 composite 하기 때문에
추상적인 부분은 유지한 채 구체적인 부분만 변경 및 확장시킬 수 있다.

확장에 열려있고, 구체적인 부분이 변경되더라도 추상적인 부분에 영향을 미치지 않음

_OCP, SRP_

### 브릿지 패턴의 단점

계층이 1개 더 생성되므로 복잡도를 증가 시킬 수 있다.

### Example

- JDBC

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BridePattern {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:[DriverName]:[URL]",
                "sa",
                "password")) {
            String query = "SELECT 1";
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

- 추상적 개념과 이에 대한 구현 사이의 지속적인 종속 관계를 피하고 싶을 때, 이를테면, 런타임에 구현 방법을 선택하거나 구현 내용을 변경하고 싶을 때가 여기에 해당합니다.
- 추상적 개념과 구현 모두가 독립적으로 서브클래싱을 통해 확장되어야 할 때. 이때, 가교 패턴은 갭라자가 구현을 또 다른 추상적 개념과 연결할 수 있게 할 뿐 아니라, 각각을 독립적으로 확장 가능하게 합니다.
- 추상적 개념에 대한 구현 내용을 변경하는 것이 다른 관련 프로그램에 아무런 영향을 주지 않아야 할 때
- 클래스 계통에서 클래스 수가 급증하는 것을 방지하고자 할 때
- 여러 객체들에 걸쳐 구현을 공유하고자 하며, 또 이런 사실을 사용자 쪽에 공개하고 싶지 않을 때