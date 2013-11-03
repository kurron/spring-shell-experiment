package org.kurron.shell.commands

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.shell.plugin.support.DefaultHistoryFileNameProvider
import org.springframework.stereotype.Component

@SuppressWarnings( 'GroovyUnusedDeclaration' )
@Component
@Order( Ordered.HIGHEST_PRECEDENCE )
class MyHistoryFileNameProvider extends DefaultHistoryFileNameProvider {

    public String getHistoryFileName() {
        "my.log"
    }

    @Override
    public String name() {
        "My history file name provider"
    }

}
