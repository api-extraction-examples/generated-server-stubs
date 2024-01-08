/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Assign workflow scheme to project
* Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.  Workflow schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* workflowSchemeProjectAssociation WorkflowSchemeProjectAssociation 
* returns oas_any_type_not_mapped
* */
const assignSchemeToProject = ({ workflowSchemeProjectAssociation }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workflowSchemeProjectAssociation,
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
* Get workflow scheme project associations
* Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any team-managed or non-existent projects in the request are ignored and no errors are returned.  If the project is associated with the `Default Workflow Scheme` no ID is returned. This is because the way the `Default Workflow Scheme` is stored means it has no ID.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectId Set The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, `projectId=10000&projectId=10001`.
* returns ContainerOfWorkflowSchemeAssociations
* */
const getWorkflowSchemeProjectAssociations = ({ projectId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
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
  assignSchemeToProject,
  getWorkflowSchemeProjectAssociations,
};
