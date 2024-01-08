/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get task logs
* Get `stdout` and `stderr` logs from a task.  **Note**: This endpoint works only for services with the `json-file` or `journald` logging drivers. 
*
* id String ID of the task
* details Boolean Show task context and extra details provided to logs. (optional)
* follow Boolean Return the logs as a stream.  This will return a `101` HTTP response with a `Connection: upgrade` header, then hijack the HTTP connection to send raw output. For more information about hijacking and the stream format, [see the documentation for the attach endpoint](#operation/ContainerAttach).  (optional)
* stdout Boolean Return logs from `stdout` (optional)
* stderr Boolean Return logs from `stderr` (optional)
* since Integer Only return logs since this time, as a UNIX timestamp (optional)
* timestamps Boolean Add timestamps to every log line (optional)
* tail String Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. (optional)
* returns String
* */
const taskLogs = ({ id, details, follow, stdout, stderr, since, timestamps, tail }) => new Promise(
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

module.exports = {
  taskLogs,
};
