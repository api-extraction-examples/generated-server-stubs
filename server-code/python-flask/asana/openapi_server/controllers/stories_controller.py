import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_stories_for_task200_response import GetStoriesForTask200Response  # noqa: E501
from openapi_server.models.get_story200_response import GetStory200Response  # noqa: E501
from openapi_server.models.update_story_request import UpdateStoryRequest  # noqa: E501
from openapi_server import util


def create_story_for_task(task_gid, update_story_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a story on a task

    Adds a story to a task. This endpoint currently only allows for comment stories to be created. The comment will be authored by the currently authenticated user, and timestamped when the server receives the request.  Returns the full record for the new story added to the task. # noqa: E501

    :param task_gid: The task to operate on.
    :type task_gid: str
    :param update_story_request: The story to create.
    :type update_story_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetStory200Response, Tuple[GetStory200Response, int], Tuple[GetStory200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_story_request = UpdateStoryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_story(story_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a story

    Deletes a story. A user can only delete stories they have created.  Returns an empty data record. # noqa: E501

    :param story_gid: Globally unique identifier for the story.
    :type story_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_stories_for_task(task_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get stories from a task

    Returns the compact records for all stories on the task. # noqa: E501

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

    :rtype: Union[GetStoriesForTask200Response, Tuple[GetStoriesForTask200Response, int], Tuple[GetStoriesForTask200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_story(story_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a story

    Returns the full record for a single story. # noqa: E501

    :param story_gid: Globally unique identifier for the story.
    :type story_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetStory200Response, Tuple[GetStory200Response, int], Tuple[GetStory200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_story(story_gid, update_story_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a story

    Updates the story and returns the full record for the updated story. Only comment stories can have their text updated, and only comment stories and attachment stories can be pinned. Only one of &#x60;text&#x60; and &#x60;html_text&#x60; can be specified. # noqa: E501

    :param story_gid: Globally unique identifier for the story.
    :type story_gid: str
    :param update_story_request: The comment story to update.
    :type update_story_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetStory200Response, Tuple[GetStory200Response, int], Tuple[GetStory200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_story_request = UpdateStoryRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
