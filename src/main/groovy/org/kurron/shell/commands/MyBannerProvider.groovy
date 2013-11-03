package org.kurron.shell.commands

import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.shell.plugin.support.DefaultBannerProvider
import org.springframework.shell.support.util.OsUtils
import org.springframework.stereotype.Component

@SuppressWarnings( 'GroovyUnusedDeclaration' )
@Component
@Order( Ordered.HIGHEST_PRECEDENCE )
public class MyBannerProvider extends DefaultBannerProvider  {

    public String getBanner() {
        StringBuffer buffer = new StringBuffer()
        buffer.append("=======================================" + OsUtils.LINE_SEPARATOR)
        buffer.append("*                                     *"+ OsUtils.LINE_SEPARATOR)
        buffer.append("*            HelloWorld               *" +OsUtils.LINE_SEPARATOR)
        buffer.append("*                                     *"+ OsUtils.LINE_SEPARATOR)
        buffer.append("=======================================" + OsUtils.LINE_SEPARATOR)
        buffer.append("Version:" + this.getVersion())
        return buffer.toString()
    }

    public String getVersion() {
        "1.2.3"
    }

    public String getWelcomeMessage() {
        "Welcome to HelloWorld CLI"
    }

    @Override
    String name() {
        "Hello World Banner"
    }
}
