#!/usr/bin/env bash

set -ex

# Download Swagger file from APIs-guru and save to swagger/app-name.yaml
# 1password.local/connect/1.5.7
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/1password.local/connect/1.5.7/openapi.yaml -O swagger/1password-local.yaml
# amazonaws.com/iam/2010-05-08
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/amazonaws.com/iam/2010-05-08/openapi.yaml -O swagger/amazonaws-iam.yaml
# apache.org/airflow/2.5.3
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/apache.org/airflow/2.5.3/openapi.yaml -O swagger/apache-airflow.yaml
# apple.com/app-store-connect/1.4.1
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/apple.com/app-store-connect/1.4.1/openapi.yaml -O swagger/apple-app-store-connect.yaml
# asana.com/1.0
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/asana.com/1.0/openapi.yaml -O swagger/asana.yaml
# atlassian.com/jira/1001.0.0-SNAPSHOT
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/atlassian.com/jira/1001.0.0-SNAPSHOT/openapi.yaml -O swagger/atlassian-jira.yaml
# bbc.co.uk/1.0.0
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/bbc.co.uk/1.0.0/swagger.yaml -O swagger/bbc.yaml
# circleci.com/v1
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/circleci.com/v1/openapi.yaml -O swagger/circleci.yaml
# collegefootballdata.com/4.4.12
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/collegefootballdata.com/4.4.12/openapi.yaml -O swagger/collegefootballdata.yaml
# covid19-api.com/1.2.6
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/covid19-api.com/1.2.6/openapi.yaml -O swagger/covid19-api.yaml
# datasette.local/v1
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/datasette.local/v1/openapi.yaml -O swagger/datasette-local.yaml
# Digital Ocean
# Running into issues with this API and openapi-generator-cli
#wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/digitalocean.com/2.0/openapi.yaml -O swagger/digitalocean.yaml
# Docker engine
# Running into issues with this API and openapi-generator-cli
#wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/docker.com/engine/1.33/openapi.yaml -O swagger/docker-engine.yaml
# ebay sell account
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/ebay.com/sell-account/v1.9.0/openapi.yaml -O swagger/ebay-sell-account.yaml
# epa.gov air
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/epa.gov/air/2019.10.15/swagger.yaml -O swagger/epa-air.yaml
# gsa.gov
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/gsa.gov/0.1/swagger.yaml -O swagger/gsa.yaml
# Httpbin
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/httpbin.org/0.9.2/openapi.yaml -O swagger/httpbin.yaml
# Instagram
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/instagram.com/1.0.0/swagger.yaml -O swagger/instagram.yaml
# Intel product-catalogue
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/intel.com/product-catalogue/0.1.0/swagger.yaml -O swagger/intel-product-catalogue.yaml
# Jellyfin local
# Getting this error from oasdiff - diff failed with duplicate endpoint (GET /MusicGenres/{name}/InstantMix) found in analysis/base/jellyfin-local-java.yml and /analysis/base/jellyfin-local-java.yml. You may add the x-since-date extension to specify order
#wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/jellyfin.local/v1/openapi.yaml -O swagger/jellyfin-local.yaml
# LaunchDarkly
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/launchdarkly.com/5.3.0/swagger.yaml -O swagger/launchdarkly.yaml
# Linux Foundation
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/linuxfoundation.org/reimbursement/1.0/swagger.yaml -O swagger/linux-foundation.yaml
# Lyft
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/lyft.com/1.0.0/swagger.yaml -O swagger/lyft.yaml
# Mastercard open banking connect
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/mastercard.com/open-banking-connect-pis/1.16.0/swagger.yaml -O swagger/mastercard-open-banking-connect.yaml
# Mastodon Local
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/mastodon.local/1.0/openapi.yaml -O swagger/mastodon.yaml
# Medium
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/medium.com/1.0/openapi.yaml -O swagger/medium.yaml
# Mercedes Benz Dealer
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/mercedes-benz.com/dealer/1.0/swagger.yaml -O swagger/mercedes-benz.yaml
# NBA
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/nba.com/version/swagger.yaml -O swagger/nba.yaml
# Netlify
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/netlify.com/2.16.0/swagger.yaml -O swagger/netlify.yaml
# NY Times top stories
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/nytimes.com/top_stories/2.0.0/openapi.yaml -O swagger/nytimes-top-stories.yaml
# Stripe
#wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/stripe.com/2022-11-15/openapi.yaml -O swagger/stripe.yaml
# OpenSuse
# Running into issues with this API and openapi-generator-cli
#wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/opensuse.org/obs/2.10.50/openapi.yaml -O swagger/opensuse.yaml
# Parliament Bills
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/parliament.uk/bills/v1/openapi.yaml -O swagger/parliament-bills.yaml
# Probely
# Running into openapi-generator-cli issues here, in the python-flask action.
#wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/probely.com/1.2.0/openapi.yaml -O swagger/probely.yaml
# Twilio notify
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/twilio.com/twilio_notify_v1/1.52.0/openapi.yaml -O swagger/twilio-notify.yaml
# Testfire
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/testfire.net/altoroj/1.0.2/swagger.yaml -O swagger/testfire.yaml
# Zapier
wget https://raw.githubusercontent.com/api-extraction-examples/openapi-directory/main/APIs/zapier.com/nla/1.0.0/openapi.yaml -O swagger/zapier.yaml
