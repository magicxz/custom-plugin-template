package com.github.magicxz.test123.services

import com.intellij.openapi.project.Project
import com.github.magicxz.test123.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
