/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket List the fields to include for returned resources of type ageRatingDeclarations (optional)
* fieldsLeft_Square_BracketappInfosRight_Square_Bracket List the fields to include for returned resources of type appInfos (optional)
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appInfoLocalizations (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppInfosResponse
* */
const appsAppInfosGet_to_many_related = ({ id, fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketappInfosRight_Square_Bracket, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket, fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfosRight_Square_Bracket,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limit,
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
* filterLeft_Square_BracketappStoreStateRight_Square_Bracket List filter by attribute 'appStoreState' (optional)
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketversionStringRight_Square_Bracket List filter by attribute 'versionString' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket List the fields to include for returned resources of type idfaDeclarations (optional)
* fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionLocalizations (optional)
* fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket List the fields to include for returned resources of type routingAppCoverages (optional)
* fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
* fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket List the fields to include for returned resources of type ageRatingDeclarations (optional)
* fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type appStoreReviewDetails (optional)
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionSubmissions (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppStoreVersionsResponse
* */
const appsAppStoreVersionsGet_to_many_related = ({ id, filterLeft_Square_BracketappStoreStateRight_Square_Bracket, filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketversionStringRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket, fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketappStoreStateRight_Square_Bracket,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketversionStringRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        fieldsLeft_Square_BracketidfaDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketroutingAppCoveragesRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionPhasedReleasesRight_Square_Bracket,
        fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreReviewDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionSubmissionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limit,
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
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* limit Integer maximum resources per page (optional)
* returns TerritoriesResponse
* */
const appsAvailableTerritoriesGet_to_many_related = ({ id, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaAppLocalizations (optional)
* limit Integer maximum resources per page (optional)
* returns BetaAppLocalizationsResponse
* */
const appsBetaAppLocalizationsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewDetails (optional)
* returns BetaAppReviewDetailResponse
* */
const appsBetaAppReviewDetailGet_to_one_related = ({ id, fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* limit Integer maximum resources per page (optional)
* returns BetaGroupsResponse
* */
const appsBetaGroupsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type betaLicenseAgreements (optional)
* returns BetaLicenseAgreementResponse
* */
const appsBetaLicenseAgreementGet_to_one_related = ({ id, fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket,
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
* appBetaTestersLinkagesRequest AppBetaTestersLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const appsBetaTestersDelete_to_many_relationship = ({ id, appBetaTestersLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appBetaTestersLinkagesRequest,
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
* limit Integer maximum resources per page (optional)
* returns BuildsResponse
* */
const appsBuildsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type endUserLicenseAgreements (optional)
* returns EndUserLicenseAgreementResponse
* */
const appsEndUserLicenseAgreementGet_to_one_related = ({ id, fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket,
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
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketversionStringRight_Square_Bracket List filter by attribute 'versionString' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket List the fields to include for returned resources of type gameCenterEnabledVersions (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns GameCenterEnabledVersionsResponse
* */
const appsGameCenterEnabledVersionsGet_to_many_related = ({ id, filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketversionStringRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketversionStringRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limit,
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
* filterLeft_Square_BracketappStoreVersionsPeriodappStoreStateRight_Square_Bracket List filter by attribute 'appStoreVersions.appStoreState' (optional)
* filterLeft_Square_BracketappStoreVersionsPeriodplatformRight_Square_Bracket List filter by attribute 'appStoreVersions.platform' (optional)
* filterLeft_Square_BracketbundleIdRight_Square_Bracket List filter by attribute 'bundleId' (optional)
* filterLeft_Square_BracketnameRight_Square_Bracket List filter by attribute 'name' (optional)
* filterLeft_Square_BracketskuRight_Square_Bracket List filter by attribute 'sku' (optional)
* filterLeft_Square_BracketappStoreVersionsRight_Square_Bracket List filter by id(s) of related 'appStoreVersions' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* existsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket List filter by existence or non-existence of related 'gameCenterEnabledVersions' (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket List the fields to include for returned resources of type perfPowerMetrics (optional)
* fieldsLeft_Square_BracketappInfosRight_Square_Bracket List the fields to include for returned resources of type appInfos (optional)
* fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket List the fields to include for returned resources of type appPreOrders (optional)
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* fieldsLeft_Square_BracketappPricesRight_Square_Bracket List the fields to include for returned resources of type appPrices (optional)
* fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket List the fields to include for returned resources of type inAppPurchases (optional)
* fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewDetails (optional)
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket List the fields to include for returned resources of type gameCenterEnabledVersions (optional)
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaAppLocalizations (optional)
* fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type betaLicenseAgreements (optional)
* fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type endUserLicenseAgreements (optional)
* limitLeft_Square_BracketappInfosRight_Square_Bracket Integer maximum number of related appInfos returned (when they are included) (optional)
* limitLeft_Square_BracketappStoreVersionsRight_Square_Bracket Integer maximum number of related appStoreVersions returned (when they are included) (optional)
* limitLeft_Square_BracketavailableTerritoriesRight_Square_Bracket Integer maximum number of related availableTerritories returned (when they are included) (optional)
* limitLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket Integer maximum number of related betaAppLocalizations returned (when they are included) (optional)
* limitLeft_Square_BracketbetaGroupsRight_Square_Bracket Integer maximum number of related betaGroups returned (when they are included) (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* limitLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket Integer maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
* limitLeft_Square_BracketinAppPurchasesRight_Square_Bracket Integer maximum number of related inAppPurchases returned (when they are included) (optional)
* limitLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket Integer maximum number of related preReleaseVersions returned (when they are included) (optional)
* limitLeft_Square_BracketpricesRight_Square_Bracket Integer maximum number of related prices returned (when they are included) (optional)
* returns AppsResponse
* */
const appsGet_collection = ({ filterLeft_Square_BracketappStoreVersionsPeriodappStoreStateRight_Square_Bracket, filterLeft_Square_BracketappStoreVersionsPeriodplatformRight_Square_Bracket, filterLeft_Square_BracketbundleIdRight_Square_Bracket, filterLeft_Square_BracketnameRight_Square_Bracket, filterLeft_Square_BracketskuRight_Square_Bracket, filterLeft_Square_BracketappStoreVersionsRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, existsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, sort, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket, fieldsLeft_Square_BracketappInfosRight_Square_Bracket, fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappPricesRight_Square_Bracket, fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket, fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket, fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket, limitLeft_Square_BracketappInfosRight_Square_Bracket, limitLeft_Square_BracketappStoreVersionsRight_Square_Bracket, limitLeft_Square_BracketavailableTerritoriesRight_Square_Bracket, limitLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, limitLeft_Square_BracketbetaGroupsRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket, limitLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, limitLeft_Square_BracketinAppPurchasesRight_Square_Bracket, limitLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, limitLeft_Square_BracketpricesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketappStoreVersionsPeriodappStoreStateRight_Square_Bracket,
        filterLeft_Square_BracketappStoreVersionsPeriodplatformRight_Square_Bracket,
        filterLeft_Square_BracketbundleIdRight_Square_Bracket,
        filterLeft_Square_BracketnameRight_Square_Bracket,
        filterLeft_Square_BracketskuRight_Square_Bracket,
        filterLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        existsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfosRight_Square_Bracket,
        fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappPricesRight_Square_Bracket,
        fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
        fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket,
        fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket,
        limitLeft_Square_BracketappInfosRight_Square_Bracket,
        limitLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        limitLeft_Square_BracketavailableTerritoriesRight_Square_Bracket,
        limitLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
        limitLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        limitLeft_Square_BracketbuildsRight_Square_Bracket,
        limitLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        limitLeft_Square_BracketinAppPurchasesRight_Square_Bracket,
        limitLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        limitLeft_Square_BracketpricesRight_Square_Bracket,
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
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket List the fields to include for returned resources of type perfPowerMetrics (optional)
* fieldsLeft_Square_BracketappInfosRight_Square_Bracket List the fields to include for returned resources of type appInfos (optional)
* fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket List the fields to include for returned resources of type appPreOrders (optional)
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* fieldsLeft_Square_BracketappPricesRight_Square_Bracket List the fields to include for returned resources of type appPrices (optional)
* fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket List the fields to include for returned resources of type inAppPurchases (optional)
* fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewDetails (optional)
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket List the fields to include for returned resources of type gameCenterEnabledVersions (optional)
* fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersions (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaAppLocalizations (optional)
* fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type betaLicenseAgreements (optional)
* fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type endUserLicenseAgreements (optional)
* limitLeft_Square_BracketappInfosRight_Square_Bracket Integer maximum number of related appInfos returned (when they are included) (optional)
* limitLeft_Square_BracketappStoreVersionsRight_Square_Bracket Integer maximum number of related appStoreVersions returned (when they are included) (optional)
* limitLeft_Square_BracketavailableTerritoriesRight_Square_Bracket Integer maximum number of related availableTerritories returned (when they are included) (optional)
* limitLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket Integer maximum number of related betaAppLocalizations returned (when they are included) (optional)
* limitLeft_Square_BracketbetaGroupsRight_Square_Bracket Integer maximum number of related betaGroups returned (when they are included) (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* limitLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket Integer maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
* limitLeft_Square_BracketinAppPurchasesRight_Square_Bracket Integer maximum number of related inAppPurchases returned (when they are included) (optional)
* limitLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket Integer maximum number of related preReleaseVersions returned (when they are included) (optional)
* limitLeft_Square_BracketpricesRight_Square_Bracket Integer maximum number of related prices returned (when they are included) (optional)
* returns AppResponse
* */
const appsGet_instance = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket, include, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket, fieldsLeft_Square_BracketappInfosRight_Square_Bracket, fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappPricesRight_Square_Bracket, fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket, fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket, fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket, limitLeft_Square_BracketappInfosRight_Square_Bracket, limitLeft_Square_BracketappStoreVersionsRight_Square_Bracket, limitLeft_Square_BracketavailableTerritoriesRight_Square_Bracket, limitLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, limitLeft_Square_BracketbetaGroupsRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket, limitLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, limitLeft_Square_BracketinAppPurchasesRight_Square_Bracket, limitLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, limitLeft_Square_BracketpricesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        fieldsLeft_Square_BracketperfPowerMetricsRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfosRight_Square_Bracket,
        fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappPricesRight_Square_Bracket,
        fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
        fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket,
        fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket,
        limitLeft_Square_BracketappInfosRight_Square_Bracket,
        limitLeft_Square_BracketappStoreVersionsRight_Square_Bracket,
        limitLeft_Square_BracketavailableTerritoriesRight_Square_Bracket,
        limitLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
        limitLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        limitLeft_Square_BracketbuildsRight_Square_Bracket,
        limitLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        limitLeft_Square_BracketinAppPurchasesRight_Square_Bracket,
        limitLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        limitLeft_Square_BracketpricesRight_Square_Bracket,
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
* filterLeft_Square_BracketinAppPurchaseTypeRight_Square_Bracket List filter by attribute 'inAppPurchaseType' (optional)
* filterLeft_Square_BracketcanBeSubmittedRight_Square_Bracket List filter by canBeSubmitted (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket List the fields to include for returned resources of type inAppPurchases (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns InAppPurchasesResponse
* */
const appsInAppPurchasesGet_to_many_related = ({ id, filterLeft_Square_BracketinAppPurchaseTypeRight_Square_Bracket, filterLeft_Square_BracketcanBeSubmittedRight_Square_Bracket, sort, fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketinAppPurchaseTypeRight_Square_Bracket,
        filterLeft_Square_BracketcanBeSubmittedRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limit,
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
* filterLeft_Square_BracketdeviceTypeRight_Square_Bracket List filter by attribute 'deviceType' (optional)
* filterLeft_Square_BracketmetricTypeRight_Square_Bracket List filter by attribute 'metricType' (optional)
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* returns PerfPowerMetricsResponse
* */
const appsPerfPowerMetricsGet_to_many_related = ({ id, filterLeft_Square_BracketdeviceTypeRight_Square_Bracket, filterLeft_Square_BracketmetricTypeRight_Square_Bracket, filterLeft_Square_BracketplatformRight_Square_Bracket }) => new Promise(
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
* fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket List the fields to include for returned resources of type appPreOrders (optional)
* returns AppPreOrderResponse
* */
const appsPreOrderGet_to_one_related = ({ id, fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPreOrdersRight_Square_Bracket,
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
* limit Integer maximum resources per page (optional)
* returns PreReleaseVersionsResponse
* */
const appsPreReleaseVersionsGet_to_many_related = ({ id, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappPricesRight_Square_Bracket List the fields to include for returned resources of type appPrices (optional)
* fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket List the fields to include for returned resources of type appPriceTiers (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppPricesResponse
* */
const appsPricesGet_to_many_related = ({ id, fieldsLeft_Square_BracketappPricesRight_Square_Bracket, fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPricesRight_Square_Bracket,
        fieldsLeft_Square_BracketappPriceTiersRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limit,
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
* appUpdateRequest AppUpdateRequest App representation
* returns AppResponse
* */
const appsUpdate_instance = ({ id, appUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appUpdateRequest,
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
  appsAppInfosGet_to_many_related,
  appsAppStoreVersionsGet_to_many_related,
  appsAvailableTerritoriesGet_to_many_related,
  appsBetaAppLocalizationsGet_to_many_related,
  appsBetaAppReviewDetailGet_to_one_related,
  appsBetaGroupsGet_to_many_related,
  appsBetaLicenseAgreementGet_to_one_related,
  appsBetaTestersDelete_to_many_relationship,
  appsBuildsGet_to_many_related,
  appsEndUserLicenseAgreementGet_to_one_related,
  appsGameCenterEnabledVersionsGet_to_many_related,
  appsGet_collection,
  appsGet_instance,
  appsInAppPurchasesGet_to_many_related,
  appsPerfPowerMetricsGet_to_many_related,
  appsPreOrderGet_to_one_related,
  appsPreReleaseVersionsGet_to_many_related,
  appsPricesGet_to_many_related,
  appsUpdate_instance,
};
