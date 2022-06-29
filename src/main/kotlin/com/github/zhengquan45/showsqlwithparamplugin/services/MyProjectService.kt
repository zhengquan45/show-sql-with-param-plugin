package com.github.zhengquan45.showsqlwithparamplugin.services

import com.intellij.openapi.project.Project
import com.github.zhengquan45.showsqlwithparamplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
