#!/bin/bash
echo calling curl
curl -X POST -H 'Content-type: application/json'  --data '{"text":"@here DevOps BootCamp Login Application has failed. Everyone panic! :fire: :fire_engine:"}'  https://hooks.slack.com/services/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
echo done
