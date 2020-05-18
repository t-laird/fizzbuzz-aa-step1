import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzTest extends Specification {
    def fizzBuzz = new FizzBuzz();

    @Unroll
    def "FizzBuzz"() {

        when:
        def res = fizzBuzz.fizzBuzz(start, end)

        then:
        res == expectation

        where:
        start | end | expectation
        1     | 20  | ["1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"]
        9     | 23  | ["fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz", "fizz", "22", "23"]
    }
}
