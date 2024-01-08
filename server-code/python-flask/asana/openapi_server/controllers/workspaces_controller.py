import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_user_for_workspace200_response import AddUserForWorkspace200Response  # noqa: E501
from openapi_server.models.add_user_for_workspace_request import AddUserForWorkspaceRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_workspace200_response import GetWorkspace200Response  # noqa: E501
from openapi_server.models.get_workspaces200_response import GetWorkspaces200Response  # noqa: E501
from openapi_server.models.remove_user_for_workspace_request import RemoveUserForWorkspaceRequest  # noqa: E501
from openapi_server.models.update_workspace_request import UpdateWorkspaceRequest  # noqa: E501
from openapi_server import util


def add_user_for_workspace(workspace_gid, add_user_for_workspace_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Add a user to a workspace or organization

    Add a user to a workspace or organization. The user can be referenced by their globally unique user ID or their email address. Returns the full user record for the invited user. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param add_user_for_workspace_request: The user to add to the workspace.
    :type add_user_for_workspace_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[AddUserForWorkspace200Response, Tuple[AddUserForWorkspace200Response, int], Tuple[AddUserForWorkspace200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_user_for_workspace_request = AddUserForWorkspaceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_workspace(workspace_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a workspace

    Returns the full workspace record for a single workspace. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetWorkspace200Response, Tuple[GetWorkspace200Response, int], Tuple[GetWorkspace200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workspaces(opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get multiple workspaces

    Returns the compact records for all workspaces visible to the authorized user. # noqa: E501

    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetWorkspaces200Response, Tuple[GetWorkspaces200Response, int], Tuple[GetWorkspaces200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_user_for_workspace(workspace_gid, remove_user_for_workspace_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Remove a user from a workspace or organization

    Remove a user from a workspace or organization. The user making this call must be an admin in the workspace. The user can be referenced by their globally unique user ID or their email address. Returns an empty data record. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param remove_user_for_workspace_request: The user to remove from the workspace.
    :type remove_user_for_workspace_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_user_for_workspace_request = RemoveUserForWorkspaceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_workspace(workspace_gid, update_workspace_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a workspace

    A specific, existing workspace can be updated by making a PUT request on the URL for that workspace. Only the fields provided in the data block will be updated; any unspecified fields will remain unchanged. Currently the only field that can be modified for a workspace is its name. Returns the complete, updated workspace record. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param update_workspace_request: The workspace object with all updated properties.
    :type update_workspace_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetWorkspace200Response, Tuple[GetWorkspace200Response, int], Tuple[GetWorkspace200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_workspace_request = UpdateWorkspaceRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
