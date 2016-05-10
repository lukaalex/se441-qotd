package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Attribution)
class AttributionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid attribution name"() {
    	when: 'name is empty'
    	def p = new Attribution(name: '')

    	then: 'validation should fail'
    	!p.validate()

    	// TODO: add new tests for null name (should fail) and
    	// legal name (should pass)

    	when: 'name is null'
    	def o = new Attribution(name: null)

    	then: 'validation should fail'
    	!o.validate()

    	when: 'name is legal'
    	def t = new Attribution(name: 'test')

    	then: 'validation should pass'
    	t.validate()
    }
}
