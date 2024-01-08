/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Bulk replace all distributions.
* Bulk replace all distributions.  This is only for admins. 
*
* body Object Distributions definition (optional)
* returns Object
* */
const distributionsBulkReplacePUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
* Delete a distribution.
* Delete a distribution.  This is only for admins. 
*
* returns Object
* */
const distributionsDistributionIdDELETE = () => new Promise(
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
* Show a distribution.
* Show a distribution that can be build against. 
*
* distributionUnderscoreid Integer The id of the distribution
* returns Object
* */
const distributionsDistributionIdGET = ({ distributionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        distributionUnderscoreid,
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
* Update a distribution.
* Update the data of a distribution.
*
* body Object Distribution definition (optional)
* no response value expected for this operation
* */
const distributionsDistributionIdPUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
* List all distributions.
* List all distributions that can be build against. This will not list distributions that are available via [interconnect](https://openbuildservice.org/help/manuals/obs-user-guide/cha.obs.concepts.html#id-1.5.10.3.5). Check /distributions/include_remotes for this. 
*
* returns _distributions_get_200_response
* */
const distributionsGET = () => new Promise(
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
* List all distributions including remote.
* List all distributions that can be build against, including the ones provided by the interconnect. 
*
* no response value expected for this operation
* */
const distributionsIncludeRemotesGET = () => new Promise(
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
* Create a distribution.
* Create a distribution.  This is only for admins. 
*
* distributionsPostRequest DistributionsPostRequest Distribution definition (optional)
* returns Object
* */
const distributionsPOST = ({ distributionsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        distributionsPostRequest,
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
  distributionsBulkReplacePUT,
  distributionsDistributionIdDELETE,
  distributionsDistributionIdGET,
  distributionsDistributionIdPUT,
  distributionsGET,
  distributionsIncludeRemotesGET,
  distributionsPOST,
};
