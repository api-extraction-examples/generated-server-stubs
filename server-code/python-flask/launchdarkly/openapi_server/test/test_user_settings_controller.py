import unittest

from flask import json

from openapi_server.models.put_flag_setting_request import PutFlagSettingRequest  # noqa: E501
from openapi_server.models.semantic_patch_operation import SemanticPatchOperation  # noqa: E501
from openapi_server.models.user_flag_setting import UserFlagSetting  # noqa: E501
from openapi_server.models.user_flag_settings import UserFlagSettings  # noqa: E501
from openapi_server.models.user_targeting_expiration_on_flags_for_user import UserTargetingExpirationOnFlagsForUser  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserSettingsController(BaseTestCase):
    """UserSettingsController integration test stubs"""

    def test_get_expiring_user_targets_for_user(self):
        """Test case for get_expiring_user_targets_for_user

        Get expiring dates on flags for user
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{user_key}/expiring-user-targets/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_flag_setting(self):
        """Test case for get_user_flag_setting

        Fetch a single flag setting for a user by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{environment_key}/{user_key}/flags/{feature_flag_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example', feature_flag_key='feature_flag_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_flag_settings(self):
        """Test case for get_user_flag_settings

        Fetch a single flag setting for a user by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{environment_key}/{user_key}/flags'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_expiring_user_targets_for_flags(self):
        """Test case for patch_expiring_user_targets_for_flags

        Update, add, or delete expiring user targets for a single user on all flags
        """
        semantic_patch_with_comment = {"instructions":[{"kind":"removeUserTargets"},{"kind":"removeUserTargets"}],"comment":"This is a comment string"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{user_key}/expiring-user-targets/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(semantic_patch_with_comment),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_flag_setting(self):
        """Test case for put_flag_setting

        Specifically enable or disable a feature flag for a user based on their key.
        """
        user_settings_body = openapi_server.PutFlagSettingRequest()
        headers = { 
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/users/{project_key}/{environment_key}/{user_key}/flags/{feature_flag_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_key='user_key_example', feature_flag_key='feature_flag_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(user_settings_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
