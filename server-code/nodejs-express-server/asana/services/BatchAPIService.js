/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Submit parallel requests
* Make multiple requests in parallel to Asana's API.
*
* createBatchRequestRequest CreateBatchRequestRequest The requests to batch together via the Batch API.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createBatchRequest_200_response
* */
const createBatchRequest = ({ createBatchRequestRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createBatchRequestRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
  createBatchRequest,
};
