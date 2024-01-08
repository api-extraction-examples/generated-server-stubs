import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_tag201_response import CreateTag201Response  # noqa: E501
from openapi_server.models.create_tag_request import CreateTagRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_tags200_response import GetTags200Response  # noqa: E501
from openapi_server import util


def create_tag(create_tag_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a tag

    Creates a new tag in a workspace or organization.  Every tag is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the workspace parameter regardless of whether or not it is an organization.  Returns the full record of the newly created tag. # noqa: E501

    :param create_tag_request: The tag to create.
    :type create_tag_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateTag201Response, Tuple[CreateTag201Response, int], Tuple[CreateTag201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_tag_request = CreateTagRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_tag_for_workspace(workspace_gid, create_tag201_response, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a tag in a workspace

    Creates a new tag in a workspace or organization.  Every tag is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the workspace parameter regardless of whether or not it is an organization.  Returns the full record of the newly created tag. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param create_tag201_response: The tag to create.
    :type create_tag201_response: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateTag201Response, Tuple[CreateTag201Response, int], Tuple[CreateTag201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_tag201_response = CreateTag201Response.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_tag(tag_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Delete a tag

    A specific, existing tag can be deleted by making a DELETE request on the URL for that tag.  Returns an empty data record. # noqa: E501

    :param tag_gid: Globally unique identifier for the tag.
    :type tag_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tag(tag_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a tag

    Returns the complete tag record for a single tag. # noqa: E501

    :param tag_gid: Globally unique identifier for the tag.
    :type tag_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[CreateTag201Response, Tuple[CreateTag201Response, int], Tuple[CreateTag201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tags(opt_pretty=None, opt_fields=None, limit=None, offset=None, workspace=None):  # noqa: E501
    """Get multiple tags

    Returns the compact tag records for some filtered set of tags. Use one or more of the parameters provided to filter the tags returned. # noqa: E501

    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param workspace: The workspace to filter tags on.
    :type workspace: str

    :rtype: Union[GetTags200Response, Tuple[GetTags200Response, int], Tuple[GetTags200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tags_for_task(task_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a task&#39;s tags

    Get a compact representation of all of the tags the task has. # noqa: E501

    :param task_gid: The task to operate on.
    :type task_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetTags200Response, Tuple[GetTags200Response, int], Tuple[GetTags200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tags_for_workspace(workspace_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get tags in a workspace

    Returns the compact tag records for some filtered set of tags. Use one or more of the parameters provided to filter the tags returned. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetTags200Response, Tuple[GetTags200Response, int], Tuple[GetTags200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_tag(tag_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Update a tag

    Updates the properties of a tag. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the tag.  Returns the complete updated tag record. # noqa: E501

    :param tag_gid: Globally unique identifier for the tag.
    :type tag_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[CreateTag201Response, Tuple[CreateTag201Response, int], Tuple[CreateTag201Response, int, Dict[str, str]]
    """
    return 'do some magic!'
