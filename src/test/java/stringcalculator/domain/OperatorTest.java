package stringcalculator.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class OperatorTest {

    @ParameterizedTest
    @MethodSource("operatorProvider")
    void of_정상(String stringInput, Operator enumInput) throws Exception {
        //given

        //when
        Operator operator = Operator.of(stringInput);

        //then
        assertThat(operator).isEqualTo(enumInput);
    }

    static Stream<Arguments> operatorProvider() {
        return Stream.of(
                arguments("+", Operator.ADDITION),
                arguments("-", Operator.SUBTRACTION),
                arguments("*", Operator.MULTIPLICATION),
                arguments("/", Operator.DIVISION)
        );
    }

    @Test
    void of_예외() throws Exception {
        //given
        String input = "%";

        //when

        //then
        assertThatThrownBy(() -> {
            Operator operator = Operator.of(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사칙연산의 기호가 아닙니다.");
    }

    @ParameterizedTest(name = "[{index}] 4 와 2를 {0} 연산한 결과는 {1}")
    @CsvSource(value = {"+:6", "-:2", "*:8", "/:2"}, delimiter = ':')
    void operate_정상(String input, int expected) throws Exception {
        //given

        //when
        int result = Operator.of(input).operate(4, 2);

        //then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void operate_예외() throws Exception {
        //given

        //when

        //then
        assertThatThrownBy(() -> {
            int result = Operator.of("/").operate(5, 2);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("약수만 사용할 수 있습니다.");
    }
}
