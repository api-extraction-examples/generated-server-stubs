import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_task_for_section_request import AddTaskForSectionRequest  # noqa: E501
from openapi_server.models.create_section_for_project201_response import CreateSectionForProject201Response  # noqa: E501
from openapi_server.models.create_section_for_project_request import CreateSectionForProjectRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_sections_for_project200_response import GetSectionsForProject200Response  # noqa: E501
from openapi_server.models.insert_section_for_project_request import InsertSectionForProjectRequest  # noqa: E501
from openapi_server import util


def add_task_for_section(section_gid, add_task_for_section_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Add task to section

    Add a task to a specific, existing section. This will remove the task from other sections of the project.  The task will be inserted at the top of a section unless an insert_before or insert_after parameter is declared.  This does not work for separators (tasks with the resource_subtype of section). # noqa: E501

    :param section_gid: The globally unique identifier for the section.
    :type section_gid: str
    :param add_task_for_section_request: The task and optionally the insert location.
    :type add_task_for_section_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_task_for_section_request = AddTaskForSectionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_section_for_project(project_gid, create_section_for_project_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a section in a project

    Creates a new section in a project. Returns the full record of the newly created section. # noqa: E501

    :param project_gid: Globally unique identifier for the project.
    :type project_gid: str
    :param create_section_for_project_request: The section to create.
    :type create_section_for_project_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateSectionForProject201Response, Tuple[CreateSectionForProject201Response, int], Tuple[CreateSectionForProject201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_section_for_project_request = CreateSectionForProjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_section(section_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a section

    A specific, existing section can be deleted by making a DELETE request on the URL for that section.  Note that sections must be empty to be deleted.  The last remaining section cannot be deleted.  Returns an empty data block. # noqa: E501

    :param section_gid: The globally unique identifier for the section.
    :type section_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_section(section_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a section

    Returns the complete record for a single section. # noqa: E501

    :param section_gid: The globally unique identifier for the section.
    :type section_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateSectionForProject201Response, Tuple[CreateSectionForProject201Response, int], Tuple[CreateSectionForProject201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_sections_for_project(project_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get sections in a project

    Returns the compact records for all sections in the specified project. # noqa: E501

    :param project_gid: Globally unique identifier for the project.
    :type project_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetSectionsForProject200Response, Tuple[GetSectionsForProject200Response, int], Tuple[GetSectionsForProject200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def insert_section_for_project(project_gid, insert_section_for_project_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Move or Insert sections

    Move sections relative to each other. One of &#x60;before_section&#x60; or &#x60;after_section&#x60; is required.  Sections cannot be moved between projects.  Returns an empty data block. # noqa: E501

    :param project_gid: Globally unique identifier for the project.
    :type project_gid: str
    :param insert_section_for_project_request: The section&#39;s move action.
    :type insert_section_for_project_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        insert_section_for_project_request = InsertSectionForProjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_section(section_gid, create_section_for_project_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a section

    A specific, existing section can be updated by making a PUT request on the URL for that project. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged. (note that at this time, the only field that can be updated is the &#x60;name&#x60; field.)  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated section record. # noqa: E501

    :param section_gid: The globally unique identifier for the section.
    :type section_gid: str
    :param create_section_for_project_request: The section to create.
    :type create_section_for_project_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateSectionForProject201Response, Tuple[CreateSectionForProject201Response, int], Tuple[CreateSectionForProject201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_section_for_project_request = CreateSectionForProjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
