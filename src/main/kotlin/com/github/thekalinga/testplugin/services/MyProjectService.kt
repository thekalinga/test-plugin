package com.github.thekalinga.testplugin.services

import com.intellij.openapi.project.Project
import com.github.thekalinga.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
