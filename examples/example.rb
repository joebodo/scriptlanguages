job = "update-southwireB2CIndex-cronJob"

cronjob = cronJobService.getCronJob(job)
cronJobService.performCronJob(cronjob, false)

puts("started job")