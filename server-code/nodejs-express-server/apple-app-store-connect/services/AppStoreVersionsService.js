/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket List the fields to include for returned resources of type ageRatingDeclarations (optional)
* returns AgeRatingDeclarationResponse
* */
const appStoreVersionsAgeRatingDeclarationGet_to_one_related = ({ id, fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewDetails (optional)
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewAttachments (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppStoreReviewDetailResponse
* */
const appStoreVersionsAppStoreReviewDetailGet_to_one_related = ({ id, fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreReviewAttachmentsRight_Square_Bracket,
        include,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionLocalizations (optional)
* limit Integer maximum resources per page (optional)
* returns AppStoreVersionLocalizationsResponse
* */
const appStoreVersionsAppStoreVersionLocalizationsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
        limit,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
* returns AppStoreVersionPhasedReleaseResponse
* */
const appStoreVersionsAppStoreVersionPhasedReleaseGet_to_one_related = ({ id, fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionSubmissions (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppStoreVersionSubmissionResponse
* */
const appStoreVersionsAppStoreVersionSubmissionGet_to_one_related = ({ id, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket,
        include,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BuildResponse
* */
const appStoreVersionsBuildGet_to_one_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
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
*
* id String the id of the requested resource
* returns AppStoreVersionBuildLinkageResponse
* */
const appStoreVersionsBuildGet_to_one_relationship = ({ id }) => new Promise(
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
*
* id String the id of the requested resource
* appStoreVersionBuildLinkageRequest AppStoreVersionBuildLinkageRequest Related linkage
* no response value expected for this operation
* */
const appStoreVersionsBuildUpdate_to_one_relationship = ({ id, appStoreVersionBuildLinkageRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appStoreVersionBuildLinkageRequest,
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
*
* appStoreVersionCreateRequest AppStoreVersionCreateRequest AppStoreVersion representation
* returns AppStoreVersionResponse
* */
const appStoreVersionsCreate_instance = ({ appStoreVersionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appStoreVersionCreateRequest,
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
*
* id String the id of the requested resource
* no response value expected for this operation
* */
const appStoreVersionsDelete_instance = ({ id }) => new Promise(
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionLocalizations (optional)
* fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket List the fields to include for returned resources of type idfaDeclarations (optional)
* fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket List the fields to include for returned resources of type routingAppCoverages (optional)
* fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
* fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket List the fields to include for returned resources of type ageRatingDeclarations (optional)
* fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewDetails (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionSubmissions (optional)
* limitLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket Integer maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
* returns AppStoreVersionResponse
* */
const appStoreVersionsGet_instance = ({ id, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, include, fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket, fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket, limitLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket,
        fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket,
        limitLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket List the fields to include for returned resources of type idfaDeclarations (optional)
* returns IdfaDeclarationResponse
* */
const appStoreVersionsIdfaDeclarationGet_to_one_related = ({ id, fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket,
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
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket List the fields to include for returned resources of type routingAppCoverages (optional)
* returns RoutingAppCoverageResponse
* */
const appStoreVersionsRoutingAppCoverageGet_to_one_related = ({ id, fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket,
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
*
* id String the id of the requested resource
* appStoreVersionUpdateRequest AppStoreVersionUpdateRequest AppStoreVersion representation
* returns AppStoreVersionResponse
* */
const appStoreVersionsUpdate_instance = ({ id, appStoreVersionUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appStoreVersionUpdateRequest,
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
  appStoreVersionsAgeRatingDeclarationGet_to_one_related,
  appStoreVersionsAppStoreReviewDetailGet_to_one_related,
  appStoreVersionsAppStoreVersionLocalizationsGet_to_many_related,
  appStoreVersionsAppStoreVersionPhasedReleaseGet_to_one_related,
  appStoreVersionsAppStoreVersionSubmissionGet_to_one_related,
  appStoreVersionsBuildGet_to_one_related,
  appStoreVersionsBuildGet_to_one_relationship,
  appStoreVersionsBuildUpdate_to_one_relationship,
  appStoreVersionsCreate_instance,
  appStoreVersionsDelete_instance,
  appStoreVersionsGet_instance,
  appStoreVersionsIdfaDeclarationGet_to_one_related,
  appStoreVersionsRoutingAppCoverageGet_to_one_related,
  appStoreVersionsUpdate_instance,
};
