code = "update-southwireB2CIndex-cronJob"

cronjob = cronJobService.getCronJob(code)
cronJobService.performCronJob(cronjob, False)

print("started index update")