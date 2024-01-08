/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Lists capabilites of a worker.
* Lists capabilites of a worker.  This can be useful when checking for constraints.  This operation is the same as `GET /worker/capability/{architecture_name}:{worker_id}`. 
*
* workerUnderscoreid String Worker id.
* returns _worker__architecture_name___worker_id__get_200_response
* */
const workerArchitectureNameworkerIdGET = ({ workerUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workerUnderscoreid,
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
* Lists status of workers, jobs, backend services and general statistics.
* Lists status of workers, running jobs, waiting jobs, status of the backend services and general statistics.  Other ways to obtain the same information as with this endpoint are:   * `GET /worker/_status`   * `GET /status/workerstatus`   * `GET /build/_workerstatus` 
*
* returns _worker_status_get_200_response
* */
const workerStatusGET = () => new Promise(
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
* Lists workers which match a constraints filter.
* Given a project, package, repository and architecture, list workers which can build with that restrictions, and also match a constraints filter.  This endpoint doesn't create or modify any data.  More information about constraints can be found in the [user guide](https://openbuildservice.org/help/manuals/obs-user-guide/cha.obs.build_job_constraints.html).  This operation is the same as `POST /worker/command/run?cmd=checkconstraints`. 
*
* project String Project name.
* repository String Repository name.
* arch String Architecture name.
* package String Package name.
* workerCmdCheckconstraintsPostRequest WorkerCmdCheckconstraintsPostRequest Constraints XML filter
* returns Object
* */
const workercmdcheckconstraintsPOST = ({ project, repository, arch, package, workerCmdCheckconstraintsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        project,
        repository,
        arch,
        package,
        workerCmdCheckconstraintsPostRequest,
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
  workerArchitectureNameworkerIdGET,
  workerStatusGET,
  workercmdcheckconstraintsPOST,
};
