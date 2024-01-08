import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.approval_request import ApprovalRequest  # noqa: E501
from openapi_server.models.approval_requests import ApprovalRequests  # noqa: E501
from openapi_server.models.copy_feature_flag_request import CopyFeatureFlagRequest  # noqa: E501
from openapi_server.models.dependent_flags_by_environment import DependentFlagsByEnvironment  # noqa: E501
from openapi_server.models.feature_flag import FeatureFlag  # noqa: E501
from openapi_server.models.feature_flag_scheduled_change import FeatureFlagScheduledChange  # noqa: E501
from openapi_server.models.feature_flag_scheduled_changes import FeatureFlagScheduledChanges  # noqa: E501
from openapi_server.models.feature_flag_scheduled_changes_conflicts import FeatureFlagScheduledChangesConflicts  # noqa: E501
from openapi_server.models.feature_flag_status import FeatureFlagStatus  # noqa: E501
from openapi_server.models.feature_flag_status_across_environments import FeatureFlagStatusAcrossEnvironments  # noqa: E501
from openapi_server.models.feature_flag_statuses import FeatureFlagStatuses  # noqa: E501
from openapi_server.models.feature_flags import FeatureFlags  # noqa: E501
from openapi_server.models.get_flag_config_scheduled_changes_conflicts_request import GetFlagConfigScheduledChangesConflictsRequest  # noqa: E501
from openapi_server.models.multi_environment_dependent_flags import MultiEnvironmentDependentFlags  # noqa: E501
from openapi_server.models.patch_feature_flag_request import PatchFeatureFlagRequest  # noqa: E501
from openapi_server.models.patch_flag_config_scheduled_change_request import PatchFlagConfigScheduledChangeRequest  # noqa: E501
from openapi_server.models.post_apply_approval_request_request import PostApplyApprovalRequestRequest  # noqa: E501
from openapi_server.models.post_approval_request_request import PostApprovalRequestRequest  # noqa: E501
from openapi_server.models.post_feature_flag_request import PostFeatureFlagRequest  # noqa: E501
from openapi_server.models.post_flag_config_scheduled_changes_request import PostFlagConfigScheduledChangesRequest  # noqa: E501
from openapi_server.models.post_review_approval_request_request import PostReviewApprovalRequestRequest  # noqa: E501
from openapi_server.models.semantic_patch_operation import SemanticPatchOperation  # noqa: E501
from openapi_server.models.usage_error import UsageError  # noqa: E501
from openapi_server.models.user_targeting_expiration_for_flags import UserTargetingExpirationForFlags  # noqa: E501
from openapi_server import util


def copy_feature_flag(project_key, feature_flag_key, feature_flag_copy_body):  # noqa: E501
    """Copies the feature flag configuration from one environment to the same feature flag in another environment.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param feature_flag_copy_body: Copy feature flag configurations between environments.
    :type feature_flag_copy_body: dict | bytes

    :rtype: Union[FeatureFlag, Tuple[FeatureFlag, int], Tuple[FeatureFlag, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        feature_flag_copy_body = CopyFeatureFlagRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_approval_request(project_key, environment_key, feature_flag_key, approval_request_id, approval_request_config_body=None):  # noqa: E501
    """Delete an approval request for a feature flag config

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param approval_request_id: The approval request ID
    :type approval_request_id: str
    :param approval_request_config_body: Create a new approval request
    :type approval_request_config_body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        approval_request_config_body = PostApprovalRequestRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_feature_flag(project_key, feature_flag_key):  # noqa: E501
    """Delete a feature flag in all environments. Be careful-- only delete feature flags that are no longer being used by your application.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_flag_config_scheduled_changes(project_key, feature_flag_key, environment_key, scheduled_change_id):  # noqa: E501
    """Delete a scheduled change on a feature flag in an environment.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param scheduled_change_id: The id of the scheduled change
    :type scheduled_change_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def flags_project_key_environment_key_feature_flag_key_dependent_flags_get(project_key, environment_key, feature_flag_key):  # noqa: E501
    """Get dependent flags for the flag in the environment specified in path parameters

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[DependentFlagsByEnvironment, Tuple[DependentFlagsByEnvironment, int], Tuple[DependentFlagsByEnvironment, int, Dict[str, str]]
    """
    return 'do some magic!'


