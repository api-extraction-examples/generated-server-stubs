#!/usr/bin/env bash

set -ex

# Frameworks = aspnetcore, go-gin-server, go-server, nodejs-express-server, python-flask, spring
frameworks=("aspnetcore" "go-gin-server" "go-server" "nodejs-express-server" "python-flask" "spring")

swagger_files=($(ls swagger))

for swagger_file in "${swagger_files[@]}"; do
    app=$(basename "$swagger_file" .yaml)
    for framework in "${frameworks[@]}"; do
        mkdir -p "server-code/${framework}/${app}"
        openapi-generator-cli generate -i "swagger/${swagger_file}" -g "${framework}" -o "server-code/${framework}/${app}" --skip-validate-spec
    done
done
