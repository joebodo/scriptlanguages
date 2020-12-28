import de.hybris.platform.servicelayer.cronjob.CronJobService
import org.springframework.context.ApplicationContext

bindings.forEach {
    println("- $it")
}

val code = "update-southwireB2CIndex-cronJob"

val spring = bindings["spring"] as ApplicationContext
val cronJobService = spring.getBean("cronJobService") as CronJobService

val cronjob = cronJobService.getCronJob(code)
//cronJobService.performCronJob(cronjob, false)


println("started index update")
