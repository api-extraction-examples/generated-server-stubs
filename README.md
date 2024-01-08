# Generated Specs

I borrowed some API Specs for notable APIs from [this test base of API Specs](https://github.com/api-extraction-examples/openapi-directory). We use that to generate Server stubs using [OpenAPI Generator](https://openapi-generator.tech/). See the supported server generators here: https://openapi-generator.tech/docs/generators/#server-generators.

# Generating Server Code

## Setup

* Install OpenAPI Generator

```bash
npm install @openapitools/openapi-generator-cli -g
```

## Usage

* First, download all the swagger files. You can add to the script if you want.

```bash
./download.sh
```

* Next, generate server code.

```bash
./generate-server-code.sh
```

* Now generate the test case yaml file for internal usage and copy to the integration/test-cases-generated.yml file.

```bash
python3 ./generate_config.py
```

This will allow our API Extractor to clone the repository and run the API Extraction against it using the given config.
