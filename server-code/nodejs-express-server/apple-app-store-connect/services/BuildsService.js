/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket List the fields to include for returned resources of type appEncryptionDeclarations (optional)
* returns AppEncryptionDeclarationResponse
* */
const buildsAppEncryptionDeclarationGet_to_one_related = ({ id, fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket,
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
* returns BuildAppEncryptionDeclarationLinkageResponse
* */
const buildsAppEncryptionDeclarationGet_to_one_relationship = ({ id }) => new Promise(
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
* buildAppEncryptionDeclarationLinkageRequest BuildAppEncryptionDeclarationLinkageRequest Related linkage
* no response value expected for this operation
* */
const buildsAppEncryptionDeclarationUpdate_to_one_relationship = ({ id, buildAppEncryptionDeclarationLinkageRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildAppEncryptionDeclarationLinkageRequest,
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
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const buildsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* returns AppStoreVersionResponse
* */
const buildsAppStoreVersionGet_to_one_related = ({ id, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewSubmissions (optional)
* returns BetaAppReviewSubmissionResponse
* */
const buildsBetaAppReviewSubmissionGet_to_one_related = ({ id, fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaBuildLocalizations (optional)
* limit Integer maximum resources per page (optional)
* returns BetaBuildLocalizationsResponse
* */
const buildsBetaBuildLocalizationsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
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
* buildBetaGroupsLinkagesRequest BuildBetaGroupsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const buildsBetaGroupsCreate_to_many_relationship = ({ id, buildBetaGroupsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildBetaGroupsLinkagesRequest,
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
* buildBetaGroupsLinkagesRequest BuildBetaGroupsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const buildsBetaGroupsDelete_to_many_relationship = ({ id, buildBetaGroupsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildBetaGroupsLinkagesRequest,
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
* fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket List the fields to include for returned resources of type buildBetaDetails (optional)
* returns BuildBetaDetailResponse
* */
const buildsBuildBetaDetailGet_to_one_related = ({ id, fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket,
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
* filterLeft_Square_BracketdiagnosticTypeRight_Square_Bracket List filter by attribute 'diagnosticType' (optional)
* fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket List the fields to include for returned resources of type diagnosticSignatures (optional)
* limit Integer maximum resources per page (optional)
* returns DiagnosticSignaturesResponse
* */
const buildsDiagnosticSignaturesGet_to_many_related = ({ id, filterLeft_Square_BracketdiagnosticTypeRight_Square_Bracket, fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketdiagnosticTypeRight_Square_Bracket,
        fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket,
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
* filterLeft_Square_BracketbetaAppReviewSubmissionPeriodbetaReviewStateRight_Square_Bracket List filter by attribute 'betaAppReviewSubmission.betaReviewState' (optional)
* filterLeft_Square_BracketexpiredRight_Square_Bracket List filter by attribute 'expired' (optional)
* filterLeft_Square_BracketpreReleaseVersionPeriodplatformRight_Square_Bracket List filter by attribute 'preReleaseVersion.platform' (optional)
* filterLeft_Square_BracketpreReleaseVersionPeriodversionRight_Square_Bracket List filter by attribute 'preReleaseVersion.version' (optional)
* filterLeft_Square_BracketprocessingStateRight_Square_Bracket List filter by attribute 'processingState' (optional)
* filterLeft_Square_BracketusesNonExemptEncryptionRight_Square_Bracket List filter by attribute 'usesNonExemptEncryption' (optional)
* filterLeft_Square_BracketversionRight_Square_Bracket List filter by attribute 'version' (optional)
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* filterLeft_Square_BracketappStoreVersionRight_Square_Bracket List filter by id(s) of related 'appStoreVersion' (optional)
* filterLeft_Square_BracketbetaGroupsRight_Square_Bracket List filter by id(s) of related 'betaGroups' (optional)
* filterLeft_Square_BracketpreReleaseVersionRight_Square_Bracket List filter by id(s) of related 'preReleaseVersion' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket List the fields to include for returned resources of type appEncryptionDeclarations (optional)
* fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewSubmissions (optional)
* fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket List the fields to include for returned resources of type buildBetaDetails (optional)
* fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket List the fields to include for returned resources of type buildIcons (optional)
* fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket List the fields to include for returned resources of type perfPowerMetrics (optional)
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket List the fields to include for returned resources of type diagnosticSignatures (optional)
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaBuildLocalizations (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket Integer maximum number of related betaBuildLocalizations returned (when they are included) (optional)
* limitLeft_Square_BracketiconsRight_Square_Bracket Integer maximum number of related icons returned (when they are included) (optional)
* limitLeft_Square_BracketindividualTestersRight_Square_Bracket Integer maximum number of related individualTesters returned (when they are included) (optional)
* returns BuildsResponse
* */
const buildsGet_collection = ({ filterLeft_Square_BracketbetaAppReviewSubmissionPeriodbetaReviewStateRight_Square_Bracket, filterLeft_Square_BracketexpiredRight_Square_Bracket, filterLeft_Square_BracketpreReleaseVersionPeriodplatformRight_Square_Bracket, filterLeft_Square_BracketpreReleaseVersionPeriodversionRight_Square_Bracket, filterLeft_Square_BracketprocessingStateRight_Square_Bracket, filterLeft_Square_BracketusesNonExemptEncryptionRight_Square_Bracket, filterLeft_Square_BracketversionRight_Square_Bracket, filterLeft_Square_BracketappRight_Square_Bracket, filterLeft_Square_BracketappStoreVersionRight_Square_Bracket, filterLeft_Square_BracketbetaGroupsRight_Square_Bracket, filterLeft_Square_BracketpreReleaseVersionRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket, fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket, fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket, fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, limitLeft_Square_BracketiconsRight_Square_Bracket, limitLeft_Square_BracketindividualTestersRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketbetaAppReviewSubmissionPeriodbetaReviewStateRight_Square_Bracket,
        filterLeft_Square_BracketexpiredRight_Square_Bracket,
        filterLeft_Square_BracketpreReleaseVersionPeriodplatformRight_Square_Bracket,
        filterLeft_Square_BracketpreReleaseVersionPeriodversionRight_Square_Bracket,
        filterLeft_Square_BracketprocessingStateRight_Square_Bracket,
        filterLeft_Square_BracketusesNonExemptEncryptionRight_Square_Bracket,
        filterLeft_Square_BracketversionRight_Square_Bracket,
        filterLeft_Square_BracketappRight_Square_Bracket,
        filterLeft_Square_BracketappStoreVersionRight_Square_Bracket,
        filterLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        filterLeft_Square_BracketpreReleaseVersionRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket,
        fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
        limitLeft_Square_BracketiconsRight_Square_Bracket,
        limitLeft_Square_BracketindividualTestersRight_Square_Bracket,
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
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket List the fields to include for returned resources of type appEncryptionDeclarations (optional)
* fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewSubmissions (optional)
* fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket List the fields to include for returned resources of type buildBetaDetails (optional)
* fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket List the fields to include for returned resources of type buildIcons (optional)
* fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket List the fields to include for returned resources of type perfPowerMetrics (optional)
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket List the fields to include for returned resources of type diagnosticSignatures (optional)
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaBuildLocalizations (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket Integer maximum number of related betaBuildLocalizations returned (when they are included) (optional)
* limitLeft_Square_BracketiconsRight_Square_Bracket Integer maximum number of related icons returned (when they are included) (optional)
* limitLeft_Square_BracketindividualTestersRight_Square_Bracket Integer maximum number of related individualTesters returned (when they are included) (optional)
* returns BuildResponse
* */
const buildsGet_instance = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, include, fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket, fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket, fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket, fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, limitLeft_Square_BracketiconsRight_Square_Bracket, limitLeft_Square_BracketindividualTestersRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket,
        fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketdiagnosticSignaturesRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
        limitLeft_Square_BracketiconsRight_Square_Bracket,
        limitLeft_Square_BracketindividualTestersRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket List the fields to include for returned resources of type buildIcons (optional)
* limit Integer maximum resources per page (optional)
* returns BuildIconsResponse
* */
const buildsIconsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildIconsRight_Square_Bracket,
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
* buildIndividualTestersLinkagesRequest BuildIndividualTestersLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const buildsIndividualTestersCreate_to_many_relationship = ({ id, buildIndividualTestersLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildIndividualTestersLinkagesRequest,
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
* buildIndividualTestersLinkagesRequest BuildIndividualTestersLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const buildsIndividualTestersDelete_to_many_relationship = ({ id, buildIndividualTestersLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildIndividualTestersLinkagesRequest,
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
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* limit Integer maximum resources per page (optional)
* returns BetaTestersResponse
* */
const buildsIndividualTestersGet_to_many_related = ({ id, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
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
* limit Integer maximum resources per page (optional)
* returns BuildIndividualTestersLinkagesResponse
* */
const buildsIndividualTestersGet_to_many_relationship = ({ id, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* filterLeft_Square_BracketdeviceTypeRight_Square_Bracket List filter by attribute 'deviceType' (optional)
* filterLeft_Square_BracketmetricTypeRight_Square_Bracket List filter by attribute 'metricType' (optional)
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* returns PerfPowerMetricsResponse
* */
const buildsPerfPowerMetricsGet_to_many_related = ({ id, filterLeft_Square_BracketdeviceTypeRight_Square_Bracket, filterLeft_Square_BracketmetricTypeRight_Square_Bracket, filterLeft_Square_BracketplatformRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketdeviceTypeRight_Square_Bracket,
        filterLeft_Square_BracketmetricTypeRight_Square_Bracket,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
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
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* returns PrereleaseVersionResponse
* */
const buildsPreReleaseVersionGet_to_one_related = ({ id, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
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
* buildUpdateRequest BuildUpdateRequest Build representation
* returns BuildResponse
* */
const buildsUpdate_instance = ({ id, buildUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildUpdateRequest,
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
  buildsAppEncryptionDeclarationGet_to_one_related,
  buildsAppEncryptionDeclarationGet_to_one_relationship,
  buildsAppEncryptionDeclarationUpdate_to_one_relationship,
  buildsAppGet_to_one_related,
  buildsAppStoreVersionGet_to_one_related,
  buildsBetaAppReviewSubmissionGet_to_one_related,
  buildsBetaBuildLocalizationsGet_to_many_related,
  buildsBetaGroupsCreate_to_many_relationship,
  buildsBetaGroupsDelete_to_many_relationship,
  buildsBuildBetaDetailGet_to_one_related,
  buildsDiagnosticSignaturesGet_to_many_related,
  buildsGet_collection,
  buildsGet_instance,
  buildsIconsGet_to_many_related,
  buildsIndividualTestersCreate_to_many_relationship,
  buildsIndividualTestersDelete_to_many_relationship,
  buildsIndividualTestersGet_to_many_related,
  buildsIndividualTestersGet_to_many_relationship,
  buildsPerfPowerMetricsGet_to_many_related,
  buildsPreReleaseVersionGet_to_one_related,
  buildsUpdate_instance,
};
