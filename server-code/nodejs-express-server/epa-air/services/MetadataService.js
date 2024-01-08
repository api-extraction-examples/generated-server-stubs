/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Clean Air Act Metadata Service
* Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints.
*
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* returns _air_rest_services_metadata_get_200_response
* */
const air_rest_services_metadataGET = ({ output, callback }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        output,
        callback,
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
* Clean Air Act Metadata Service
* Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints.
*
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* returns _air_rest_services_metadata_get_200_response
* */
const air_rest_services_metadataPOST = ({ output, callback }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        output,
        callback,
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
  air_rest_services_metadataGET,
  air_rest_services_metadataPOST,
};
