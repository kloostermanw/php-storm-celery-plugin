package com.github.kloostermanw.phpstormceleryplugin.services

import com.github.kloostermanw.phpstormceleryplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
