/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Check auth configuration
* Validate credentials for a registry and, if available, get an identity token for accessing the registry without password.
*
* authConfig AuthConfig Authentication to check (optional)
* returns SystemAuth_200_response
* */
const systemAuth = ({ authConfig }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authConfig,
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
* Get data usage information
*
* returns SystemDataUsage_200_response
* */
const systemDataUsage = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Monitor events
* Stream real-time events from the server.  Various objects within Docker report events when something happens to them.  Containers report these events: `attach`, `commit`, `copy`, `create`, `destroy`, `detach`, `die`, `exec_create`, `exec_detach`, `exec_start`, `export`, `health_status`, `kill`, `oom`, `pause`, `rename`, `resize`, `restart`, `start`, `stop`, `top`, `unpause`, and `update`  Images report these events: `delete`, `import`, `load`, `pull`, `push`, `save`, `tag`, and `untag`  Volumes report these events: `create`, `mount`, `unmount`, and `destroy`  Networks report these events: `create`, `connect`, `disconnect`, `destroy`, `update`, and `remove`  The Docker daemon reports these events: `reload`  Services report these events: `create`, `update`, and `remove`  Nodes report these events: `create`, `update`, and `remove`  Secrets report these events: `create`, `update`, and `remove`  Configs report these events: `create`, `update`, and `remove` 
*
* since String Show events created since this timestamp then stream new events. (optional)
* until String Show events created until this timestamp then stop streaming. (optional)
* filters String A JSON encoded value of filters (a `map[string][]string`) to process on the event list. Available filters:  - `config=<string>` config name or ID - `container=<string>` container name or ID - `daemon=<string>` daemon name or ID - `event=<string>` event type - `image=<string>` image name or ID - `label=<string>` image or container label - `network=<string>` network name or ID - `node=<string>` node ID - `plugin`=<string> plugin name or ID - `scope`＝<string> local or swarm - `secret=<string>` secret name or ID - `service=<string>` service name or ID - `type=<string>` object to filter by, one of `container`, `image`, `volume`, `network`, `daemon`, `plugin`, `node`, `service`, `secret` or `config` - `volume=<string>` volume name  (optional)
* returns SystemEvents_200_response
* */
const systemEvents = ({ since, until, filters }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        since,
        until,
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
* Get system information
*
* returns SystemInfo
* */
const systemInfo = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Ping
* This is a dummy endpoint you can use to test if the server is accessible.
*
* returns String
* */
const systemPing = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get version
* Returns the version of Docker that is running and various information about the system that Docker is running on.
*
* returns SystemVersion_200_response
* */
const systemVersion = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  systemAuth,
  systemDataUsage,
  systemEvents,
  systemInfo,
  systemPing,
  systemVersion,
};
