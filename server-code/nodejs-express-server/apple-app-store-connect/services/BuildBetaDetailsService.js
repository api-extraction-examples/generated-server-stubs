/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BuildResponse
* */
const buildBetaDetailsBuildGet_to_one_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
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
* filterLeft_Square_BracketbuildRight_Square_Bracket List filter by id(s) of related 'build' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket List the fields to include for returned resources of type buildBetaDetails (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BuildBetaDetailsResponse
* */
const buildBetaDetailsGet_collection = ({ filterLeft_Square_BracketbuildRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketbuildRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket,
        limit,
        include,
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
* fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket List the fields to include for returned resources of type buildBetaDetails (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BuildBetaDetailResponse
* */
const buildBetaDetailsGet_instance = ({ id, fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildBetaDetailsRight_Square_Bracket,
        include,
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
* buildBetaDetailUpdateRequest BuildBetaDetailUpdateRequest BuildBetaDetail representation
* returns BuildBetaDetailResponse
* */
const buildBetaDetailsUpdate_instance = ({ id, buildBetaDetailUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        buildBetaDetailUpdateRequest,
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
  buildBetaDetailsBuildGet_to_one_related,
  buildBetaDetailsGet_collection,
  buildBetaDetailsGet_instance,
  buildBetaDetailsUpdate_instance,
};
