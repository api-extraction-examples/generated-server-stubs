import unittest

from flask import json

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
from openapi_server.test import BaseTestCase


class TestFeatureFlagsController(BaseTestCase):
    """FeatureFlagsController integration test stubs"""

    def test_copy_feature_flag(self):
        """Test case for copy_feature_flag

        Copies the feature flag configuration from one environment to the same feature flag in another environment.
        """
        feature_flag_copy_body = openapi_server.CopyFeatureFlagRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}/copy'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(feature_flag_copy_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_approval_request(self):
        """Test case for delete_approval_request

        Delete an approval request for a feature flag config
        """
        approval_request_config_body = openapi_server.PostApprovalRequestRequest()
        headers = { 
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/approval-requests/{approval_request_id}'.format(project_key='project_key_example', environment_key='environment_key_example', feature_flag_key='feature_flag_key_example', approval_request_id='approval_request_id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(approval_request_config_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_feature_flag(self):
        """Test case for delete_feature_flag

        Delete a feature flag in all environments. Be careful-- only delete feature flags that are no longer being used by your application.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_flag_config_scheduled_changes(self):
        """Test case for delete_flag_config_scheduled_changes

        Delete a scheduled change on a feature flag in an environment.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/scheduled-changes/{scheduled_change_id}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', scheduled_change_id='scheduled_change_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_flags_project_key_environment_key_feature_flag_key_dependent_flags_get(self):
        """Test case for flags_project_key_environment_key_feature_flag_key_dependent_flags_get

        Get dependent flags for the flag in the environment specified in path parameters
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{environment_key}/{feature_flag_key}/dependent-flags'.format(project_key='project_key_example', environment_key='environment_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_flags_project_key_feature_flag_key_dependent_flags_get(self):
        """Test case for flags_project_key_feature_flag_key_dependent_flags_get

        Get dependent flags across all environments for the flag specified in the path parameters
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}/dependent-flags'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_approval_request(self):
        """Test case for get_approval_request

        Get a single approval request for a feature flag config
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/approval-requests/{approval_request_id}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', approval_request_id='approval_request_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_approval_requests(self):
        """Test case for get_approval_requests

        Get all approval requests for a feature flag config
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/approval-requests'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_expiring_user_targets(self):
        """Test case for get_expiring_user_targets

        Get expiring user targets for feature flag
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}/expiring-user-targets/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feature_flag(self):
        """Test case for get_feature_flag

        Get a single feature flag by key.
        """
        query_string = [('env', ['env_example'])]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feature_flag_status(self):
        """Test case for get_feature_flag_status

        Get the status for a particular feature flag.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flag-statuses/{project_key}/{environment_key}/{feature_flag_key}'.format(project_key='project_key_example', environment_key='environment_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feature_flag_status_across_environments(self):
        """Test case for get_feature_flag_status_across_environments

        Get the status for a particular feature flag across environments
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flag-status/{project_key}/{feature_flag_key}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feature_flag_statuses(self):
        """Test case for get_feature_flag_statuses

        Get a list of statuses for all feature flags. The status includes the last time the feature flag was requested, as well as the state of the flag.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flag-statuses/{project_key}/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_feature_flags(self):
        """Test case for get_feature_flags

        Get a list of all features in the given project.
        """
        query_string = [('env', ['env_example']),
                        ('summary', True),
                        ('archived', True),
                        ('limit', 3.4),
                        ('offset', 3.4),
                        ('filter', 'filter_example'),
                        ('sort', 'sort_example'),
                        ('tag', 'tag_example')]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}'.format(project_key='project_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_flag_config_scheduled_change(self):
        """Test case for get_flag_config_scheduled_change

        Get a scheduled change on a feature flag by id.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/scheduled-changes/{scheduled_change_id}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', scheduled_change_id='scheduled_change_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_flag_config_scheduled_changes(self):
        """Test case for get_flag_config_scheduled_changes

        Get all scheduled workflows for a feature flag by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/scheduled-changes'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_flag_config_scheduled_changes_conflicts(self):
        """Test case for get_flag_config_scheduled_changes_conflicts

        Lists conflicts between the given instructions and any existing scheduled changes for the feature flag. The actual HTTP verb should be REPORT, not POST.
        """
        flag_config_scheduled_changes_conflicts_body = openapi_server.GetFlagConfigScheduledChangesConflictsRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/scheduled-changes-conflicts'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(flag_config_scheduled_changes_conflicts_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_expiring_user_targets(self):
        """Test case for patch_expiring_user_targets

        Update, add, or delete expiring user targets on feature flag
        """
        semantic_patch_with_comment = {"instructions":[{"kind":"removeUserTargets"},{"kind":"removeUserTargets"}],"comment":"This is a comment string"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}/expiring-user-targets/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', feature_flag_key='feature_flag_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(semantic_patch_with_comment),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_feature_flag(self):
        """Test case for patch_feature_flag

        Perform a partial update to a feature.
        """
        patch_comment = openapi_server.PatchFeatureFlagRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}/{feature_flag_key}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_comment),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_flag_config_scheduled_change(self):
        """Test case for patch_flag_config_scheduled_change

        Updates an existing scheduled-change on a feature flag in an environment.
        """
        flag_config_scheduled_changes_patch_body = openapi_server.PatchFlagConfigScheduledChangeRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/scheduled-changes/{scheduled_change_id}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', scheduled_change_id='scheduled_change_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(flag_config_scheduled_changes_patch_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_apply_approval_request(self):
        """Test case for post_apply_approval_request

        Apply approval request for a feature flag config
        """
        approval_request_apply_config_body = openapi_server.PostApplyApprovalRequestRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/approval-requests/{approval_request_id}/apply'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', approval_request_id='approval_request_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(approval_request_apply_config_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_approval_request(self):
        """Test case for post_approval_request

        Create an approval request for a feature flag config
        """
        approval_request_config_body = openapi_server.PostApprovalRequestRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/approval-requests/{approval_request_id}'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', approval_request_id='approval_request_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(approval_request_config_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_feature_flag(self):
        """Test case for post_feature_flag

        Creates a new feature flag.
        """
        feature_flag_body = openapi_server.PostFeatureFlagRequest()
        query_string = [('clone', 'clone_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/flags/{project_key}'.format(project_key='project_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(feature_flag_body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_flag_config_scheduled_changes(self):
        """Test case for post_flag_config_scheduled_changes

        Creates a new scheduled change for a feature flag.
        """
        flag_config_scheduled_changes_post_body = openapi_server.PostFlagConfigScheduledChangesRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/scheduled-changes'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(flag_config_scheduled_changes_post_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_review_approval_request(self):
        """Test case for post_review_approval_request

        Review approval request for a feature flag config
        """
        approval_request_review_config_body = openapi_server.PostReviewApprovalRequestRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/flags/{feature_flag_key}/environments/{environment_key}/approval-requests/{approval_request_id}/review'.format(project_key='project_key_example', feature_flag_key='feature_flag_key_example', environment_key='environment_key_example', approval_request_id='approval_request_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(approval_request_review_config_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
