//
// This script is executed by Griffon when the plugin is uninstalled from project.
// Use this script if you intend to do any additional clean-up on uninstall, but
// beware of messing up SVN directories!
//

def configText = """jx {
    'groovy.swing.SwingXBuilder' {
        view = '*'
    }
}"""
if(builderConfigFile.text.contains(configText)) {
    println 'Removing SwingXBuilder from Builder.groovy'
    builderConfigFile.text -= configText
}