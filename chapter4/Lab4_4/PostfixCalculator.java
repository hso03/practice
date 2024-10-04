

public class PostfixCalculator {
    /**
     * 후위 표기법을 사용하여 산술식을 계산합니다.
     *
     * @param expression 후위 표기법으로 주어진 문자열 배열 (피연산자와 연산자)
     * @return 계산 결과 값
     */
    public static int evaluatePostfix(String[] expression) {
        Stack stack = new LinkedStack(); // 계산을 위한 스택

        System.out.println("입력된 후위 표기식: ");
        for (String token : expression) {
            System.out.print(token + " ");
        }
        System.out.println();

        // 주어진 후위 표기법 식을 순차적으로 처리
        for (String token : expression) {
            // TODO#1 숫자와 연산자를 구분하라.
            if (isNumber(token)) {
                // TODO#2 숫자일 경우 스택에 넣는다.
                /* ... */
                int num = Integer.parseInt(token);
                stack.push(num);
                System.out.println("스택에 숫자 추가: " + token + " -> " + stack);
            } else if (isOperator(token)) {
                // TODO#3 연산자가 들어오면 스택에서 두 개의 피연산자를 꺼내어 계산
                /* ... */
                int operand2=stack.pop();
                int operand1=stack.pop();
                int result=performOperation(operand1, operand2, token);
                System.out.println("연산 수행: " + operand1 + " " + token + " " + operand2 + " = " + result);

                // TODO#4 결과를 다시 스택에 넣는다.
                /* ... */
                stack.push(result);
                System.out.println("스택에 결과 추가: " + result + " -> " + stack);
            } else {
                throw new IllegalArgumentException("잘못된 입력입니다: " + token);
            }
        }

        // TODO#5 최종 결과 확인
        if (stack.size()>1) {
            throw new IllegalArgumentException("잘못된 후위 표기식입니다. 스택에 값이 남았습니다.");
        }

        // TODO#6 스택에 남은 최종 결과 반환
        /* ... */
        int finalResult=stack.peek();
        System.out.println("최종 결과: " + finalResult);
        return finalResult;
    }

    /**
     * 주어진 문자열이 숫자인지 확인합니다.
     *
     * @param token 확인할 문자열
     * @return 숫자이면 true, 아니면 false
     */
    private static boolean isNumber(String token) {
        try {
            // TODO#7 주어진 문자열이 숫자인지 확인하라.
            int number = Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * 주어진 문자열이 연산자인지 확인합니다.
     *
     * @param token 확인할 문자열
     * @return 연산자이면 true, 아니면 false
     */
    private static boolean isOperator(String token) {
        // TODO#8 주어진 문자열이 연산자인지 확인하라.
        return token.equals("*") || token.equals("-") || token.equals("+") || token.equals("/");
    }

    /**
     * 두 피연산자와 연산자를 사용하여 계산을 수행합니다.
     *
     * @param operand1 첫 번째 피연산자
     * @param operand2 두 번째 피연산자
     * @param operator 연산자
     * @return 연산 결과
     */
    private static int performOperation(int operand1, int operand2, String operator) {
        // TODO#9 연산자 별로 계산을 수행하라.
        switch (operator) {
            case "+":
                /* ... */
                return operand1+operand2;
            case "-":
                /* ... */
                return operand1-operand2;
            case "*":
                /* ... */
                return operand1 * operand2;
            case "/":
                /* ... */
                if(operand2==0){
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }else{
                    return operand1 / operand2;
                }
            default: return 0;
            }
        }
    

    /**
     * 테스트용 메인 메서드
     */
    public static void main(String[] args) {
        // 예시: 1 + 2 를 후위 표기법으로 표현한 식
        String[] expression = { "1", "2", "+" };

        // 후위 표기법 계산 수행
        int result = evaluatePostfix(expression);
        System.out.println("계산된 최종 결과: " + result);

        String[] illegalExpression = { "3", "2", "2", "+", "4", "-", "/" };
        try {
            result = evaluatePostfix(illegalExpression);
            System.out.println("계산된 최종 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("연산식 오류 : " + e.getMessage());
        }
    }
}
