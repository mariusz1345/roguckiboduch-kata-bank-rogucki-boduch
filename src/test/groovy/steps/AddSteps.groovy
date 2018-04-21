package steps

import groovy.transform.Field
import app.Adder

this.metaClass.mixin(cucumber.api.groovy.EN)

@Field adder
@Field result

Given(~/^I have an adder$/) { ->
    adder = new Adder()
}

When(~/^I add (\d+) and (\d+)$/) { int x, int y ->
   result=adder.add(x,y)	
}

Then(~/^I get (\d+)$/) { int expected ->
	assert result==expected
}