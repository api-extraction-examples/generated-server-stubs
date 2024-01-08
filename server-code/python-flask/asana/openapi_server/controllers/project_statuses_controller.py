import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_project_status_for_project_request import CreateProjectStatusForProjectRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_project_status200_response import GetProjectStatus200Response  # noqa: E501
from openapi_server.models.get_project_statuses_for_project200_response import GetProjectStatusesForProject200Response  # noqa: E501
from openapi_server import util


def create_project_status_for_project(project_gid, create_project_status_for_project_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a project status

    *Deprecated: new integrations should prefer the &#x60;/status_updates&#x60; route.*  Creates a new status update on the project.  Returns the full record of the newly created project status update. # noqa: E501

    :param project_gid: Globally unique identifier for the project.
    :type project_gid: str
    :param create_project_status_for_project_request: The project status to create.
    :type create_project_status_for_project_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetProjectStatus200Response, Tuple[GetProjectStatus200Response, int], Tuple[GetProjectStatus200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_project_status_for_project_request = CreateProjectStatusForProjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_project_status(project_status_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a project status

    *Deprecated: new integrations should prefer the &#x60;/status_updates/{status_gid}&#x60; route.*  Deletes a specific, existing project status update.  Returns an empty data record. # noqa: E501

    :param project_status_gid: The project status update to get.
    :type project_status_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_status(project_status_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a project status

    *Deprecated: new integrations should prefer the &#x60;/status_updates/{status_gid}&#x60; route.*  Returns the complete record for a single status update. # noqa: E501

    :param project_status_gid: The project status update to get.
    :type project_status_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetProjectStatus200Response, Tuple[GetProjectStatus200Response, int], Tuple[GetProjectStatus200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_statuses_for_project(project_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get statuses from a project

    *Deprecated: new integrations should prefer the &#x60;/status_updates&#x60; route.*  Returns the compact project status update records for all updates on the project. # noqa: E501

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

    :rtype: Union[GetProjectStatusesForProject200Response, Tuple[GetProjectStatusesForProject200Response, int], Tuple[GetProjectStatusesForProject200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
