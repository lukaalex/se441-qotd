package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid quote text"() {
    	when: 'text is empty'
    	def p = new Quote(text: '')

    	then: 'validation should fail'
    	!p.validate()

    	// TODO: add new tests for null text (should fail) and
    	// legal text (should pass)

    	when: 'text is null'
    	def o = new Quote(text: null)

    	then: 'validation should fail'
    	!o.validate()

    	when: 'text is legal'
    	def t = new Quote(text: 'legal')

    	then: 'validation should pass'
    	t.validate()
    }
}
