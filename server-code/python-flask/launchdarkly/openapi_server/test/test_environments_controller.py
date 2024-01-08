import unittest

from flask import json

from openapi_server.models.environment import Environment  # noqa: E501
from openapi_server.models.environment_post import EnvironmentPost  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEnvironmentsController(BaseTestCase):
    """EnvironmentsController integration test stubs"""

    def test_delete_environment(self):
        """Test case for delete_environment

        Delete an environment in a specific project.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/environments/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_environment(self):
        """Test case for get_environment

        Get an environment given a project and key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/environments/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_environment(self):
        """Test case for patch_environment

        Modify an environment by ID. If you try to patch the environment by setting both required and requiredApprovalTags, it will result in an error. Users can specify either required approvals for all flags in an environment or those with specific tags, but not both. Only customers on an Enterprise plan can require approval for flag updates with either mechanism.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/environments/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_environment(self):
        """Test case for post_environment

        Create a new environment in a specified project with a given name, key, and swatch color.
        """
        environment_body = {"color":"417505","confirmChanges":False,"defaultTtl":0.0,"name":"Development","requireComments":False,"defaultTrackEvents":False,"secureMode":False,"key":"dev","tags":["tag1","tag2"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/environments'.format(project_key='project_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(environment_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_environment_mobile_key(self):
        """Test case for reset_environment_mobile_key

        Reset an environment's mobile key. The optional expiry for the old key is deprecated for this endpoint, so the old key will always expire immediately.
        """
        query_string = [('expiry', 56)]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/environments/{environment_key}/mobileKey'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_environment_sdk_key(self):
        """Test case for reset_environment_sdk_key

        Reset an environment's SDK key with an optional expiry time for the old key.
        """
        query_string = [('expiry', 56)]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/projects/{project_key}/environments/{environment_key}/apiKey'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
