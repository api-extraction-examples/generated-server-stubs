/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Set dependencies for a task
* Marks a set of tasks as dependencies of this task, if they are not already dependencies. *A task can have at most 30 dependents and dependencies combined*.
*
* taskUnderscoregid String The task to operate on.
* addDependenciesForTaskRequest AddDependenciesForTaskRequest The list of tasks to set as dependencies.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const addDependenciesForTask = ({ taskUnderscoregid, addDependenciesForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addDependenciesForTaskRequest,
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
* Set dependents for a task
* Marks a set of tasks as dependents of this task, if they are not already dependents. *A task can have at most 30 dependents and dependencies combined*.
*
* taskUnderscoregid String The task to operate on.
* addDependentsForTaskRequest AddDependentsForTaskRequest The list of tasks to add as dependents.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const addDependentsForTask = ({ taskUnderscoregid, addDependentsForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addDependentsForTaskRequest,
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
* Add followers to a task
* Adds followers to a task. Returns an empty data block. Each task can be associated with zero or more followers in the system. Requests to add/remove followers, if successful, will return the complete updated task record, described above.
*
* taskUnderscoregid String The task to operate on.
* addFollowersRequest AddFollowersRequest The followers to add to the task.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const addFollowersForTask = ({ taskUnderscoregid, addFollowersRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addFollowersRequest,
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
* Add a project to a task
* Adds the task to the specified project, in the optional location specified. If no location arguments are given, the task will be added to the end of the project.  `addProject` can also be used to reorder a task within a project or section that already contains it.  At most one of `insert_before`, `insert_after`, or `section` should be specified. Inserting into a section in an non-order-dependent way can be done by specifying section, otherwise, to insert within a section in a particular place, specify `insert_before` or `insert_after` and a task within the section to anchor the position of this task.  Returns an empty data block.
*
* taskUnderscoregid String The task to operate on.
* addProjectForTaskRequest AddProjectForTaskRequest The project to add the task to.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const addProjectForTask = ({ taskUnderscoregid, addProjectForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addProjectForTaskRequest,
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
* Add a tag to a task
* Adds a tag to a task. Returns an empty data block.
*
* taskUnderscoregid String The task to operate on.
* addTagForTaskRequest AddTagForTaskRequest The tag to add to the task.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const addTagForTask = ({ taskUnderscoregid, addTagForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addTagForTaskRequest,
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
* Create a subtask
* Creates a new subtask and adds it to the parent task. Returns the full record for the newly created subtask.
*
* taskUnderscoregid String The task to operate on.
* createTaskRequest CreateTaskRequest The new subtask to create.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const createSubtaskForTask = ({ taskUnderscoregid, createTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        createTaskRequest,
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
* Create a task
* Creating a new task is as easy as POSTing to the `/tasks` endpoint with a data block containing the fields you’d like to set on the task. Any unspecified fields will take on default values.  Every task is required to be created in a specific workspace, and this workspace cannot be changed once set. The workspace need not be set explicitly if you specify `projects` or a `parent` task instead.
*
* createTaskRequest CreateTaskRequest The task to create.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const createTask = ({ createTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createTaskRequest,
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
* Delete a task
* A specific, existing task can be deleted by making a DELETE request on the URL for that task. Deleted tasks go into the “trash” of the user making the delete request. Tasks can be recovered from the trash within a period of 30 days; afterward they are completely removed from the system.  Returns an empty data record.
*
* taskUnderscoregid String The task to operate on.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const deleteTask = ({ taskUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
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
* Duplicate a task
* Creates and returns a job that will asynchronously handle the duplication.
*
* taskUnderscoregid String The task to operate on.
* duplicateTaskRequest DuplicateTaskRequest Describes the duplicate's name and the fields that will be duplicated.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getJob_200_response
* */
const duplicateTask = ({ taskUnderscoregid, duplicateTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        duplicateTaskRequest,
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
* Get dependencies from a task
* Returns the compact representations of all of the dependencies of a task.
*
* taskUnderscoregid String The task to operate on.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getDependenciesForTask = ({ taskUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get dependents from a task
* Returns the compact representations of all of the dependents of a task.
*
* taskUnderscoregid String The task to operate on.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getDependentsForTask = ({ taskUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get subtasks from a task
* Returns a compact representation of all of the subtasks of a task.
*
* taskUnderscoregid String The task to operate on.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getSubtasksForTask = ({ taskUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get a task
* Returns the complete task record for a single task.
*
* taskUnderscoregid String The task to operate on.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const getTask = ({ taskUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
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
* Get multiple tasks
* Returns the compact task records for some filtered set of tasks. Use one or more of the parameters provided to filter the tasks returned. You must specify a `project` or `tag` if you do not specify `assignee` and `workspace`.  For more complex task retrieval, use [workspaces/{workspace_gid}/tasks/search](/docs/search-tasks-in-a-workspace).
*
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* assignee String The assignee to filter tasks on. If searching for unassigned tasks, assignee.any = null can be specified. *Note: If you specify `assignee`, you must also specify the `workspace` to filter on.* (optional)
* project String The project to filter tasks on. (optional)
* section String The section to filter tasks on. *Note: Currently, this is only supported in board views.* (optional)
* workspace String The workspace to filter tasks on. *Note: If you specify `workspace`, you must also specify the `assignee` to filter on.* (optional)
* completedUnderscoresince Date Only return tasks that are either incomplete or that have been completed since this time. (optional)
* modifiedUnderscoresince Date Only return tasks that have been modified since the given time.  *Note: A task is considered “modified” if any of its properties change, or associations between it and other objects are modified (e.g.  a task being added to a project). A task is not considered modified just because another object it is associated with (e.g. a subtask) is modified. Actions that count as modifying the task include assigning, renaming, completing, and adding stories.* (optional)
* returns getTasksForProject_200_response
* */
const getTasks = ({ optUnderscorepretty, optUnderscorefields, limit, offset, assignee, project, section, workspace, completedUnderscoresince, modifiedUnderscoresince }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
        assignee,
        project,
        section,
        workspace,
        completedUnderscoresince,
        modifiedUnderscoresince,
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
* Get tasks from a project
* Returns the compact task records for all tasks within the given project, ordered by their priority within the project. Tasks can exist in more than one project at a time.
*
* projectUnderscoregid String Globally unique identifier for the project.
* completedUnderscoresince String Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*.  (optional)
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getTasksForProject = ({ projectUnderscoregid, completedUnderscoresince, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        completedUnderscoresince,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get tasks from a section
* *Board view only*: Returns the compact section records for all tasks within the given section.
*
* sectionUnderscoregid String The globally unique identifier for the section.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getTasksForSection = ({ sectionUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sectionUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get tasks from a tag
* Returns the compact task records for all tasks with the given tag. Tasks can have more than one tag at a time.
*
* tagUnderscoregid String Globally unique identifier for the tag.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getTasksForTag = ({ tagUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tagUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get tasks from a user task list
* Returns the compact list of tasks in a user’s My Tasks list. *Note: Access control is enforced for this endpoint as with all Asana API endpoints, meaning a user’s private tasks will be filtered out if the API-authenticated user does not have access to them.* *Note: Both complete and incomplete tasks are returned by default unless they are filtered out (for example, setting `completed_since=now` will return only incomplete tasks, which is the default view for “My Tasks” in Asana.)*
*
* userUnderscoretaskUnderscorelistUnderscoregid String Globally unique identifier for the user task list.
* completedUnderscoresince String Only return tasks that are either incomplete or that have been completed since this time. Accepts a date-time string or the keyword *now*.  (optional)
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTasksForProject_200_response
* */
const getTasksForUserTaskList = ({ userUnderscoretaskUnderscorelistUnderscoregid, completedUnderscoresince, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoretaskUnderscorelistUnderscoregid,
        completedUnderscoresince,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Unlink dependencies from a task
* Unlinks a set of dependencies from this task.
*
* taskUnderscoregid String The task to operate on.
* addDependenciesForTaskRequest AddDependenciesForTaskRequest The list of tasks to unlink as dependencies.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeDependenciesForTask = ({ taskUnderscoregid, addDependenciesForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addDependenciesForTaskRequest,
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
* Unlink dependents from a task
* Unlinks a set of dependents from this task.
*
* taskUnderscoregid String The task to operate on.
* addDependentsForTaskRequest AddDependentsForTaskRequest The list of tasks to remove as dependents.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeDependentsForTask = ({ taskUnderscoregid, addDependentsForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        addDependentsForTaskRequest,
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
* Remove followers from a task
* Removes each of the specified followers from the task if they are following. Returns the complete, updated record for the affected task.
*
* taskUnderscoregid String The task to operate on.
* removeFollowerForTaskRequest RemoveFollowerForTaskRequest The followers to remove from the task.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const removeFollowerForTask = ({ taskUnderscoregid, removeFollowerForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        removeFollowerForTaskRequest,
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
* Remove a project from a task
* Removes the task from the specified project. The task will still exist in the system, but it will not be in the project anymore.  Returns an empty data block.
*
* taskUnderscoregid String The task to operate on.
* removeProjectForTaskRequest RemoveProjectForTaskRequest The project to remove the task from.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeProjectForTask = ({ taskUnderscoregid, removeProjectForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        removeProjectForTaskRequest,
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
* Remove a tag from a task
* Removes a tag from a task. Returns an empty data block.
*
* taskUnderscoregid String The task to operate on.
* removeTagForTaskRequest RemoveTagForTaskRequest The tag to remove from the task.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const removeTagForTask = ({ taskUnderscoregid, removeTagForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        removeTagForTaskRequest,
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
* Search tasks in a workspace
* To mirror the functionality of the Asana web app's advanced search feature, the Asana API has a task search endpoint that allows you to build complex filters to find and retrieve the exact data you need. #### Premium access Like the Asana web product's advance search feature, this search endpoint will only be available to premium Asana users. A user is premium if any of the following is true:  - The workspace in which the search is being performed is a premium workspace - The user is a member of a premium team inside the workspace  Even if a user is only a member of a premium team inside a non-premium workspace, search will allow them to find data anywhere in the workspace, not just inside the premium team. Making a search request using credentials of a non-premium user will result in a `402 Payment Required` error. #### Pagination Search results are not stable; repeating the same query multiple times may return the data in a different order, even if the data do not change. Because of this, the traditional [pagination](https://developers.asana.com/docs/#pagination) available elsewhere in the Asana API is not available here. However, you can paginate manually by sorting the search results by their creation time and then modifying each subsequent query to exclude data you have already seen. Page sizes are limited to a maximum of 100 items, and can be specified by the `limit` query parameter. #### Eventual consistency Changes in Asana (regardless of whether they’re made though the web product or the API) are forwarded to our search infrastructure to be indexed. This process can take between 10 and 60 seconds to complete under normal operation, and longer during some production incidents. Making a change to a task that would alter its presence in a particular search query will not be reflected immediately. This is also true of the advanced search feature in the web product. #### Rate limits You may receive a `429 Too Many Requests` response if you hit any of our [rate limits](https://developers.asana.com/docs/#rate-limits). #### Custom field parameters | Parameter name | Custom field type | Accepted type | |---|---|---| | custom_fields.{gid}.is_set | All | Boolean | | custom_fields.{gid}.value | Text | String | | custom_fields.{gid}.value | Number | Number | | custom_fields.{gid}.value | Enum | Enum option ID | | custom_fields.{gid}.starts_with | Text only | String | | custom_fields.{gid}.ends_with | Text only | String | | custom_fields.{gid}.contains | Text only | String | | custom_fields.{gid}.less_than | Number only | Number | | custom_fields.{gid}.greater_than | Number only | Number |   For example, if the gid of the custom field is 12345, these query parameter to find tasks where it is set would be `custom_fields.12345.is_set=true`. To match an exact value for an enum custom field, use the gid of the desired enum option and not the name of the enum option: `custom_fields.12345.value=67890`.  **Not Supported**: searching for multiple exact matches of a custom field, searching for multi-enum custom field  *Note: If you specify `projects.any` and `sections.any`, you will receive tasks for the project **and** tasks for the section. If you're looking for only tasks in a section, omit the `projects.any` from the request.*
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* text String Performs full-text search on both task name and description (optional)
* resourceUnderscoresubtype String Filters results by the task's resource_subtype (optional)
* assigneePeriodany String Comma-separated list of user identifiers (optional)
* assigneePeriodnot String Comma-separated list of user identifiers (optional)
* portfoliosPeriodany String Comma-separated list of portfolio IDs (optional)
* projectsPeriodany String Comma-separated list of project IDs (optional)
* projectsPeriodnot String Comma-separated list of project IDs (optional)
* projectsPeriodall String Comma-separated list of project IDs (optional)
* sectionsPeriodany String Comma-separated list of section or column IDs (optional)
* sectionsPeriodnot String Comma-separated list of section or column IDs (optional)
* sectionsPeriodall String Comma-separated list of section or column IDs (optional)
* tagsPeriodany String Comma-separated list of tag IDs (optional)
* tagsPeriodnot String Comma-separated list of tag IDs (optional)
* tagsPeriodall String Comma-separated list of tag IDs (optional)
* teamsPeriodany String Comma-separated list of team IDs (optional)
* followersPeriodnot String Comma-separated list of user identifiers (optional)
* createdUnderscorebyPeriodany String Comma-separated list of user identifiers (optional)
* createdUnderscorebyPeriodnot String Comma-separated list of user identifiers (optional)
* assignedUnderscorebyPeriodany String Comma-separated list of user identifiers (optional)
* assignedUnderscorebyPeriodnot String Comma-separated list of user identifiers (optional)
* likedUnderscorebyPeriodnot String Comma-separated list of user identifiers (optional)
* commentedUnderscoreonUnderscorebyPeriodnot String Comma-separated list of user identifiers (optional)
* dueUnderscoreonPeriodbefore date ISO 8601 date string (optional)
* dueUnderscoreonPeriodafter date ISO 8601 date string (optional)
* dueUnderscoreon date ISO 8601 date string or `null` (optional)
* dueUnderscoreatPeriodbefore Date ISO 8601 datetime string (optional)
* dueUnderscoreatPeriodafter Date ISO 8601 datetime string (optional)
* startUnderscoreonPeriodbefore date ISO 8601 date string (optional)
* startUnderscoreonPeriodafter date ISO 8601 date string (optional)
* startUnderscoreon date ISO 8601 date string or `null` (optional)
* createdUnderscoreonPeriodbefore date ISO 8601 date string (optional)
* createdUnderscoreonPeriodafter date ISO 8601 date string (optional)
* createdUnderscoreon date ISO 8601 date string or `null` (optional)
* createdUnderscoreatPeriodbefore Date ISO 8601 datetime string (optional)
* createdUnderscoreatPeriodafter Date ISO 8601 datetime string (optional)
* completedUnderscoreonPeriodbefore date ISO 8601 date string (optional)
* completedUnderscoreonPeriodafter date ISO 8601 date string (optional)
* completedUnderscoreon date ISO 8601 date string or `null` (optional)
* completedUnderscoreatPeriodbefore Date ISO 8601 datetime string (optional)
* completedUnderscoreatPeriodafter Date ISO 8601 datetime string (optional)
* modifiedUnderscoreonPeriodbefore date ISO 8601 date string (optional)
* modifiedUnderscoreonPeriodafter date ISO 8601 date string (optional)
* modifiedUnderscoreon date ISO 8601 date string or `null` (optional)
* modifiedUnderscoreatPeriodbefore Date ISO 8601 datetime string (optional)
* modifiedUnderscoreatPeriodafter Date ISO 8601 datetime string (optional)
* isUnderscoreblocking Boolean Filter to incomplete tasks with dependents (optional)
* isUnderscoreblocked Boolean Filter to tasks with incomplete dependencies (optional)
* hasUnderscoreattachment Boolean Filter to tasks with attachments (optional)
* completed Boolean Filter to completed tasks (optional)
* isUnderscoresubtask Boolean Filter to subtasks (optional)
* sortUnderscoreby String One of `due_date`, `created_at`, `completed_at`, `likes`, or `modified_at`, defaults to `modified_at` (optional)
* sortUnderscoreascending Boolean Default `false` (optional)
* returns getTasksForProject_200_response
* */
const searchTasksForWorkspace = ({ workspaceUnderscoregid, optUnderscorepretty, optUnderscorefields, text, resourceUnderscoresubtype, assigneePeriodany, assigneePeriodnot, portfoliosPeriodany, projectsPeriodany, projectsPeriodnot, projectsPeriodall, sectionsPeriodany, sectionsPeriodnot, sectionsPeriodall, tagsPeriodany, tagsPeriodnot, tagsPeriodall, teamsPeriodany, followersPeriodnot, createdUnderscorebyPeriodany, createdUnderscorebyPeriodnot, assignedUnderscorebyPeriodany, assignedUnderscorebyPeriodnot, likedUnderscorebyPeriodnot, commentedUnderscoreonUnderscorebyPeriodnot, dueUnderscoreonPeriodbefore, dueUnderscoreonPeriodafter, dueUnderscoreon, dueUnderscoreatPeriodbefore, dueUnderscoreatPeriodafter, startUnderscoreonPeriodbefore, startUnderscoreonPeriodafter, startUnderscoreon, createdUnderscoreonPeriodbefore, createdUnderscoreonPeriodafter, createdUnderscoreon, createdUnderscoreatPeriodbefore, createdUnderscoreatPeriodafter, completedUnderscoreonPeriodbefore, completedUnderscoreonPeriodafter, completedUnderscoreon, completedUnderscoreatPeriodbefore, completedUnderscoreatPeriodafter, modifiedUnderscoreonPeriodbefore, modifiedUnderscoreonPeriodafter, modifiedUnderscoreon, modifiedUnderscoreatPeriodbefore, modifiedUnderscoreatPeriodafter, isUnderscoreblocking, isUnderscoreblocked, hasUnderscoreattachment, completed, isUnderscoresubtask, sortUnderscoreby, sortUnderscoreascending }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        text,
        resourceUnderscoresubtype,
        assigneePeriodany,
        assigneePeriodnot,
        portfoliosPeriodany,
        projectsPeriodany,
        projectsPeriodnot,
        projectsPeriodall,
        sectionsPeriodany,
        sectionsPeriodnot,
        sectionsPeriodall,
        tagsPeriodany,
        tagsPeriodnot,
        tagsPeriodall,
        teamsPeriodany,
        followersPeriodnot,
        createdUnderscorebyPeriodany,
        createdUnderscorebyPeriodnot,
        assignedUnderscorebyPeriodany,
        assignedUnderscorebyPeriodnot,
        likedUnderscorebyPeriodnot,
        commentedUnderscoreonUnderscorebyPeriodnot,
        dueUnderscoreonPeriodbefore,
        dueUnderscoreonPeriodafter,
        dueUnderscoreon,
        dueUnderscoreatPeriodbefore,
        dueUnderscoreatPeriodafter,
        startUnderscoreonPeriodbefore,
        startUnderscoreonPeriodafter,
        startUnderscoreon,
        createdUnderscoreonPeriodbefore,
        createdUnderscoreonPeriodafter,
        createdUnderscoreon,
        createdUnderscoreatPeriodbefore,
        createdUnderscoreatPeriodafter,
        completedUnderscoreonPeriodbefore,
        completedUnderscoreonPeriodafter,
        completedUnderscoreon,
        completedUnderscoreatPeriodbefore,
        completedUnderscoreatPeriodafter,
        modifiedUnderscoreonPeriodbefore,
        modifiedUnderscoreonPeriodafter,
        modifiedUnderscoreon,
        modifiedUnderscoreatPeriodbefore,
        modifiedUnderscoreatPeriodafter,
        isUnderscoreblocking,
        isUnderscoreblocked,
        hasUnderscoreattachment,
        completed,
        isUnderscoresubtask,
        sortUnderscoreby,
        sortUnderscoreascending,
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
* Set the parent of a task
* parent, or no parent task at all. Returns an empty data block. When using `insert_before` and `insert_after`, at most one of those two options can be specified, and they must already be subtasks of the parent.
*
* taskUnderscoregid String The task to operate on.
* setParentForTaskRequest SetParentForTaskRequest The new parent of the subtask.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const setParentForTask = ({ taskUnderscoregid, setParentForTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        setParentForTaskRequest,
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
* Update a task
* A specific, existing task can be updated by making a PUT request on the URL for that task. Only the fields provided in the `data` block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated task record.
*
* taskUnderscoregid String The task to operate on.
* createTaskRequest CreateTaskRequest The task to update.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createTask_201_response
* */
const updateTask = ({ taskUnderscoregid, createTaskRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        createTaskRequest,
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

module.exports = {
  addDependenciesForTask,
  addDependentsForTask,
  addFollowersForTask,
  addProjectForTask,
  addTagForTask,
  createSubtaskForTask,
  createTask,
  deleteTask,
  duplicateTask,
  getDependenciesForTask,
  getDependentsForTask,
  getSubtasksForTask,
  getTask,
  getTasks,
  getTasksForProject,
  getTasksForSection,
  getTasksForTag,
  getTasksForUserTaskList,
  removeDependenciesForTask,
  removeDependentsForTask,
  removeFollowerForTask,
  removeProjectForTask,
  removeTagForTask,
  searchTasksForWorkspace,
  setParentForTask,
  updateTask,
};
