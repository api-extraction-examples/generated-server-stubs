import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_project_brief200_response import GetProjectBrief200Response  # noqa: E501
from openapi_server.models.update_project_brief_request import UpdateProjectBriefRequest  # noqa: E501
from openapi_server import util


def create_project_brief(project_gid, update_project_brief_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a project brief

    Creates a new project brief.  Returns the full record of the newly created project brief. # noqa: E501

    :param project_gid: Globally unique identifier for the project.
    :type project_gid: str
    :param update_project_brief_request: The project brief to create.
    :type update_project_brief_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetProjectBrief200Response, Tuple[GetProjectBrief200Response, int], Tuple[GetProjectBrief200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_project_brief_request = UpdateProjectBriefRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_project_brief(project_brief_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a project brief

    Deletes a specific, existing project brief.  Returns an empty data record. # noqa: E501

    :param project_brief_gid: Globally unique identifier for the project brief.
    :type project_brief_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_brief(project_brief_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a project brief

    Get the full record for a project brief. # noqa: E501

    :param project_brief_gid: Globally unique identifier for the project brief.
    :type project_brief_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetProjectBrief200Response, Tuple[GetProjectBrief200Response, int], Tuple[GetProjectBrief200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_project_brief(project_brief_gid, update_project_brief_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a project brief

    An existing project brief can be updated by making a PUT request on the URL for that project brief. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated project brief record. # noqa: E501

    :param project_brief_gid: Globally unique identifier for the project brief.
    :type project_brief_gid: str
    :param update_project_brief_request: The updated fields for the project brief.
    :type update_project_brief_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetProjectBrief200Response, Tuple[GetProjectBrief200Response, int], Tuple[GetProjectBrief200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_project_brief_request = UpdateProjectBriefRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
