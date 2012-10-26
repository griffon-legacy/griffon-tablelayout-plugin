griffon.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        griffonHome()
        // pluginDirPath is only available when installed
        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
        flatDir name: "tablelayoutLibDir", dirs: ["${basePath}lib"]
    }
    dependencies {
        compile('info.clearthought:tablelayout-all:20121026-jdk5')
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}