package android.unit

import org.gradle.api.Plugin
import org.gradle.api.Project

public class UnitPlugin implements Plugin<Project> {
    void apply(Project project) {
        println "hello this is unit test gradle plugin"
        project.task('testTask') << {
            println "zhibao.liu start to excute unit test ..."
        }
    }
}