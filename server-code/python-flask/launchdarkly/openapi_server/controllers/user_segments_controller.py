import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_user_segment_request import PostUserSegmentRequest  # noqa: E501
from openapi_server.models.semantic_patch_operation import SemanticPatchOperation  # noqa: E501
from openapi_server.models.update_big_segment_targets_request import UpdateBigSegmentTargetsRequest  # noqa: E501
from openapi_server.models.user_segment import UserSegment  # noqa: E501
from openapi_server.models.user_segments import UserSegments  # noqa: E501
from openapi_server.models.user_targeting_expiration_for_segment import UserTargetingExpirationForSegment  # noqa: E501
from openapi_server import util


def delete_user_segment(project_key, environment_key, user_segment_key):  # noqa: E501
    """Delete a user segment.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_key: The user segment&#39;s key. The key identifies the user segment in your code.
    :type user_segment_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_expiring_user_targets_on_segment(project_key, environment_key, user_segment_key):  # noqa: E501
    """Get expiring user targets for user segment

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_key: The user segment&#39;s key. The key identifies the user segment in your code.
    :type user_segment_key: str

    :rtype: Union[UserTargetingExpirationForSegment, Tuple[UserTargetingExpirationForSegment, int], Tuple[UserTargetingExpirationForSegment, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_segment(project_key, environment_key, user_segment_key):  # noqa: E501
    """Get a single user segment by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_key: The user segment&#39;s key. The key identifies the user segment in your code.
    :type user_segment_key: str

    :rtype: Union[UserSegment, Tuple[UserSegment, int], Tuple[UserSegment, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_segments(project_key, environment_key, tag=None):  # noqa: E501
    """Get a list of all user segments in the given project.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param tag: Filter by tag. A tag can be used to group flags across projects.
    :type tag: str

    :rtype: Union[UserSegments, Tuple[UserSegments, int], Tuple[UserSegments, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_expiring_user_targets_on_segment(project_key, environment_key, user_segment_key, semantic_patch_with_comment):  # noqa: E501
    """Update, add, or delete expiring user targets on user segment

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_key: The user segment&#39;s key. The key identifies the user segment in your code.
    :type user_segment_key: str
    :param semantic_patch_with_comment: Requires a Semantic Patch representation of the desired changes to the resource. &#39;https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches&#39;. The addition of comments is also supported.
    :type semantic_patch_with_comment: list | bytes

    :rtype: Union[UserTargetingExpirationForSegment, Tuple[UserTargetingExpirationForSegment, int], Tuple[UserTargetingExpirationForSegment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        semantic_patch_with_comment = [SemanticPatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def patch_user_segment(project_key, environment_key, user_segment_key, patch_only):  # noqa: E501
    """Perform a partial update to a user segment.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_key: The user segment&#39;s key. The key identifies the user segment in your code.
    :type user_segment_key: str
    :param patch_only: Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; Feature flag patches also support JSON Merge Patch format. &#39;https://tools.ietf.org/html/rfc7386&#39; The addition of comments is also supported.
    :type patch_only: list | bytes

    :rtype: Union[UserSegment, Tuple[UserSegment, int], Tuple[UserSegment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_only = [PatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_user_segment(project_key, environment_key, user_segment_body):  # noqa: E501
    """Creates a new user segment.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_body: Create a new user segment.
    :type user_segment_body: dict | bytes

    :rtype: Union[UserSegment, Tuple[UserSegment, int], Tuple[UserSegment, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_segment_body = PostUserSegmentRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_big_segment_targets(project_key, environment_key, user_segment_key, big_segment_targets_body):  # noqa: E501
    """Update targets included or excluded in a big segment

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_segment_key: The user segment&#39;s key. The key identifies the user segment in your code.
    :type user_segment_key: str
    :param big_segment_targets_body: Add or remove user targets to the included or excluded lists on a big segment. Contact your account manager for early access to this feature.
    :type big_segment_targets_body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        big_segment_targets_body = UpdateBigSegmentTargetsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
