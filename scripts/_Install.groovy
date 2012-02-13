//
// This script is executed by Griffon after plugin was installed to project.

// check to see if we already have a FlamingoBuilder
def configText = """jx {
    'groovy.swing.SwingXBuilder' {
        view = '*'
    }
}"""
if(!(builderConfigFile.text.contains(configText))) {
    println 'Adding SwingXBuilder to Builder.groovy'
    builderConfigFile.append("""
$configText
""")
}