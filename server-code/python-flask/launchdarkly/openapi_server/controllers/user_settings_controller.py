import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.put_flag_setting_request import PutFlagSettingRequest  # noqa: E501
from openapi_server.models.semantic_patch_operation import SemanticPatchOperation  # noqa: E501
from openapi_server.models.user_flag_setting import UserFlagSetting  # noqa: E501
from openapi_server.models.user_flag_settings import UserFlagSettings  # noqa: E501
from openapi_server.models.user_targeting_expiration_on_flags_for_user import UserTargetingExpirationOnFlagsForUser  # noqa: E501
from openapi_server import util


def get_expiring_user_targets_for_user(project_key, environment_key, user_key):  # noqa: E501
    """Get expiring dates on flags for user

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str

    :rtype: Union[UserTargetingExpirationOnFlagsForUser, Tuple[UserTargetingExpirationOnFlagsForUser, int], Tuple[UserTargetingExpirationOnFlagsForUser, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_flag_setting(project_key, environment_key, user_key, feature_flag_key):  # noqa: E501
    """Fetch a single flag setting for a user by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[UserFlagSetting, Tuple[UserFlagSetting, int], Tuple[UserFlagSetting, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_flag_settings(project_key, environment_key, user_key):  # noqa: E501
    """Fetch a single flag setting for a user by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str

    :rtype: Union[UserFlagSettings, Tuple[UserFlagSettings, int], Tuple[UserFlagSettings, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_expiring_user_targets_for_flags(project_key, environment_key, user_key, semantic_patch_with_comment):  # noqa: E501
    """Update, add, or delete expiring user targets for a single user on all flags

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str
    :param semantic_patch_with_comment: Requires a Semantic Patch representation of the desired changes to the resource. &#39;https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches&#39;. The addition of comments is also supported.
    :type semantic_patch_with_comment: list | bytes

    :rtype: Union[UserTargetingExpirationOnFlagsForUser, Tuple[UserTargetingExpirationOnFlagsForUser, int], Tuple[UserTargetingExpirationOnFlagsForUser, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        semantic_patch_with_comment = [SemanticPatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def put_flag_setting(project_key, environment_key, user_key, feature_flag_key, user_settings_body):  # noqa: E501
    """Specifically enable or disable a feature flag for a user based on their key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param user_settings_body: 
    :type user_settings_body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_settings_body = PutFlagSettingRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
