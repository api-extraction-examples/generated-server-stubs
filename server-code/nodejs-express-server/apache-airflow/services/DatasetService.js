/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a dataset
* Get a dataset by uri.
*
* uri String The encoded Dataset URI
* returns Dataset
* */
const get_dataset = ({ uri }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        uri,
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
* Get dataset events
* Get dataset events
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* datasetUnderscoreid Integer The Dataset ID that updated the dataset. (optional)
* sourceUnderscoredagUnderscoreid String The DAG ID that updated the dataset. (optional)
* sourceUnderscoretaskUnderscoreid String The task ID that updated the dataset. (optional)
* sourceUnderscorerunUnderscoreid String The DAG run ID that updated the dataset. (optional)
* sourceUnderscoremapUnderscoreindex Integer The map index that updated the dataset. (optional)
* returns DatasetEventCollection
* */
const get_dataset_events = ({ limit, offset, orderUnderscoreby, datasetUnderscoreid, sourceUnderscoredagUnderscoreid, sourceUnderscoretaskUnderscoreid, sourceUnderscorerunUnderscoreid, sourceUnderscoremapUnderscoreindex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        orderUnderscoreby,
        datasetUnderscoreid,
        sourceUnderscoredagUnderscoreid,
        sourceUnderscoretaskUnderscoreid,
        sourceUnderscorerunUnderscoreid,
        sourceUnderscoremapUnderscoreindex,
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
* List datasets
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* uriUnderscorepattern String If set, only return datasets with uris matching this pattern.  (optional)
* returns DatasetCollection
* */
const get_datasets = ({ limit, offset, orderUnderscoreby, uriUnderscorepattern }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        orderUnderscoreby,
        uriUnderscorepattern,
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
* Get dataset events for a DAG run
* Get datasets for a dag run.  *New in version 2.4.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* returns DatasetEventCollection
* */
const get_upstream_dataset_events = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
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
  get_dataset,
  get_dataset_events,
  get_datasets,
  get_upstream_dataset_events,
};
