/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get project features
* Returns the list of features for a project.
*
* projectIdOrKey String The ID or (case-sensitive) key of the project.
* returns ContainerForProjectFeatures
* */
const getFeaturesForProject = ({ projectIdOrKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
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
* Set project feature state
* Sets the state of a project feature.
*
* projectIdOrKey String The ID or (case-sensitive) key of the project.
* featureKey String The key of the feature.
* projectFeatureState ProjectFeatureState Details of the feature state change.
* returns ContainerForProjectFeatures
* */
const toggleFeatureForProject = ({ projectIdOrKey, featureKey, projectFeatureState }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        featureKey,
        projectFeatureState,
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
  getFeaturesForProject,
  toggleFeatureForProject,
};
