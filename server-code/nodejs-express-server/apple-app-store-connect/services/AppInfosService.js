/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket List the fields to include for returned resources of type ageRatingDeclarations (optional)
* returns AgeRatingDeclarationResponse
* */
const appInfosAgeRatingDeclarationGet_to_one_related = ({ id, fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket }) => new Promise(
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
* filterLeft_Square_BracketlocaleRight_Square_Bracket List filter by attribute 'locale' (optional)
* fieldsLeft_Square_BracketappInfosRight_Square_Bracket List the fields to include for returned resources of type appInfos (optional)
* fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appInfoLocalizations (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppInfoLocalizationsResponse
* */
const appInfosAppInfoLocalizationsGet_to_many_related = ({ id, filterLeft_Square_BracketlocaleRight_Square_Bracket, fieldsLeft_Square_BracketappInfosRight_Square_Bracket, fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketlocaleRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfosRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappInfosRight_Square_Bracket List the fields to include for returned resources of type appInfos (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket List the fields to include for returned resources of type ageRatingDeclarations (optional)
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appInfoLocalizations (optional)
* limitLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket Integer maximum number of related appInfoLocalizations returned (when they are included) (optional)
* returns AppInfoResponse
* */
const appInfosGet_instance = ({ id, fieldsLeft_Square_BracketappInfosRight_Square_Bracket, include, fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket, fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket, limitLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappInfosRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketageRatingDeclarationsRight_Square_Bracket,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
        fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket,
        limitLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appInfosPrimaryCategoryGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appInfosPrimarySubcategoryOneGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appInfosPrimarySubcategoryTwoGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appInfosSecondaryCategoryGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appInfosSecondarySubcategoryOneGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket List the fields to include for returned resources of type appCategories (optional)
* returns AppCategoryResponse
* */
const appInfosSecondarySubcategoryTwoGet_to_one_related = ({ id, fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappCategoriesRight_Square_Bracket,
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
* appInfoUpdateRequest AppInfoUpdateRequest AppInfo representation
* returns AppInfoResponse
* */
const appInfosUpdate_instance = ({ id, appInfoUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appInfoUpdateRequest,
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
  appInfosAgeRatingDeclarationGet_to_one_related,
  appInfosAppInfoLocalizationsGet_to_many_related,
  appInfosGet_instance,
  appInfosPrimaryCategoryGet_to_one_related,
  appInfosPrimarySubcategoryOneGet_to_one_related,
  appInfosPrimarySubcategoryTwoGet_to_one_related,
  appInfosSecondaryCategoryGet_to_one_related,
  appInfosSecondarySubcategoryOneGet_to_one_related,
  appInfosSecondarySubcategoryTwoGet_to_one_related,
  appInfosUpdate_instance,
};
