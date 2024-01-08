/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a service
*
* serviceCreateRequest ServiceCreateRequest 
* xRegistryAuth String A base64-encoded auth configuration for pulling from private registries. [See the authentication section for details.](#section/Authentication) (optional)
* returns ServiceCreate_201_response
* */
const serviceCreate = ({ serviceCreateRequest, xRegistryAuth }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        serviceCreateRequest,
        xRegistryAuth,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a service
*
* id String ID or name of service.
* no response value expected for this operation
* */
const serviceDelete = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Inspect a service
*
* id String ID or name of service.
* insertDefaults Boolean Fill empty fields with default values. (optional)
* returns Service
* */
const serviceInspect = ({ id, insertDefaults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        insertDefaults,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List services
*
* filters String A JSON encoded value of the filters (a `map[string][]string`) to process on the services list. Available filters:  - `id=<service id>` - `label=<service label>` - `mode=[\"replicated\"|\"global\"]` - `name=<service name>`  (optional)
* returns List
* */
const serviceList = ({ filters }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filters,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get service logs
* Get `stdout` and `stderr` logs from a service.  **Note**: This endpoint works only for services with the `json-file` or `journald` logging drivers. 
*
* id String ID or name of the service
* details Boolean Show service context and extra details provided to logs. (optional)
* follow Boolean Return the logs as a stream.  This will return a `101` HTTP response with a `Connection: upgrade` header, then hijack the HTTP connection to send raw output. For more information about hijacking and the stream format, [see the documentation for the attach endpoint](#operation/ContainerAttach).  (optional)
* stdout Boolean Return logs from `stdout` (optional)
* stderr Boolean Return logs from `stderr` (optional)
* since Integer Only return logs since this time, as a UNIX timestamp (optional)
* timestamps Boolean Add timestamps to every log line (optional)
* tail String Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. (optional)
* returns String
* */
const serviceLogs = ({ id, details, follow, stdout, stderr, since, timestamps, tail }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        details,
        follow,
        stdout,
        stderr,
        since,
        timestamps,
        tail,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update a service
*
* id String ID or name of service.
* version Integer The version number of the service object being updated. This is required to avoid conflicting writes.
* serviceUpdateRequest ServiceUpdateRequest 
* registryAuthFrom String If the X-Registry-Auth header is not specified, this parameter indicates where to find registry authorization credentials. The valid values are `spec` and `previous-spec`. (optional)
* rollback String Set to this parameter to `previous` to cause a server-side rollback to the previous service spec. The supplied spec will be ignored in this case. (optional)
* xRegistryAuth String A base64-encoded auth configuration for pulling from private registries. [See the authentication section for details.](#section/Authentication) (optional)
* returns ServiceUpdateResponse
* */
const serviceUpdate = ({ id, version, serviceUpdateRequest, registryAuthFrom, rollback, xRegistryAuth }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        version,
        serviceUpdateRequest,
        registryAuthFrom,
        rollback,
        xRegistryAuth,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  serviceCreate,
  serviceDelete,
  serviceInspect,
  serviceList,
  serviceLogs,
  serviceUpdate,
};