def flags_project_key_feature_flag_key_dependent_flags_get(project_key, feature_flag_key):  # noqa: E501
    """Get dependent flags across all environments for the flag specified in the path parameters

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[MultiEnvironmentDependentFlags, Tuple[MultiEnvironmentDependentFlags, int], Tuple[MultiEnvironmentDependentFlags, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_approval_request(project_key, feature_flag_key, environment_key, approval_request_id):  # noqa: E501
    """Get a single approval request for a feature flag config

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param approval_request_id: The approval request ID
    :type approval_request_id: str

    :rtype: Union[ApprovalRequests, Tuple[ApprovalRequests, int], Tuple[ApprovalRequests, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_approval_requests(project_key, feature_flag_key, environment_key):  # noqa: E501
    """Get all approval requests for a feature flag config

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str

    :rtype: Union[ApprovalRequests, Tuple[ApprovalRequests, int], Tuple[ApprovalRequests, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_expiring_user_targets(project_key, environment_key, feature_flag_key):  # noqa: E501
    """Get expiring user targets for feature flag

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[UserTargetingExpirationForFlags, Tuple[UserTargetingExpirationForFlags, int], Tuple[UserTargetingExpirationForFlags, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_feature_flag(project_key, feature_flag_key, env=None):  # noqa: E501
    """Get a single feature flag by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param env: By default, each feature will include configurations for each environment. You can filter environments with the env query parameter. For example, setting env&#x3D;[\&quot;production\&quot;] will restrict the returned configurations to just your production environment.
    :type env: List[str]

    :rtype: Union[FeatureFlag, Tuple[FeatureFlag, int], Tuple[FeatureFlag, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_feature_flag_status(project_key, environment_key, feature_flag_key):  # noqa: E501
    """Get the status for a particular feature flag.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[FeatureFlagStatus, Tuple[FeatureFlagStatus, int], Tuple[FeatureFlagStatus, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_feature_flag_status_across_environments(project_key, feature_flag_key):  # noqa: E501
    """Get the status for a particular feature flag across environments

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str

    :rtype: Union[FeatureFlagStatusAcrossEnvironments, Tuple[FeatureFlagStatusAcrossEnvironments, int], Tuple[FeatureFlagStatusAcrossEnvironments, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_feature_flag_statuses(project_key, environment_key):  # noqa: E501
    """Get a list of statuses for all feature flags. The status includes the last time the feature flag was requested, as well as the state of the flag.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str

    :rtype: Union[FeatureFlagStatuses, Tuple[FeatureFlagStatuses, int], Tuple[FeatureFlagStatuses, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_feature_flags(project_key, env=None, summary=None, archived=None, limit=None, offset=None, filter=None, sort=None, tag=None):  # noqa: E501
    """Get a list of all features in the given project.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param env: By default, each feature will include configurations for each environment. You can filter environments with the env query parameter. For example, setting env&#x3D;[\&quot;production\&quot;] will restrict the returned configurations to just your production environment.
    :type env: List[str]
    :param summary: By default in api version &gt;&#x3D; 1, flags will _not_ include their list of prerequisites, targets or rules.  Set summary&#x3D;0 to include these fields for each flag returned.
    :type summary: bool
    :param archived: When set to 1, only archived flags will be included in the list of flags returned.  By default, archived flags are not included in the list of flags.
    :type archived: bool
    :param limit: The number of objects to return. Defaults to -1, which returns everything.
    :type limit: 
    :param offset: Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items.
    :type offset: 
    :param filter: A comma-separated list of filters. Each filter is of the form field:value.
    :type filter: str
    :param sort: A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order.
    :type sort: str
    :param tag: Filter by tag. A tag can be used to group flags across projects.
    :type tag: str

    :rtype: Union[FeatureFlags, Tuple[FeatureFlags, int], Tuple[FeatureFlags, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_flag_config_scheduled_change(project_key, feature_flag_key, environment_key, scheduled_change_id):  # noqa: E501
    """Get a scheduled change on a feature flag by id.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param scheduled_change_id: The id of the scheduled change
    :type scheduled_change_id: str

    :rtype: Union[FeatureFlagScheduledChange, Tuple[FeatureFlagScheduledChange, int], Tuple[FeatureFlagScheduledChange, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_flag_config_scheduled_changes(project_key, feature_flag_key, environment_key):  # noqa: E501
    """Get all scheduled workflows for a feature flag by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str

    :rtype: Union[FeatureFlagScheduledChanges, Tuple[FeatureFlagScheduledChanges, int], Tuple[FeatureFlagScheduledChanges, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_flag_config_scheduled_changes_conflicts(project_key, feature_flag_key, environment_key, flag_config_scheduled_changes_conflicts_body):  # noqa: E501
    """Lists conflicts between the given instructions and any existing scheduled changes for the feature flag. The actual HTTP verb should be REPORT, not POST.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param flag_config_scheduled_changes_conflicts_body: Used to determine if a semantic patch will result in conflicts with scheduled changes on a feature flag.
    :type flag_config_scheduled_changes_conflicts_body: dict | bytes

    :rtype: Union[FeatureFlagScheduledChangesConflicts, Tuple[FeatureFlagScheduledChangesConflicts, int], Tuple[FeatureFlagScheduledChangesConflicts, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        flag_config_scheduled_changes_conflicts_body = GetFlagConfigScheduledChangesConflictsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def patch_expiring_user_targets(project_key, environment_key, feature_flag_key, semantic_patch_with_comment):  # noqa: E501
    """Update, add, or delete expiring user targets on feature flag

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param semantic_patch_with_comment: Requires a Semantic Patch representation of the desired changes to the resource. &#39;https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches&#39;. The addition of comments is also supported.
    :type semantic_patch_with_comment: list | bytes

    :rtype: Union[UserTargetingExpirationForFlags, Tuple[UserTargetingExpirationForFlags, int], Tuple[UserTargetingExpirationForFlags, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        semantic_patch_with_comment = [SemanticPatchOperation.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def patch_feature_flag(project_key, feature_flag_key, patch_comment):  # noqa: E501
    """Perform a partial update to a feature.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param patch_comment: Requires a JSON Patch representation of the desired changes to the project, and an optional comment. &#39;http://jsonpatch.com/&#39; Feature flag patches also support JSON Merge Patch format. &#39;https://tools.ietf.org/html/rfc7386&#39; The addition of comments is also supported.
    :type patch_comment: dict | bytes

    :rtype: Union[FeatureFlag, Tuple[FeatureFlag, int], Tuple[FeatureFlag, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_comment = PatchFeatureFlagRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def patch_flag_config_scheduled_change(project_key, feature_flag_key, environment_key, scheduled_change_id, flag_config_scheduled_changes_patch_body):  # noqa: E501
    """Updates an existing scheduled-change on a feature flag in an environment.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param scheduled_change_id: The id of the scheduled change
    :type scheduled_change_id: str
    :param flag_config_scheduled_changes_patch_body: Update scheduled changes on a feature flag.
    :type flag_config_scheduled_changes_patch_body: dict | bytes

    :rtype: Union[FeatureFlagScheduledChange, Tuple[FeatureFlagScheduledChange, int], Tuple[FeatureFlagScheduledChange, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        flag_config_scheduled_changes_patch_body = PatchFlagConfigScheduledChangeRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_apply_approval_request(project_key, feature_flag_key, environment_key, approval_request_id, approval_request_apply_config_body):  # noqa: E501
    """Apply approval request for a feature flag config

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param approval_request_id: The approval request ID
    :type approval_request_id: str
    :param approval_request_apply_config_body: Apply an approval request
    :type approval_request_apply_config_body: dict | bytes

    :rtype: Union[ApprovalRequests, Tuple[ApprovalRequests, int], Tuple[ApprovalRequests, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        approval_request_apply_config_body = PostApplyApprovalRequestRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_approval_request(project_key, feature_flag_key, environment_key, approval_request_id, approval_request_config_body=None):  # noqa: E501
    """Create an approval request for a feature flag config

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param approval_request_id: The approval request ID
    :type approval_request_id: str
    :param approval_request_config_body: Create a new approval request
    :type approval_request_config_body: dict | bytes

    :rtype: Union[ApprovalRequest, Tuple[ApprovalRequest, int], Tuple[ApprovalRequest, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        approval_request_config_body = PostApprovalRequestRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_feature_flag(project_key, feature_flag_body, clone=None):  # noqa: E501
    """Creates a new feature flag.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_body: Create a new feature flag.
    :type feature_flag_body: dict | bytes
    :param clone: The key of the feature flag to be cloned. The key identifies the flag in your code.  For example, setting clone&#x3D;flagKey will copy the full targeting configuration for all environments (including on/off state) from the original flag to the new flag.
    :type clone: str

    :rtype: Union[FeatureFlag, Tuple[FeatureFlag, int], Tuple[FeatureFlag, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        feature_flag_body = PostFeatureFlagRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_flag_config_scheduled_changes(project_key, feature_flag_key, environment_key, flag_config_scheduled_changes_post_body):  # noqa: E501
    """Creates a new scheduled change for a feature flag.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param flag_config_scheduled_changes_post_body: Create scheduled changes on a feature flag.
    :type flag_config_scheduled_changes_post_body: dict | bytes

    :rtype: Union[FeatureFlagScheduledChange, Tuple[FeatureFlagScheduledChange, int], Tuple[FeatureFlagScheduledChange, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        flag_config_scheduled_changes_post_body = PostFlagConfigScheduledChangesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_review_approval_request(project_key, feature_flag_key, environment_key, approval_request_id, approval_request_review_config_body):  # noqa: E501
    """Review approval request for a feature flag config

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param feature_flag_key: The feature flag&#39;s key. The key identifies the flag in your code.
    :type feature_flag_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param approval_request_id: The approval request ID
    :type approval_request_id: str
    :param approval_request_review_config_body: Review an approval request
    :type approval_request_review_config_body: dict | bytes

    :rtype: Union[ApprovalRequests, Tuple[ApprovalRequests, int], Tuple[ApprovalRequests, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        approval_request_review_config_body = PostReviewApprovalRequestRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
