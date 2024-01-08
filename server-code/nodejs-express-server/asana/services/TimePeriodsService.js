/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a time period
* Returns the full record for a single time period.
*
* timeUnderscoreperiodUnderscoregid String Globally unique identifier for the time period.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getTimePeriod_200_response
* */
const getTimePeriod = ({ timeUnderscoreperiodUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timeUnderscoreperiodUnderscoregid,
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
/**
* Get time periods
* Returns compact time period records.
*
* workspace String Globally unique identifier for the workspace.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* startUnderscoreon date ISO 8601 date string (optional)
* endUnderscoreon date ISO 8601 date string (optional)
* returns getTimePeriods_200_response
* */
const getTimePeriods = ({ workspace, optUnderscorepretty, optUnderscorefields, limit, offset, startUnderscoreon, endUnderscoreon }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspace,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
        startUnderscoreon,
        endUnderscoreon,
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
  getTimePeriod,
  getTimePeriods,
};
