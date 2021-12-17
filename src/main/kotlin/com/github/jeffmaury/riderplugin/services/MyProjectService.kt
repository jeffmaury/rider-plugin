package com.github.jeffmaury.riderplugin.services

import com.intellij.openapi.project.Project
import com.github.jeffmaury.riderplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
