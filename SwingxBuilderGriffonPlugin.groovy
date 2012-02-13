class SwingxBuilderGriffonPlugin {
    String version = '0.6'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-swingx-builder-plugin'

    List authors = [
        [
            name: 'James Williams',
            email: 'james.l.williams@gmail.com'
        ]
    ]
    String title = 'SwingXBuilder Plugin'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Brings the [SwingXBuilder][1] libraries (based on [SwingX 1.6.3][2]) into your Griffon application.

Usage
----
SwingX nodes are added with the **jx** prefix to the root builder, which means you must prepend **jx**
to the node names, this means `datePicker` becomes `jxdatePicker`. Please refer to the [builder's][1] page 
to known what nodes are available.Refer to the [builder's][1] page to known what nodes are available.


[1]: http://griffon.codehaus.org/SwingXBuilder
[2]: https://swingx.dev.java.net
'''
}
